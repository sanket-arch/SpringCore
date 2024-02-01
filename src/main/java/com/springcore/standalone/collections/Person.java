package com.springcore.standalone.collections;

import java.util.*;

public class Person {
    List<String> friends;
    Map<String, Integer> feestructure;
    Properties properties;


    public Person() {
        super();
    }

    public Person(List<String> friends) {
        super();
        this.friends = friends;
    }

    public List<String> getFriends() {
        return this.friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Map<String, Integer> getFeestructure() {
        return this.feestructure;
    }

    public void setFeestructure(Map<String, Integer> feestructure) {
        this.feestructure = feestructure;
    }

    public Properties getProperties() {
        return this.properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }


    @Override
    public String toString() {
        return "{" +
            " friends='" + getFriends() + "'" +
            ", feestructure='" + getFeestructure() + "'" +
            ", properties='" + getProperties() + "'" +
            "}";
    }
  

}
