package com.andreiTaskManager.taskmanage.dao;

import com.andreiTaskManager.taskmanage.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoTaskJpaRepository extends JpaRepository<Task,Long> {
}
