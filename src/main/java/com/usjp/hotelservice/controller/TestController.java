package com.usjp.hotelservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/tester")
    public String testerClient() {
        return "hotel Client Service 1 Works";
    }
}
