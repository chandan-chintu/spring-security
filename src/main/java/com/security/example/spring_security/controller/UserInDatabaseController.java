package com.security.example.spring_security.controller;

import com.security.example.spring_security.entity.UserEntity;
import com.security.example.spring_security.requestdto.UserRequestDto;
import com.security.example.spring_security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userindb")
public class UserInDatabaseController {

    @Autowired
    private UserService userService;

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome this API is accessible and user security is checked based on In database mechanism";
    }

    @PostMapping("/add")
    public String addUser(@RequestBody UserRequestDto userRequestDto){
        String response = userService.addUser(userRequestDto);
        return response;
    }

}
