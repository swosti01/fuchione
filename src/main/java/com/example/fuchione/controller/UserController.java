package com.example.fuchione.controller;

import com.example.fuchione.model.User;
import com.example.fuchione.response.BasicUserResponse;
import com.example.fuchione.service.Interfaces.UserService;
import com.example.fuchione.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
public class UserController {


    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/add")
    public BasicUserResponse addUser(@RequestBody User userData){
        BasicUserResponse basicUserResponse = userService.addUser(userData);
        return  basicUserResponse;
    }

    @PostMapping("/update")
    public BasicUserResponse updateUser(@RequestBody User userData){
        BasicUserResponse basicUserResponse = userService.updateUser(userData);
        return  basicUserResponse;
    }
}
