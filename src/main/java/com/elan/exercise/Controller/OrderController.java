package com.elan.exercise.Controller;

import com.elan.exercise.DTO.OrderRequest;
import com.elan.exercise.DTO.OrderResponse;
import com.elan.exercise.Entity.Customer;
import com.elan.exercise.Repository.CustomerRepository;
import com.elan.exercise.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest orderRequest){
        return customerRepository.save(orderRequest.getCustomer());
    }

    @GetMapping("/getAllOrder")
    public List<Customer> getAllOrder(){
        return customerRepository.findAll();
    }
    @GetMapping("/getJoinInfo")
    public List<OrderResponse> getJoinInfo(){
        return customerRepository.joinInfo();
    }
}
