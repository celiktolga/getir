package com.demo.getir.controller;

import com.demo.getir.model.User;
import com.demo.getir.repository.UserRepository;
import com.demo.getir.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> list() {
        return userService.findAll();
    }

    @PostMapping("/users")
    public ResponseEntity<User> createTutorial(@RequestBody User user) {
        try {
            User currentUser = userService.save(user);
            return new ResponseEntity<>(currentUser, HttpStatus.CREATED);
        } catch (Exception e) {
            System.out.println("Error:"+e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}