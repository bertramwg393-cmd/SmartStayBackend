package com.example.smartstay.repository;

import com.example.smartstay.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
    // 繼承 JpaRepository 後，Spring Boot 會自動幫你寫好所有的新增、刪除、修改、查詢功能！
}
