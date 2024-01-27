package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Subject {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject() {
        super();
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                "}";
    }

    @PostConstruct
    public void start() {
        System.out.println("I am init for annotation implementation");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("I am destroy for annotation implemenetaion");
    }
}
