package com.elan.exercise.Repository;

import com.elan.exercise.Entity.OneToOne.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item,Integer> {
}
