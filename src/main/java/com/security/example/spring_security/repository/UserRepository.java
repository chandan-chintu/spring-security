package com.security.example.spring_security.repository;

import com.security.example.spring_security.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {

    public UserEntity findByUsername(String name);// query with attributes
}
