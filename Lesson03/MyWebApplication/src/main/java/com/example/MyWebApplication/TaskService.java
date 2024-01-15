package com.example.MyWebApplication;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class TaskService {
    private final List<Task> tasks = new ArrayList<>();

    public List<Task> getAllTasks() {
        return tasks;
    }

    public Task getTask(UUID id) {
        return tasks.stream().filter(task -> task.getId().equals(id)).findFirst().orElse(null);
    }

    public Task addTask(Task task) {
        tasks.add(task);
        return task;
    }

    public void deleteTask(UUID id) {
        tasks.removeIf(task -> task.getId().equals(id));
    }

    public Task updateTask(UUID id, Task task) {
        Task task1 = getTask(id);
        if (task1 != null) {
            task1.setName(task.getName());
            task1.setDescription(task.getDescription());
            task1.setCompletionTime(task.getCompletionTime());
            task1.setStatus(task.getStatus());
        }
        return task1;
    }
}
