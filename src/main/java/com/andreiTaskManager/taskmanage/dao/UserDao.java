package com.andreiTaskManager.taskmanage.dao;


import com.andreiTaskManager.taskmanage.entity.User;

import java.util.List;

public interface UserDao {
    User getUser(Long id);
    void addUserToDb(User user);
    List<User> getAllUsers();

}
