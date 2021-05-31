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

    private String date;

    private String city;
    private Integer age;
    private String genre;

    public Task(String name, String task, String date, String city, Integer age, String genre) {
        this.name = name;
        this.task = task;
        this.date = date;
        this.city = city;
        this.age = age;
        this.genre = genre;
    }

    public Task(Long id, String name, String task, String date, String city, Integer age, String genre) {
        this.id = id;
        this.name = name;
        this.task = task;
        this.date = date;
        this.city = city;
        this.age = age;
        this.genre = genre;
    }

    public Task() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
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
