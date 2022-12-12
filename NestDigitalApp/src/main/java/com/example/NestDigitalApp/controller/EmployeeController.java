package com.example.NestDigitalApp.controller;

import com.example.NestDigitalApp.dao.EmployeeDao;
import com.example.NestDigitalApp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao dao;
    @GetMapping("/")
    public String MainPage()
    {return "Welcome to main page";}


    @PostMapping(path="/login",consumes = "application/json",produces = "application/json")
    public String login(@RequestBody Employee e)
   {
        return "login page";}

    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> EmpAdd(@RequestBody Employee e) {
        System.out.println(e.getEmpcode());
        System.out.println(e.getName().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getSalary().toString());
        System.out.println(e.getPhnNo().toString());
        System.out.println(e.getMail().toString());
        System.out.println(e.getUsername().toString());
        dao.save(e);
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;
    }

    @PostMapping(path="/search",consumes = "application/json",produces = "application/json")
    public List<Employee> EmpSearch(@RequestBody Employee e) {
        String empcode = String.valueOf(e.getEmpcode());
        System.out.println(e.getEmpcode());
        return (List<Employee>) dao.SearchEmployee(e.getEmpcode());
    }

    @PostMapping(path="/delete",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> EmpDelete(@RequestBody Employee e) {
        String id = String.valueOf(e.getId());
        System.out.println(id);
        dao.deleteEmployee(e.getId());
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;
    }
    @GetMapping("/viewprofile")
    public List<Employee> EmpViewProf()
    {return (List<Employee>) dao.findAll();}
}
