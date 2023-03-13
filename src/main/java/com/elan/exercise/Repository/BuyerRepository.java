package com.elan.exercise.Repository;

import com.elan.exercise.Entity.OneToOne.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyerRepository extends JpaRepository<Buyer, Integer> {
}
