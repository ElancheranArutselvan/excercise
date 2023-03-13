package com.elan.exercise.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Childrens")
public class Children {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="age")
    private int age;
    @Column(name="gender")
    private String gender;
    @Column(name="father_name")
    private String fatherName;
    @Column(name="mother_name")
    private String motherName;
}
