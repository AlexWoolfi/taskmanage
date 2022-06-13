package com.andreiTaskManager.taskmanage.entity;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

//@Entity
//@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String lastName;
    private int old;
    private String email;
    private String password;
    private LocalDateTime dateCreate = LocalDateTime.now();

    @Enumerated
    private Role role;

    @OneToMany(mappedBy = "user", cascade = {CascadeType.REFRESH})
    private List<Task> tasks;

}
