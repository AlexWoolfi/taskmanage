package com.andreiTaskManager.taskmanage.service;

import com.andreiTaskManager.taskmanage.entity.Task;


import java.util.List;

public interface TaskService {
    void createTask();
    Task showUser(Long id);
    List<Task> showAllTasks();
}
