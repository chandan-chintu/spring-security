package com.security.example.spring_security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

//@Configuration
//@EnableWebSecurity
//@EnableMethodSecurity
public class SpringSecurityConfig {

//    // user creation
//    @Bean
//    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
//        // In memory security - creating users in memory
//        UserDetails adminUser = User.withUsername("Chandan")
//                .password(passwordEncoder.encode("test123"))
//                .roles("ADMIN", "USER")
//                .build();
//
//        UserDetails normalUser = User.withUsername("Chintu")
//                .password(passwordEncoder.encode("test123"))
//                .roles("USER")
//                .build();
//
//        return new InMemoryUserDetailsManager(adminUser, normalUser);
//    }
//
//    // Configuring HttpSecurity
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//        return httpSecurity.csrf().disable()
//                .authorizeHttpRequests()
//                .requestMatchers("/auth/welcome").permitAll()
//                .and()
//                .authorizeHttpRequests()
//                .requestMatchers("/auth/user/userprofile").authenticated()
//                .and()
//                .authorizeHttpRequests()
//                .requestMatchers("/auth/admin/adminProfile").authenticated()
//                .and().formLogin()
//                .and().build();
//    }
//
//    //password encoding
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
}
