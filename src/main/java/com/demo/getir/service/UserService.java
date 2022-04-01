package com.demo.getir.service;

import com.demo.getir.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User save(User user);
}
