package com.example.taskmanager.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.taskmanager.Entity.Task;
import com.example.taskmanager.Repository.TaskRepository;

@Service
public class TaskService {
    private final TaskRepository repo;

    public TaskService(final TaskRepository repo) {
        this.repo = repo;
    }

    public List<Task> getAllTasks() {
        return repo.findAll();
    }

    public Optional<Task> getTaskById(Long id) {
        return repo.findById(id);
    }

    public Task createTask(Task task) {
        return repo.save(task);
    }

    public Task updateTask(Long id, Task updatedTask) {
        return repo.findById(id)
                .map(task -> {
                    task.setTitle(updatedTask.getTitle());
                    task.setDescription(updatedTask.getDescription());
                    task.setDueDate(updatedTask.getDueDate());
                    return repo.save(task);
                })
                .orElseThrow(() -> new RuntimeException("Task not found with id " + id));
    }

    public void deleteTask(Long id) {
        repo.deleteById(id);
    }
}
