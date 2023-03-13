package com.elan.exercise.Entity.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "course_table")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private  String abbreviation;
    private int modules;
    private double fees;

    @ManyToMany(mappedBy = "courses",fetch = FetchType.LAZY)

    @JsonBackReference
    private Set<Aspirant> aspirants;
}
