package com.elan.exercise.Entity.ManyToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="aspirant_tbl")
public class Aspirant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="name")
    private  String name;
    @Column(name = "age")
    private String age;
    @Column(name = "depart")
    private String depart;


    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "aspirant_course",

    joinColumns={ @JoinColumn(name = "aspirant_id",referencedColumnName = "id")},
    inverseJoinColumns = {  @JoinColumn(name = "course_id",referencedColumnName = "id")})

    @JsonManagedReference
    private Set<Course>courses;

}
