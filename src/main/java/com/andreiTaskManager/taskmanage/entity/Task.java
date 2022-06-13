package com.andreiTaskManager.taskmanage.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

//@Entity
//@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private LocalDateTime dateCreate = LocalDateTime.now();
    private LocalDateTime dateDeadline;

    @Enumerated
    private Priority priority;
    @Enumerated
    private Category category;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "id")
    private User user;


}
