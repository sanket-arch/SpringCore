package com.springcore.lifecycle;

public class Book {
    private int price;

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Book() {
        super();
    }

    @Override
    public String toString() {
        return "{" +
                " price='" + getPrice() + "'" +
                "}";
    }

    public void init() {
        System.out.println("Inside init method");
    }

    public void destroy() {
        System.out.println("inside destroy method");
    }

}
