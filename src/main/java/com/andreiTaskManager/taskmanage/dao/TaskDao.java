package com.andreiTaskManager.taskmanage.dao;

import com.andreiTaskManager.taskmanage.entity.Task;

import java.util.List;

public interface TaskDao {
    void addTaskToDb(Task task);
    Task getTask(Long id);
    List<Task> getAllTasks();
}
