package com.andreiTaskManager.taskmanage.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="userId")
    private long userId;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private int age;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private LocalDateTime dateCreate;

    @Enumerated
    private Role role;

    @OneToMany(mappedBy = "user", cascade = {CascadeType.REFRESH})
    private List<Task> tasks;

}
