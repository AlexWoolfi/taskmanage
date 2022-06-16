package com.andreiTaskManager.taskmanage.service;

import com.andreiTaskManager.taskmanage.dao.DaoTaskJpaRepository;
import com.andreiTaskManager.taskmanage.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl {
    private DaoTaskJpaRepository daoTaskJpaRepository;

    @Autowired
    public TaskServiceImpl(DaoTaskJpaRepository daoTaskJpaRepository) {
        this.daoTaskJpaRepository = daoTaskJpaRepository;
    }

    public Task save(Task task){
        return daoTaskJpaRepository.save(task);
    }

    public List<Task> findAll() {
        return daoTaskJpaRepository.findAll();
    }

    public void delete(Task task) {
        daoTaskJpaRepository.delete(task);
    }


    public void deleteAll() {
        daoTaskJpaRepository.deleteAll();
    }
}
