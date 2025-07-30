package com.example.taskmanager.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.taskmanager.Entity.Task;
import com.example.taskmanager.Service.TaskService;

@RestController
public class TaskController {
    
    private final TaskService service;

    @Autowired
    public TaskController(final TaskService service) {
        this.service = service;
    }

    @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        return service.getAllTasks();
    }
    
    @GetMapping("/tasks/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return service.getTaskById(id).orElseThrow(() -> new RuntimeException("Task with ID: " + id + " not found"));
    }
    
    @PostMapping("/tasks")
    public Task createTask(@RequestBody Task task) {
        return service.createTask(task);
    }

    @PutMapping("/tasks/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
        return service.updateTask(id, task);
    }
    @DeleteMapping("/tasks/{id}")
    public void deleteTask(@PathVariable Long id) {
        service.deleteTask(id);
    }
}
