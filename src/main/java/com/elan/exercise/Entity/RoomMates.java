package com.elan.exercise.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="room_mates")
public class RoomMates {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="age")
    private int age;
    @Column(name="contact")
    private long contact;
    @Column(name="city")
    private String city;
    @Column(name="company")
    private String company;
}
