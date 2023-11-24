package com.main.lacj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class LacjController {
//     index.html > login page
    
    @GetMapping("/regist")
    public String regist() {
        
        return "regist";
    }

    @GetMapping("/mypage")
    public String mypage() {

        return "mypage";
    }

    @PostMapping("/mainlist")
    public String mainlist() {

        return "mainlist";
    }

}