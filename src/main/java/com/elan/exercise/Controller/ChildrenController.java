package com.elan.exercise.Controller;

import com.elan.exercise.DTO.ChildrenDTO;
import com.elan.exercise.Entity.Children;
import com.elan.exercise.Service.ChildrenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ChildrenController {

    @Autowired
    private ChildrenService childrenService;

    @PostMapping("/saveChildren")
    public String save(@RequestBody ArrayList<ChildrenDTO>childrenDTOList){
        childrenService.save(childrenDTOList);
        return "saved successfully";
    }
    @PutMapping("/updateChildren/{id}")
    public String update(@PathVariable long id, @RequestBody ArrayList<ChildrenDTO>childrenDTOList) {
        childrenService.save(childrenDTOList);
        return "updated successfully";
    }
    @GetMapping("/getAllChildren")
    public ArrayList<Children> getAll(){
        return childrenService.getAll();
    }

    @GetMapping("/getChildrenAge/{age}")
    private ArrayList<Children> getAll(@PathVariable int age){
        return childrenService.findBYAge(age);
    }
    @GetMapping("/getChildrenbyId/{id}")
    private Children getById(@PathVariable long id){
        return childrenService.getById(id);
    }

}
