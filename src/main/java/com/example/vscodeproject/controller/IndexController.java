package com.example.vscodeproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequiredArgsConstructor
public class IndexController {

    @GetMapping
    @ResponseBody
    public String Index() {
        return new String("Index Page");    
    }

    @GetMapping("/test")
    @ResponseBody
    public String TEST() {
        return "test";
    }
    
    
}
