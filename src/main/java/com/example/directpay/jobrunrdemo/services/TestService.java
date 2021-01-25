package com.example.directpay.jobrunrdemo.services;

import org.springframework.stereotype.Service;

@Service
public class TestService implements CommonService {
    @Override
    public String go() {
        return "Go method running";
    }

    @Override
    public int calculate(int x, int y) {
        return x+y;
    }
}
