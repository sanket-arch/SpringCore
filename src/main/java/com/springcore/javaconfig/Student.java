package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Value;

public class Student {

    @Value("Sanket")
    private String name;

    private Samosa somosa;
    private Friends friends;

    public Student() {
        super();
    }

    public Student(Samosa somosa, Friends friends) {
        super();
        this.somosa = somosa;
        this.friends = friends;
    }

    public Samosa getSomosa() {
        return this.somosa;
    }

    public void setSomosa(Samosa somosa) {
        this.somosa = somosa;
    }

    public Friends getFriends() {
        return this.friends;
    }

    public void setFriends(Friends friends) {
        this.friends = friends;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", somosa='" + getSomosa() + "'" +
                ", friends='" + getFriends() + "'" +
                "}";
    }

    public void display() {
        this.somosa.display();
        this.friends.display();
        System.out.println("I am eating, i will study after sometimes");
    }

}
