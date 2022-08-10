package com.example.demotestweb.controller;

import com.example.demotestweb.entity.TestDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {

    @Autowired
    private TestDemo testDemo;

    @GetMapping("/second")
    public ResponseEntity<TestDemo> getSecondTestDemo(){
        System.out.println("SecondController");
        System.out.println("text = " + testDemo.getText());
        return ResponseEntity.ok(testDemo);
    }
}
