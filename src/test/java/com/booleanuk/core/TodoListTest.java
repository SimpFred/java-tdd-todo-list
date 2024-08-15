package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void testCreatingTodoList() {
        TodoList todoList = new TodoList();
        Assertions.assertNotNull(todoList, "The TodoList object should not be null after creation");
    }

    @Test
    public void testAddTask() {
        TodoList todoList = new TodoList();
        Task task = new Task("task name", "task description");
        Assertions.assertTrue(todoList.addTask(task, false), "The task should be added to the TodoList");

        Task task2 = new Task(null, "task description");
        Assertions.assertFalse(todoList.addTask(task2, false), "The task should not be added to the TodoList");
    }
}
