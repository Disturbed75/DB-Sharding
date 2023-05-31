package com.sashafilth.controller;

import com.sashafilth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class Controller {

    private UserService userService;

    @Autowired
    public Controller(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<?> addUsers() {
        userService.addUsers();
        return ResponseEntity.ok().build();
    }

    @PostMapping("/categories")
    public ResponseEntity<?> addCategories() {
        userService.addCategories();
        return ResponseEntity.ok().build();
    }
}
