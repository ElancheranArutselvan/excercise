package com.elan.exercise.DTO;

import lombok.Data;

import javax.persistence.Column;

@Data
public class ChildrenDTO {

    private long id;
    private String name;
    private int age;
    private String gender;
    private String fatherName;
    private String motherName;
}