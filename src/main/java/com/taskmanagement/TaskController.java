package com.taskmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("tasks")
@RestController
public class TaskController {
    @Autowired
    private TaskService service;

    @PostMapping("CreateTasks")
    public ResponseEntity<String> createTask(@RequestBody Taskmanagement task) {
        return new ResponseEntity<>(service.addTask(task), HttpStatus.CREATED);
    }

    @GetMapping("GetTasks")
    public ResponseEntity<List<Taskmanagement>> getTasks() {
        return ResponseEntity.ok(service.getAllTasks());
    }

    @GetMapping("GetTaskById/{id}")
    public ResponseEntity<Taskmanagement> getTaskById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getTaskById(id));
    }

    @PutMapping("UpdateTaskStatus/{id}/status")
    public ResponseEntity<Taskmanagement> updateTaskStatusById(@PathVariable Long id,
                                                               @RequestParam Status status) {
        return ResponseEntity.ok(service.updateStatus(id, status));
    }

    @DeleteMapping("DeleteTaskById/{id}")
    public ResponseEntity<String> deleteTaskById(@PathVariable Long id) {
        return ResponseEntity.ok(service.deleteTaskById(id));
    }

}
