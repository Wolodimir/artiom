package com.artiom.api.task;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepo taskRepo;

    public TaskService(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }

    public String saveTask(Task task){
        taskRepo.save(task);
        return "Сохранено";
    }

    public List<Task> getAllTasks(){
        return taskRepo.findAll();
    }
}
