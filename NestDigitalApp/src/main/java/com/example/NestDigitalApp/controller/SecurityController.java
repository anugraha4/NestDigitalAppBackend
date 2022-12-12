package com.example.NestDigitalApp.controller;

import com.example.NestDigitalApp.dao.SecurityDao;
import com.example.NestDigitalApp.model.Security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class SecurityController {

    @Autowired
    private SecurityDao sdao;

    @PostMapping("/seclogin")
    public String SecurityLogin() {
        return "security login success";
    }

    @PostMapping(path="/secadd",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> SecurityAdd(@RequestBody Security s)
    {

        sdao.save(s);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }

    @PostMapping(path="/secview",consumes = "application/json",produces = "application/json")
    public List<Security> ViewSecurity(@RequestBody Security s) {

        return (List<Security>) sdao.viewSecurity(s.getId());
    }

    @PostMapping(path="/secsearch",consumes = "application/json",produces = "application/json")
    public List<Security> SecuritySearch(@RequestBody Security s)

    {
        String secempcode=String.valueOf(s.getSecempcode());
        System.out.println(s.getSecempcode());

        return (List<Security>) sdao.SearchSecurity(s.getSecempcode());
    }

    @PostMapping(path="/secdelete",consumes = "application/json",produces = "application/json")
    public HashMap<String, String> SecurityDelete(@RequestBody Security s) {
        {
            String sid=String.valueOf(s.getId());
            System.out.println(sid);
            sdao.deleteSecurity(s.getId());
            HashMap<String,String>map=new HashMap<>();
            map.put("status","success");
            return map;
        }


    }

}
