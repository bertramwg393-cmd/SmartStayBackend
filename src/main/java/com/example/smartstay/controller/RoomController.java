package com.example.smartstay.controller;

import com.example.smartstay.model.Room;
import com.example.smartstay.repository.RoomRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/rooms") // <--- 這裡是所有路徑的「總開頭」
public class RoomController {

    // 1. 改成 final 限制，代表這台機器一旦裝上去就不能被換掉（更安全）
    private final RoomRepository roomRepository;

    // 2. 不要掛 @Autowired，而是寫一個建構子，讓 Spring 自動把機器傳進來
    public RoomController(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    // 路徑會變成: http://localhost:8080/api/rooms
    @GetMapping
    public List<Room> getAllRooms() {
        return roomRepository.findAll(); // 資料庫名稱是 Postgres
    }

    // 路徑會變成: http://localhost:8080/api/rooms/init
    @GetMapping("/init")
    public String initData() {
    	
    	if(roomRepository.count() > 0) {
    		return "資料庫已經有資料，跳過初始化。";
    	}
    	
        Room r1 = new Room();
        r1.setRoomNumber("101");
        r1.setRoomType("雙人房");
        r1.setPrice(new BigDecimal("2000.0"));

        Room r2 = new Room();
        r2.setRoomNumber("201");
        r2.setRoomType("豪華四人房");
        r2.setPrice(new BigDecimal("4500.0"));

        Room r3 = new Room();
        r3.setRoomNumber("301");
        r3.setRoomType("總統套房");
        r3.setPrice(new BigDecimal("10000.0"));

        roomRepository.save(r1);
        roomRepository.save(r2);
        roomRepository.save(r3);

        return "測試房間資料已成功寫入資料庫！";
    }

    // 已與組員討論變更路徑: http://localhost:8080/api/rooms/status
    @GetMapping("/status")
    public String testConnection() {
        return "SmartStay 後端連線已啟動！資料庫工作正常。";
    }

    // 用 delete 方法來刪除資料
    @DeleteMapping("/delete-test")
    public String deleteRoomData() {
        // 先建立一個我們要刪除的目標物件 （假設要刪除 101 房的資料型態）
        Room targetRoom = new Room();
        targetRoom.setRoomNumber("101");

        // 叫倉庫管理員把這間房刪掉（注意：實務上通常會根據 ID 刪除，這裡先體驗 delete 方法）
        // roomRepository.delete(targetRoom);

        roomRepository.deleteById(1);
        return "房間資料101已成功從資料庫刪除！";
    }

}
