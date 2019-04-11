package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class SampleController {
    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "Hello World!";
    }

    @RequestMapping("/test")
    public Map<String,String> testMap(){
        Map<String,String> map = new HashMap<>();
        map.put("name","xdclass");

        return map;

    }

    @GetMapping("/testjson")
    public Object tesJosn(){
        User user = new User(11,"test","1001010", new Date());
        System.out.println("tes");
        return user;

    }
}
