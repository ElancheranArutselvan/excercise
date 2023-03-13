package com.elan.exercise.Entity.OneToOne;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="buyer_data")
public class Buyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String gender;

    @OneToMany(mappedBy = "buyer",fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
    private List<Item> items;


}