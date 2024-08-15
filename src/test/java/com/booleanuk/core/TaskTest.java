package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    public void testCreatingATask() {
        Task todoList = new Task("task name", "task description");
        Assertions.assertNotNull(todoList, "The TodoList object should not be null after creation");
    }

    @Test
    public void testGetName() {
        Task todoList = new Task("task name", "task description");
        Assertions.assertEquals("task name", todoList.getName(), "The name of the task should be 'task name'");
    }
}
