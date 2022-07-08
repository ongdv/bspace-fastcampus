package com.ongdv.fastcampuspractice.controller;

import com.ongdv.fastcampuspractice.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final MainService mainServiceImpl;

    @GetMapping("/api/main")
    public String main(@RequestParam String name) {
        return mainServiceImpl.sayHello(name);
    }
}
