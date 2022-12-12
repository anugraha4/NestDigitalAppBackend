package com.example.NestDigitalApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping
    public String MainPage()
    {return "Welcome to main page";}


    @PostMapping
    public String login()
    {return "login page";}
}
