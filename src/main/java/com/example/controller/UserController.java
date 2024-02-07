package com.example.controller;

import com.example.entity.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        User newUser=new User();
        newUser.setId(user.getId());
        newUser.setFirstName(user.getFirstName());
        newUser.setLastName(user.getLastName());
        newUser.setEmail(user.getEmail());
        newUser.setPassword(user.getPassword());
        User save = userRepository.save(newUser);
        return save;
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user) {

        User user1=new User(1,"code","zosh","codewithzosh@gmail.com","12345");

        if(user.getFirstName()!=null) {
            user1.setFirstName(user.getFirstName());
        }
        if(user.getLastName()!=null) {
            user1.setLastName(user.getLastName());
        }
        if(user.getEmail()!=null) {
            user1.setEmail(user.getEmail());
        }

        return user1;
    }

    @DeleteMapping("users/{userId}")
    public String deleteUser(@PathVariable("userId") Integer userId) {

        return "user deleted successfully with id "+userId;
    }
}
