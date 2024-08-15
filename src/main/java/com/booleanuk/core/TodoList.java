package com.booleanuk.core;

import java.util.HashMap;
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
        if (task == null) {
            return false;
        }
        tasks.remove(task);
        return true;
    }
}
