package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class School implements InitializingBean, DisposableBean {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public School() {
        super();
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                "}";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("I am init method for interface implementation");

    }

    @Override
    public void destroy() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("I am destroy method for the interface implementation");
    }

}
