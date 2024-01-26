package com.springcore.ref;

public class B {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public B(String name) {
        super();
        this.name = name;
    }

    public B() {
        super();
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                "}";
    }

}
