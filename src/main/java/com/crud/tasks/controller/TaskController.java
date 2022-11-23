package com.crud.tasks.controller;

import com.crud.tasks.domain.TaskDto;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/tasks")
public class TaskController {

    @GetMapping
    public List<TaskDto> getTasks() {
        return new ArrayList<>();
    }

    @GetMapping(value = "{taskId}")
    public TaskDto getTask(@PathVariable Long taskId) {
        return new TaskDto(1L, "test title", "test_content");
    }

    @DeleteMapping(value = "{taskId}")
    public void deleteTask(@PathVariable Long taskId) {}

    @PutMapping(value = "{taskDto}")
    public TaskDto updateTask(@PathVariable TaskDto taskDto) {
        return new TaskDto(2L, "Edited test title", "Test content");
    }

    @PostMapping(value = "{taskDto}")
    public void CreateTask(@PathVariable TaskDto taskDto) {}
}
