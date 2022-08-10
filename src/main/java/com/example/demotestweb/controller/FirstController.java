package com.example.demotestweb.controller;

import com.example.demotestweb.entity.TestDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @Autowired
    private TestDemo testDemo;

    @GetMapping("/first")
    public ResponseEntity<TestDemo> getFirstTestDemo(){
        System.out.println("FirstController");
        testDemo.setText("I am from First Controller");
        System.out.println("text = " + testDemo.getText());
        return ResponseEntity.ok(testDemo);
    }
}
