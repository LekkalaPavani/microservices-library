package com.ust.UserService.service;



import com.ust.UserService.model.User;
import com.ust.UserService.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UserService {
    @Autowired
    private UserRepo userrepo;




    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userrepo.findAll());
    }

    public User addUser(User user) {
        return userrepo.save(user);
    }

    public void deleteUserById(Long userId) {
        userrepo.deleteById(userId);

    }

    public ResponseEntity<Optional<User>> getUserById(Long userId) {
        return ResponseEntity.ok(userrepo.findById(userId));
    }
}
