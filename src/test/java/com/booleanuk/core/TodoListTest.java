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

        Assertions.assertFalse(todoList.addTask(null, false), "The task should not be added to the TodoList");
    }

    @Test
    public void testRemoveTask() {
        TodoList todoList = new TodoList();
        Task task = new Task("task name", "task description");
        todoList.addTask(task, false);
        Assertions.assertTrue(todoList.removeTask(task), "The task should be removed from the TodoList");

        Assertions.assertFalse(todoList.removeTask(null), "The task should be removed from the TodoList");
    }
}
