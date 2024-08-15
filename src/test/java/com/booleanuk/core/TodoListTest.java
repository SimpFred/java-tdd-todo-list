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

        Assertions.assertFalse(todoList.removeTask(task), "The task should not be in the list anymore");
    }

    @Test
    public void testGetAllTasks() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("task name 1", "task description 1");
        Task task2 = new Task("task name 2", "task description 2");
        todoList.addTask(task1, false);
        todoList.addTask(task2, false);
        Assertions.assertEquals(2, todoList.getAllTasks().size(), "The number of tasks should be 2");

        todoList.removeTask(task1);
        Assertions.assertEquals(1, todoList.getAllTasks().size(), "The number of tasks should be 1");

        todoList.removeTask(task2);
        Assertions.assertEquals(0, todoList.getAllTasks().size(), "The number of tasks should be 0");
    }

    @Test
    public void testChangeTaskStatus() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("task name 1", "task description 1");
        Task task2 = new Task("task name 2", "task description 2");
        todoList.addTask(task1, false);
        todoList.addTask(task2, false);

        Assertions.assertTrue(todoList.changeTaskStatus(task1, true), "The task status should be changed to true");
        Assertions.assertFalse(todoList.changeTaskStatus(null, true), "The task status should be changed to true");

        Task task3 = new Task("task name 3", "task description 3");
        Assertions.assertFalse(todoList.changeTaskStatus(task3, true), "Should return false if the task is not in the list");
    }

    @Test
    public void testGetCompleteTasks() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("task name 1", "task description 1");
        Task task2 = new Task("task name 2", "task description 2");
        todoList.addTask(task1, true);
        todoList.addTask(task2, false);
        Assertions.assertEquals(1, todoList.getCompleteTasks().size(), "The number of complete tasks should be 1");
    }
}
