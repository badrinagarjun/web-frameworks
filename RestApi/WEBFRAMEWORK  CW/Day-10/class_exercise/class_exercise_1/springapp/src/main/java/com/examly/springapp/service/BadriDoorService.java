package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.BadriDoor;
import com.examly.springapp.repository.BadriDoorRepo;

@Service
public class BadriDoorService<DoorRepo, Door> {
    @Autowired
    private DoorRepo doorRepo;

    public Door postData(Door door) {
        return ((Object) doorRepo).save(door);
    }

    public List<Door> getBycolor(String color) {
        return ((Object) doorRepo).findByColor(color);
    }

    public Door updateDetail(int doorid, Door door) {
        return doorRepo.save(door);
    }

    public boolean deleteDoor(int doorid) {
        ((Object) doorRepo).deleteById(doorid);
        return true;
    }

    public List<Door> getByDoorType(String doortype) {
        return doorRepo.findByDoorType(doortype);
    }

    public List<Door> getAllDetails() {

        return doorRepo.findAll();
    }

    public Door getDetailsById(int doorid) {
        return doorRepo.findById(doorid).orElse(null);
    }

}