package com.sand.ecommerce.controller;

import com.sand.ecommerce.entity.User;
import com.sand.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public List<User> index() {
        userService.getAllUsers();
        return null;
    }

    @GetMapping("/{id}")
    public User show(@PathVariable Long id) {
        userService.getUserById(id);
        return null;
    }

    @PostMapping
    public void store(@RequestBody User user) {
        userService.addUser(user);
    }

    @PutMapping
    public void update(@RequestBody User user) {
        userService.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public void destroy(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
