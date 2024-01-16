package com.personal.project.entity;


import jakarta.persistence.Column;
import org.springframework.data.annotation.Id;


public class Products {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "id")
    int id;

    @Column(name = "name")
    String name;
}
