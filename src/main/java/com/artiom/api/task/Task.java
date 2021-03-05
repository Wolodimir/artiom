package com.artiom.api.task;

import javax.persistence.*;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    @Column(columnDefinition = "text")
    private String task;

    public Task(String name, String task) {
        this.name = name;
        this.task = task;
    }

    public Task() {
    }

    public Task(Long id, String name, String task) {
        this.id = id;
        this.name = name;
        this.task = task;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
