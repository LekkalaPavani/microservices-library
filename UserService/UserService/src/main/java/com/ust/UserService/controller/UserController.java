package com.ust.UserService.controller;

import com.ust.UserService.model.User;
import com.ust.UserService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

@PostMapping("/adduser")
public ResponseEntity<User> addUser(@RequestBody User user) {

    return ResponseEntity.ok(userService.addUser(user));
}

    @GetMapping("/getusers")
    public ResponseEntity<List<User>> getAllUsers() {
        return userService.getAllUsers();

    }

    @GetMapping("/getUserbyId/{userId}")
    public ResponseEntity<Optional<User>> getUserById(@PathVariable Long userId) {
        return userService.getUserById(userId);
    }

    @DeleteMapping("/deleteuser/{userId}")
    public ResponseEntity<Void>  deleteUser(@PathVariable  Long userId) {
        userService.deleteUserById(userId);
        return ResponseEntity.noContent().build();
    }
}