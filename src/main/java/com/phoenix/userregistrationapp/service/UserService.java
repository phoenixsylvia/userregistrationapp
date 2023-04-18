package com.phoenix.userregistrationapp.service;

import com.phoenix.userregistrationapp.entity.User;
import com.phoenix.userregistrationapp.repository.UserRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
@RequiredArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public User addUser(User user){
       return userRepository.save(user);
    }

    public User viewUser(int id){
        return userRepository.findById(id).orElse(null);
    }

    public List<User> viewAllUsers(List<User> users){
        return userRepository.findAll();
    }
}
