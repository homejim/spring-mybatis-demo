package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("demo")
public class DemoController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public ResponseEntity<User> test() {
        User user = userService.load(2);
        return ResponseEntity.ok(user);
    }

    @RequestMapping("/hello2")
    public ResponseEntity<User> test2() {
        User user = userService.loadByName("jim");
        return ResponseEntity.ok(user);
    }
}
