package com.booleanuk.extension;
import com.booleanuk.core.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskExtensionTest {

    @Test
    public void testCreatingATask() {
        Task task = new Task("task name", "task description");
        Assertions.assertNotNull(task, "The TodoList object should not be null after creation");
    }

    @Test
    public void testGetName() {
        Task todoList = new Task("task name", "task description");
        Assertions.assertEquals("task name", todoList.getName(), "The name of the task should be 'task name'");
    }

    @Test
    public void testGetDescription() {
        Task todoList = new Task("task name", "task description");
        Assertions.assertEquals("task description", todoList.getDescription(), "The description of the task should be 'task description'");
    }

    @Test
    public void testGetId() {
        Task todoList = new Task("task name", "task description");
        Assertions.assertNotNull(todoList.getId(), "The id of the task should not be null");
    }
}
