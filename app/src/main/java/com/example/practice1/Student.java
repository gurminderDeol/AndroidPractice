package com.example.practice1;

import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable {

    private  String name;

    public Student(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
