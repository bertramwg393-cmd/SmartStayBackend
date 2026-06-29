package com.example.smartstay.controller;

import com.example.smartstay.model.Room;
import com.example.smartstay.repository.RoomRepository; // 👈 請確認你的 Repository 套件路徑
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/rooms") // 👈 規定所有這隻 Controller 的網址開頭都是 /api/rooms
public class RoomController {

    @Autowired
    private RoomRepository roomRepository; // 注入你的 Repository 來操作資料庫

    // 1. 查詢所有房間的網址：http://localhost:8080/api/rooms
    @GetMapping
    public List<Room> getAllRooms() {
        return roomRepository.findAll(); // 真正去 H2 資料庫撈出所有房間
    }

    // 2. 幫你一秒灌入測試資料的網址：http://localhost:8080/api/rooms/init
    @GetMapping("/init")
    public String initData() {
        Room r1 = new Room();
        r1.setRoomNumber("101");
        r1.setRoomType("雙人房");
        r1.setPrice(2000.0);

        Room r2 = new Room();
        r2.setRoomNumber("201");
        r2.setRoomType("豪華四人房");
        r2.setPrice(4500.0);

        roomRepository.save(r1); // 真正寫入資料庫檔案！
        roomRepository.save(r2); // 真正寫入資料庫檔案！

        return "測試房間資料已成功寫入 H2 資料庫！";
    }
}
