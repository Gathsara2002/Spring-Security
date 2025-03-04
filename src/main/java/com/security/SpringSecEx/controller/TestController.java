package com.security.SpringSecEx.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Gathsara
 * created : 3/4/2025 -- 11:43 AM
 **/

@RestController
public class TestController {
    @GetMapping("/")
    public String checkAPIHealth(HttpServletRequest request) {
        HttpSession session = request.getSession(true);
        return "API work "+session.getId();
    }
}
