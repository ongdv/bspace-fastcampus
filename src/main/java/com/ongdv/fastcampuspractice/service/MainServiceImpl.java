package com.ongdv.fastcampuspractice.service;

import org.springframework.stereotype.Service;

@Service
public class MainServiceImpl implements MainService {
    public String sayHello(String name) {
        return "Hello" + name;
    }
}
