package com.geekster.UserManagementSystemWithValidations.controller;

import com.geekster.UserManagementSystemWithValidations.model.User;
import com.geekster.UserManagementSystemWithValidations.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/getAllUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping(value = "/addUsers")
    public String addUsers(@Valid @RequestBody User user){
        return userService.addUsers(user);
    }

    @GetMapping(value = "/getUserById/{userId}")
    public User getUserById(@PathVariable String userId){
        return userService.getUserById(userId);
    }

    @DeleteMapping(value = "/deleteUserById/{userId}")
    public String DeleteUserById(@PathVariable String userId){
        return userService.deleteUserById(userId);
    }

    @PutMapping(value = "/updateUser/{userId}/{email}")
    public String updateUser(@PathVariable String userId ,@PathVariable String email){
        return userService.updateUser(userId , email);
    }

}
