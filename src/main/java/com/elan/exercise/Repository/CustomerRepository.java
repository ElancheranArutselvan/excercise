package com.elan.exercise.Repository;

import com.elan.exercise.DTO.OrderResponse;
import com.elan.exercise.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("select new com.elan.exercise.DTO.OrderResponse (c.name,p.productName) from Customer c Join c.products p")
    public List<OrderResponse> joinInfo();
}
