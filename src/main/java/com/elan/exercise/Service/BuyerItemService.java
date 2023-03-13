package com.elan.exercise.Service;

import com.elan.exercise.Entity.OneToOne.Buyer;
import com.elan.exercise.Entity.OneToOne.Item;
import com.elan.exercise.Repository.BuyerRepository;
import com.elan.exercise.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BuyerItemService {

    @Autowired
    private BuyerRepository buyerRepository;
    @Autowired
    private ItemRepository itemRepository;

//   List<Item>items=new ArrayList<>();
//
//    public BuyerItemService(BuyerRepository buyerRepository,ItemRepository itemRepository){
//        this.buyerRepository=buyerRepository;
//        this.itemRepository=itemRepository;
//    }
//post.getComments().stream().forEach(c -> c.setPost(post));
    public String save(Buyer buyer){
        buyerRepository.saveAndFlush(buyer);
        for(Item obj: buyer.getItems()){
            obj.setBuyer(buyer);
            itemRepository.saveAndFlush(obj);
        }
        return "Saved";

    }

    public List<Buyer> getAll(){
        return buyerRepository.findAll();
    }

    public Optional<Buyer> getById(int buyerId){
        return buyerRepository.findById(buyerId);

    }
    public String deleteById(int buyerId){
        buyerRepository.deleteById(buyerId);
        return "deleted";
    }
//
//    @Query(value = "select*from buyer_data where gender =:Male", nativeQuery = true)
//    Optional<Buyer> findBygender(String gender);
}
