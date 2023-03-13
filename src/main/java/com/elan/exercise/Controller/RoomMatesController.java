package com.elan.exercise.Controller;

import com.elan.exercise.DTO.RoomMatesDTO;
import com.elan.exercise.Entity.RoomMates;
import com.elan.exercise.Service.RoomMatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class RoomMatesController {

    @Autowired
    private RoomMatesService roomMatesService;

    @PostMapping("/saveRoomMates")
    public String save(@RequestBody ArrayList<RoomMatesDTO>roomMatesDTOList){
        roomMatesService.save(roomMatesDTOList);
        return "saved Successfully";
    }

    @PutMapping("/updateRoomMates/{id}")
    public String update(@PathVariable int id, @RequestBody ArrayList<RoomMatesDTO>roomMatesDTOList){
        roomMatesService.update(roomMatesDTOList);
        return "saved Successfully";
    }

    @GetMapping("/getAllMates")
    public ArrayList<RoomMates> getAll(){
        return roomMatesService.getAll();
    }
}
