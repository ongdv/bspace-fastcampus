package com.ongdv.fastcampuspractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/api/main")
    public String main() {
        return "Hello World";
    }
}
