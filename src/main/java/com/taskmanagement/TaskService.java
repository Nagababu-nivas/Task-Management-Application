package com.taskmanagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repo;

    public String addTask(Taskmanagement task) {
        repo.save(task);
        return "Task is added";
    }

    public List<Taskmanagement> getAllTasks() {
        return repo.findAll();
    }

    public Taskmanagement getTaskById(Long taskId) {
        Taskmanagement task = repo.findById(taskId).orElse(null);
        return task;
    }

    public String deleteTaskById(Long taskId) {
        Optional<Taskmanagement> task = repo.findById(taskId);
        if (task.isPresent()) {
            Taskmanagement del = task.get();
            repo.delete(del);
            return "Task is deleted";
        } else {
            return "Task not found";
        }
    }

    public Taskmanagement updateStatus(Long taskId, Status status) {
        Optional<Taskmanagement> task = repo.findById(taskId);
        Taskmanagement myTask = null;
        if (task.isPresent()) {
            myTask = task.get();
            myTask.setStatus(status);
            repo.save(myTask);
        }
        return myTask;
    }

}
