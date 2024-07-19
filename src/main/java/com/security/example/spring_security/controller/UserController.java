package com.security.example.spring_security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class UserController {

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome this is visible to all(permit all), and this is not secure";
    }

    @GetMapping("/user/userprofile")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public String userProfile(){
        return "Welcome to USER profile, this is secure one and accessed by normal user only";
    }

    @GetMapping("/admin/adminProfile")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String adminProfile(){
        return "Welcome to ADMIN profile, this is secure one and accessed by admin only";
    }

}
