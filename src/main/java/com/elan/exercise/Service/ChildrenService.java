package com.elan.exercise.Service;

import com.elan.exercise.DTO.ChildrenDTO;
import com.elan.exercise.Entity.Children;
import com.elan.exercise.Repository.ChildrenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ChildrenService {

    @Autowired
    private ChildrenRepository childrenRepository;

     ArrayList<Children>childrenList = new ArrayList<>();
     ArrayList<ChildrenDTO>childrenDTOList = new ArrayList<>();

    public String save(ArrayList<ChildrenDTO> childrenDTOList) {
        Children children = new Children();
        for (ChildrenDTO listObj : childrenDTOList) {
            children.setId(listObj.getId());
            children.setName(listObj.getName());
            children.setAge(listObj.getAge());
            children.setGender(listObj.getGender());
            children.setFatherName(listObj.getFatherName());
            children.setMotherName(listObj.getMotherName());
            childrenRepository.saveAndFlush(children);
        }
        return "saved Successfully";
    }
    public ArrayList<Children> getAll(){
        childrenRepository.findAll().forEach(children -> childrenList.add(children));
        return childrenList;
    }

    public Children getById(long id){
        return childrenRepository.findById(id).orElse(null);
    }
    public ArrayList<Children> findBYAge(int age){
        return  childrenRepository.findByAge(age);
    }
}
