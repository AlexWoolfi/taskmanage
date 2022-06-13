package com.andreiTaskManager.taskmanage.service;

import com.andreiTaskManager.taskmanage.entity.User;

import java.util.List;

public interface UserService {
    void createUser();
    User showUser(Long id);
    List<User> showAllUsers();
}
