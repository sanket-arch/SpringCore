package com.springcore.constructorinjection;

public class Certification {
    public String name;

    public Certification(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + this.name + "'" +
                "}";
    }

}
