package com.springcore.collections;

import java.util.*;

public class Employee {
    private String name;
    private List<String> phones;
    private Set<String> addresses;
    private Map<String, String> courses;
    private Properties props;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return this.phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAddresses() {
        return this.addresses;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, String> getCourses() {
        return this.courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Properties getProps() {
        return this.props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public Employee(String name, List<String> phones, Set<String> addresses, Map<String, String> courses,
            Properties props) {
        super();
        this.name = name;
        this.phones = phones;
        this.addresses = addresses;
        this.courses = courses;
        this.props = props;
    }

    public Employee() {
        super();
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", phones='" + getPhones() + "'" +
                ", addresses='" + getAddresses() + "'" +
                ", courses='" + getCourses() + "'" +
                ", properties='" + getProps() + "'" +
                "}";
    }

}
