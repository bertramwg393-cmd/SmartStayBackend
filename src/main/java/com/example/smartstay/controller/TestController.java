package com.example.smartstay.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String sayHello() {
        return "SmartStay 系統已經連線成功，且正在運作中！";
    }
}
