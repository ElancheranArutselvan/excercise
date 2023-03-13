package com.elan.exercise.Controller;



import com.elan.exercise.Entity.OneToOne.Buyer;
import com.elan.exercise.Service.BuyerItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class BuyerItemController {

    @Autowired
    private BuyerItemService buyerItemService;

    @PostMapping("/saveBuyer")
    public String save(@RequestBody Buyer buyer) {
        buyerItemService.save(buyer);
        return "saved";
    }

    @GetMapping("/getBuyer")
    public List<Buyer> getAll() {
       return buyerItemService.getAll();
    }
    @GetMapping("/getBuyer/{buyerId}")
    public Optional<Buyer> getById(@PathVariable int buyerId) {
        return buyerItemService.getById(buyerId);
    }
    @PutMapping("/updateBuyer/{buyerId}")
    public String update(@PathVariable int buyerId,@RequestBody Buyer buyer){
        buyerItemService.save(buyer);
        return "Updated";
    }

    @DeleteMapping("/deleteBuyer/{buyerId}")
    public String delete(@PathVariable int buyerId){
        buyerItemService.deleteById(buyerId);
        return "deleted";
    }

}