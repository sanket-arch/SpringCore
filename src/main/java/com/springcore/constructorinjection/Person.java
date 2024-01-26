package com.springcore.constructorinjection;

import java.util.List;

public class Person {
    private String personName;
    private int x;
    private Certification certi;
    private List<String> phone;

    public Person(String personName, int x, Certification certi, List<String> phone) {
        super();
        this.personName = personName;
        this.x = x;
        this.certi = certi;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "{" +
                " personName='" + this.personName + "'" +
                ", x='" + this.x + "'" +
                ", certification='" + this.certi.name + "'" +
                ", phones='" + this.phone + "'" +
                "}";
    }

}
