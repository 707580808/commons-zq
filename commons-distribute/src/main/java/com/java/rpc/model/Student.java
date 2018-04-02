package com.java.rpc.model;

/**
 * Copyright (C), 2016-2017 中盈优创
 * Student
 *
 * @Author: zhuqiang
 * @Date: 18/4/2
 */
public class Student {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
