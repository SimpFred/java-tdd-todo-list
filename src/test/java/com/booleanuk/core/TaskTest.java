package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {
    
    @Test
    public void testCreatingATask() {
        Task todoList = new Task("task name", "task description");
        Assertions.assertNotNull(todoList, "The TodoList object should not be null after creation");
    }
}
