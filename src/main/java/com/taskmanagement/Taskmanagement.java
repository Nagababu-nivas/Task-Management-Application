package com.taskmanagement;
import jakarta.persistence.*;
import com.taskmanagement.Status;
import com.taskmanagement.Priority;
import java.time.LocalDate;

@Entity
public class Taskmanagement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;


    private String description;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Enumerated(EnumType.STRING)
    private Priority priority;

    private LocalDate dueDate;


    public Taskmanagement() {

    }

    public Long getId() {
        return id;
    }
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public Status getStatus() {return status;}
    public void setStatus(Status status) {this.status = status;}
    public Priority getPriority() {return priority;}
    public void setPriority(Priority priority) {this.priority = priority;}
    public LocalDate getDueDate() {return dueDate;}
    public void setDueDate(LocalDate dueDate) {this.dueDate = dueDate;}
    public void setId(Long id) {this.id = id;}

}