package com.ust.UserService.repository;

import com.ust.UserService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
