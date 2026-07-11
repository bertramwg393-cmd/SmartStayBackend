package com.example.smartstay.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    // 攔截所有類型的 Exception，避免網頁噴出技術錯誤代碼
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGlobalException(Exception e) {
        // 這裡回傳給前端一個友善的訊息
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("系統發生了一點問題，請稍候再試：" + e.getMessage());
    }
}