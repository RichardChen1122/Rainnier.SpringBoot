package com.example.demo;

import com.example.demo.domain.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.core.Ordered;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GetController {
    private Map<String,Object> param = new HashMap<>();

    @GetMapping(path="/{city_id}/{user_id}")
    public Object findUser(@PathVariable("city_id")String cityID,@PathVariable("user_id")String userID){
        param.clear();

        param.put("CityID",cityID);
        param.put("userId",userID);

        return param;
    }

    @PostMapping("/v1/save_user")
    public Object saveUser(@RequestBody User user){
        param.clear();
        param.put("user",user);

        return param;
    }

    @Autowired
    private JsonData.ServerSettings serverSettings;


    @GetMapping("/v1/api/testproperties")
    public Object testProperties(){

        return serverSettings;
    }
}
