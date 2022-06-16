package com.andreiTaskManager.taskmanage.dao;

import com.andreiTaskManager.taskmanage.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




public interface DaoUserRepositoryJpa extends JpaRepository<User, Long> {

}
