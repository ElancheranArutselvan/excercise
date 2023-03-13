package com.elan.exercise.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Product {

    @Id
    @Column(name ="product_id")
    private int productId;
    @Column(name ="product_name")
    private  String productName;
    @Column(name ="quantity")
    private String quantity;
    @Column(name ="price")
    private int price;

   @ManyToOne
//    @JoinColumn(name = "pc_fk",referencedColumnName = "product_id")
    private Customer customer;
}
