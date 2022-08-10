package com.example.demotestweb.entity;

import org.springframework.stereotype.Component;

@Component
public class TestDemo {

    private String text = "null";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
