package com.security.SpringSecEx.controller;

import com.security.SpringSecEx.model.User;
import com.security.SpringSecEx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Gathsara
 * created : 3/5/2025 -- 1:03 PM
 **/

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserService service;

    @PostMapping("/save")
    public User register(@RequestBody User user) {
        return service.register(user);
    }
}
