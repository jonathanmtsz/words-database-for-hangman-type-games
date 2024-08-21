package com.jntn11.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class Palavras {

    @GetMapping("/palavra")
    public String palavra(){
        String randomword = "...";
        return randomword;
    }
}
