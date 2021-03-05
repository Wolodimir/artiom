package com.artiom.api.task;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/addTask")
    public String addTask(@RequestBody Task task){
        taskService.saveTask(task);
        return "Успешно сохранено";
    }

    @GetMapping("/allTasks")
    public List<Task> allTasks(){
        return taskService.getAllTasks();
    }


}
