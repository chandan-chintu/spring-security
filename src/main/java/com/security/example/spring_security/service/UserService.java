package com.security.example.spring_security.service;

import com.security.example.spring_security.entity.UserEntity;
import com.security.example.spring_security.repository.UserRepository;
import com.security.example.spring_security.requestdto.UserRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String addUser(UserRequestDto userRequestDto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(userRequestDto.getUsername());
        userEntity.setPassword(new BCryptPasswordEncoder().encode(userRequestDto.getPassword()));

        userEntity = userRepository.save(userEntity);

        return "User added successfully";
    }
}
