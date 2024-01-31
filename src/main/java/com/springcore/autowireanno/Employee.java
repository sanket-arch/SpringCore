package com.springcore.autowireanno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
   
    @Autowired
    @Qualifier("person2")
    private Person person1;
    
    public Person getPerson1() {
        return this.person1;
    }

    
    public void setPerson1(Person person1) {
        this.person1 = person1;
    }
   
    // public Person getPerson2() {
    //     return this.person2;
    // }

    
    // public void setPerson2(Person person2) {
    //     System.out.println("setting person 2");
    //     this.person2 = person2;
    // }

   
    public Employee() {
        super();

    }

    public Employee(Person person1) {
        System.out.println("I am from constructor");
        this.person1 = person1;
        
    }


    @Override
    public String toString() {
        return "{" +
            " person1='" + getPerson1() + "'" +
            // ", person2='" + getPerson2() + "'" +
            "}";
    }



}
