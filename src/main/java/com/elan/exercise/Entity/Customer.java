package com.elan.exercise.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private  int id;
    @Column(name = "name")
    private String name;
    @Column(name = "gender")
    private String gender;
    @Column(name = "mail_id")
    private String mailId;
    @Column(name = "mobile")
    private long mobile;

    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
    @JoinColumn(name="cp_fk", referencedColumnName = "id")
    private List<Product>products;
}
