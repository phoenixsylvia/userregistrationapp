package com.phoenix.userregistrationapp.repository;

import com.phoenix.userregistrationapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {


}
