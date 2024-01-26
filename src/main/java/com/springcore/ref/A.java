package com.springcore.ref;

public class A {

    private String name;
    private B b;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public B getB() {
        return this.b;
    }

    public void setB(B b) {
        this.b = b;
    }


    public A(String name, B b) {
        super();
        this.name = name;
        this.b = b;
    }


    public A() {
        super();
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", b='" + getB() + "'" +
            "}";
    }

}
