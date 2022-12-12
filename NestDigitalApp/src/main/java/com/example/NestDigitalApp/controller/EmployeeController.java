package com.example.NestDigitalApp.controller;

import com.example.NestDigitalApp.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/")
    public String MainPage()
    {return "Welcome to main page";}


    @PostMapping("/login")
    public String login()
    {return "login page";}

    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public String EmpAdd(@RequestBody Employee e)
    {
        System.out.println(e.getEmpcode());
        System.out.println(e.getName().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getSalary().toString());
        System.out.println(e.getPhnNo().toString());
        System.out.println(e.getMail().toString());
        System.out.println(e.getUsername().toString());
        return "Employee Added successfully";}

    @PostMapping("/search")
    public String EmpSearch()
    {return "search done";}

    @PostMapping("/delete")
    public String EmpDelete()
    {return "delete done";}

    @GetMapping("/viewprofile")
    public String EmpViewProf()
    {return " Profile";}
}
