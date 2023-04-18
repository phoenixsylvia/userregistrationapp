package com.phoenix.userregistrationapp.controller;

import com.phoenix.userregistrationapp.entity.User;
import com.phoenix.userregistrationapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/user")
public class UserController {

private UserService userService;

@PostMapping("/createUser")
public User createUser(@RequestBody User user){
    return userService.addUser(user);
}

@GetMapping("/viewUser/{id}")
public User viewUser(@PathVariable int id){
    return userService.viewUser(id);
}

@GetMapping("/viewAllUsers")
public List<User> viewAllUsers(List<User> users){
    return userService.viewAllUsers(users);
}
}
