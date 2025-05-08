package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "role-select";
    }

    @GetMapping("/login")
    public String login(@RequestParam(required = false) String role, HttpSession session) {
        if (role != null) {
            session.setAttribute("selectedRole", role);
        }
        return "login";
    }
} 