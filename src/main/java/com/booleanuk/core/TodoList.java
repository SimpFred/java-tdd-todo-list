package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TodoList {

    private Map<Task, Boolean> tasks;

    public TodoList() {
        this.tasks = new HashMap<>();
    }
    public boolean addTask(Task task, boolean isCompleted) {
        if (task == null) {
            return false;
        }
        tasks.put(task, isCompleted);
        return true;
    }

    public boolean removeTask(Task task) {
        if (task == null || !tasks.containsKey(task)) {
            return false;
        }
        tasks.remove(task);
        return true;
    }

    public List<Task> getAllTasks() {
        return List.copyOf(tasks.keySet());
    }

    public boolean changeTaskStatus(Task task, boolean isCompleted) {
        if (task == null || !tasks.containsKey(task)) {
            return false;
        }
        tasks.put(task, isCompleted);
        return true;
    }

    public List<Task> getCompleteTasks() {
        List<Task> completedTasks = new ArrayList<>();
        for (Map.Entry<Task, Boolean> entry : tasks.entrySet()) {
            if (entry.getValue()) {
                completedTasks.add(entry.getKey());
            }
        }
        return completedTasks;
    }

    public List<Task> getIncompleteTasks() {
        List<Task> incompleteTasks = new ArrayList<>();
        for (Map.Entry<Task, Boolean> entry : tasks.entrySet()) {
            if (!entry.getValue()) {
                incompleteTasks.add(entry.getKey());
            }
        }
        return incompleteTasks;
    }

    public boolean searchTask(Task task) {
        if (task == null || tasks.get(task) == null) {
            System.out.println("Task not found");
            return false;
        }
        if (tasks.get(task) != null) {
            System.out.println("Task found: " + task.getName());
        }
        return tasks.get(task) != null;
    }
}
