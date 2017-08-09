package com.example.demo.service;


public class HomeService {

    private String message;

    public HomeService(String message) {
        this.message = message;
    }

    public void doSomething() {
        System.out.println(message);
    }

}
