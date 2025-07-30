package com.example.taskmanager.Entity;


import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private LocalDate dueDate;

    public Task(Long id, String title, String description, LocalDate dueDate) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.dueDate = dueDate;
    }
    public Task(){
    }


public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}

public String getTitle() {
    return title;
}
public void setTitle(String title) {
    this.title = title;
}

public String getDescription() {
    return description;
}
public void setDescription(String description) {
    this.description = description;
}

public LocalDate getDueDate() {
    return dueDate;
}
public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
}

}
