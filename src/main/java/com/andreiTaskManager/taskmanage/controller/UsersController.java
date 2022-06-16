package com.andreiTaskManager.taskmanage.controller;


import com.andreiTaskManager.taskmanage.entity.User;
import com.andreiTaskManager.taskmanage.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/admin")
public class UsersController {
    @Autowired
    private final UserServiceImpl userService;

    public UsersController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String findAllUsers(Model model) {
        List<User> usersList = userService.findAll();
        model.addAttribute("usersList", usersList);
        return "users";
    }

    @GetMapping("/user-create")
    public String createUserForm(User user) {
        return "user-create";
    }
    @PostMapping("/user-create")
    public String createUser(User user) {
        userService.save(user);
        return "redirect:users";
    }

    @GetMapping("/user-update/{id}")
    public String updateUserById(@PathVariable("id") Long id, Model model) {
        User user = userService.findById(id);
        model.addAttribute("updateUser", user);
        return "user-update";
    }

    @PostMapping("/user-update")
    public String updateUser(User user) {
        userService.save(user);
        return "redirect:users";
    }

    @GetMapping("/user-delete/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.deleteUserById(id);
        return "redirect:users";
    }

}

