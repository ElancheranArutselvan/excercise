package com.elan.exercise.Entity.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.OnDelete;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "item_details")
public class Item{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "item_name")
    private String itemName;
    private String description;
    private int price;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "buyer_id",referencedColumnName = "id")
    @JsonIgnore
    private Buyer buyer;

}
