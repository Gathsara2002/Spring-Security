package com.security.SpringSecEx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Gathsara
 * created : 3/4/2025 -- 11:43 AM
 **/

@RestController
public class TestController {
    @GetMapping("/")
    public String checkAPIHealth() {
        return "API work";
    }
}
