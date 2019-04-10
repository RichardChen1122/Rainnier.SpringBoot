package com.example.demo;

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
}
