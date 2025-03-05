package com.security.SpringSecEx.service;

import com.security.SpringSecEx.model.User;
import com.security.SpringSecEx.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : Gathsara
 * created : 3/5/2025 -- 1:06 PM
 **/

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    public User register(User user) {
        return repo.save(user);
    }
}
