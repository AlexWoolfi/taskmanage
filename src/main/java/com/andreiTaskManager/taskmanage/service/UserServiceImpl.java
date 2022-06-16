package com.andreiTaskManager.taskmanage.service;

import com.andreiTaskManager.taskmanage.dao.DaoUserRepositoryJpa;
import com.andreiTaskManager.taskmanage.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl {
    private DaoUserRepositoryJpa daoUserRepositoryJpa;

    @Autowired
    public UserServiceImpl(DaoUserRepositoryJpa daoUserRepositoryJpa) {
        this.daoUserRepositoryJpa = daoUserRepositoryJpa;
    }
    public User findById(Long id) {
        return daoUserRepositoryJpa.findById(id).orElse(null);
    }

    public List<User> findAll() {
        return daoUserRepositoryJpa.findAll();
    }

    public void deleteUserById(Long id) {
        daoUserRepositoryJpa.deleteById(id);
    }

    public void save(User user) {
        daoUserRepositoryJpa.save(user);
    }

}
