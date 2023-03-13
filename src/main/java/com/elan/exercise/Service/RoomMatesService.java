package com.elan.exercise.Service;

import com.elan.exercise.DTO.RoomMatesDTO;
import com.elan.exercise.Entity.RoomMates;
import com.elan.exercise.Repository.RoomMatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RoomMatesService {

    @Autowired
    private RoomMatesRepository roomMatesRepository;

    ArrayList<RoomMatesDTO> roomMatesDTOList = new ArrayList<>();
    ArrayList<RoomMates>roomMatesList = new ArrayList<>();

    public String save(ArrayList<RoomMatesDTO> roomMatesDTOList) {
        RoomMates roomMates = new RoomMates();
        for (RoomMatesDTO listObj : roomMatesDTOList) {
            roomMates.setId(listObj.getId());
            roomMates.setName(listObj.getName());
            roomMates.setAge(listObj.getAge());
            roomMates.setContact(listObj.getContact());
            roomMates.setCity(listObj.getCity());
            roomMates.setCompany(listObj.getCompany());
            roomMatesRepository.saveAndFlush(roomMates);
        }
        return "saved Successfully";
    }

    public String update(ArrayList<RoomMatesDTO> roomMatesDTOList) {
        RoomMates roomMates = new RoomMates();
        for (RoomMatesDTO listObj : roomMatesDTOList) {
            roomMates.setId(listObj.getId());
            roomMates.setName(listObj.getName());
            roomMates.setAge(listObj.getAge());
            roomMates.setContact(listObj.getContact());
            roomMates.setCity(listObj.getCity());
            roomMates.setCompany(listObj.getCompany());
            if (listObj.getId()>0) {
                roomMatesRepository.saveAndFlush(roomMates);
            }
        }
        return "saved Successfully";
    }
    public ArrayList<RoomMates> getAll(){
   roomMatesRepository.findAll().forEach(roomMates -> roomMatesList.add(roomMates));
   return roomMatesList;
    }

}