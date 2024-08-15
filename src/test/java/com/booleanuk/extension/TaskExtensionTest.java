package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskExtensionTest {

    @Test
    public void testCreatingATask() {
        TaskExtension task = new TaskExtension("task name", "task description");
        Assertions.assertNotNull(task, "The TodoList object should not be null after creation");
    }

    @Test
    public void testGetName() {
        TaskExtension task = new TaskExtension("task name", "task description");
        Assertions.assertEquals("task name", task.getName(), "The name of the task should be 'task name'");
    }

    @Test
    public void testGetDescription() {
        TaskExtension task = new TaskExtension("task name", "task description");
        Assertions.assertEquals("task description", task.getDescription(), "The description of the task should be 'task description'");
    }

    @Test
    public void testGetId() {
        TaskExtension task = new TaskExtension("task name", "task description");
        Assertions.assertNotNull(task.getId(), "The id of the task should not be null");
    }

    @Test
    public void testGetCreatedAt() {
        TaskExtension task = new TaskExtension("task name", "task description");
        Assertions.assertNotNull(task.getCreatedAt(), "The created at of the task should not be null");
    }
}
