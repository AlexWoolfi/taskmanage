package com.andreiTaskManager.taskmanage.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long taskId;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private LocalDateTime dateCreate;
    @Column
    private LocalDateTime dateDeadline;

    @Enumerated
    private Priority priority;
    @Enumerated
    private Category category;

//    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH,CascadeType.MERGE,CascadeType.DETACH})
//    @JoinColumn(name = "userId")
//    private User user;


}
