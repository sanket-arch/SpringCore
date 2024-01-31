package com.springcore.autowire;

public class Employee {
    private Person person1,person2;


    public Person getPerson1() {
        return this.person1;
    }

    public void setPerson1(Person person1) {
        this.person1 = person1;
    }

    public Person getPerson2() {
        return this.person2;
    }

    public void setPerson2(Person person2) {
        this.person2 = person2;
    }

    public Employee() {
        super();
    }


    public Employee(Person person1, Person person2) {
        this.person1 = person1;
        this.person2 = person2;
    }


    @Override
    public String toString() {
        return "{" +
            " person1='" + getPerson1() + "'" +
            ", person2='" + getPerson2() + "'" +
            "}";
    }



}
