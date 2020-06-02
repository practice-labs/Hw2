package com.example.hw2.Resource;

import com.example.hw2.Service.UserService;
import com.example.hw2.model.USER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserResource {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public USER getUser(){
        return userService.getUser();
    }
}
