package com.example.smartstay.controller;

import com.example.smartstay.model.Room;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String sayHello() {
        return "SmartStay 系統已經連線！";
    }

    @GetMapping("/test-data")
    public List<Room> getTestData() {
        List<Room> roomList = new ArrayList<>();

        Room room1 = new Room();
        room1.setRoomNumber("101");
        room1.setRoomType("雙人房");
        room1.setPrice(2000.0);

        roomList.add(room1);

        return roomList;
    }
}