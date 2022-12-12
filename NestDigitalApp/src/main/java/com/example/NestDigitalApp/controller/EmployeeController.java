package com.example.NestDigitalApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/")
    public String MainPage()
    {return "Welcome to main page";}


    @PostMapping("/login")
    public String login()
    {return "login page";}

    @PostMapping("/add")
    public String EmpAdd()
    {return "Employee Added successfully";}

    @PostMapping("/search")
    public String EmpSearch()
    {return "search done";}

    @PostMapping("/delete")
    public String EmpDelete()
    {return "delete done";}
}
