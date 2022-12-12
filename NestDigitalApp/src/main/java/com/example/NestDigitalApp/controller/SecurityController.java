package com.example.NestDigitalApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @PostMapping("/seclogin")
    public String SecurityLogin()
    {
        return "security login success";
    }

    @PostMapping("/secadd")
    public String SecurityAdd()
    {
        return "added";
    }

    @GetMapping("/secview")
    public String ViewSecurity()
    {
        return "view all security";
    }

    @PostMapping("/secsearch")
    public String SecuritySearch()
    {
        return "security search done";
    }

    @PostMapping("/secdelete")
    public String SecurityDelete()
    {
        return "deleted successfully";
    }



}
