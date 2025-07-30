package com.example.taskmanager.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.taskmanager.Entity.Task;
import com.example.taskmanager.Repository.TaskRepository;

@Service
public class TaskService {
    private final TaskRepository repo;

    @Autowired
    public TaskService(final TaskRepository repo) {
        this.repo = repo;
    }

    //Method to get all tasks created. 
    public java.util.List<Task> getAllTasks() {
        return repo.findAll();
    }
    //Method to get a task by Id. 
    public Optional<Task> getTaskById(Long id) {
        return repo.findById(id);
    }
    //Method to create a task.
    public Task createTask(Task task) {
        return repo.save(task);
    }
    //Method to update a task
    public Task updateTask(Long id, Task updatedTask) {
        return repo.findById(id)
                .map(task -> {
                    task.setTitle(updatedTask.getTitle());
                    task.setDescription(updatedTask.getDescription());
                    return repo.save(task);
                })
                .orElseThrow(() -> new RuntimeException("Task not found with id " + id));
    }
    //Method to delete a task
    public void deleteTask(Long id) {
        repo.deleteById(id);
    }

}
