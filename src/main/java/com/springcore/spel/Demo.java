package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.springcore.Student;

@Component
public class Demo {

    @Value("#{10>32 ? 10:32}") // Here, we are using SpEL
    private int x;
    private int y;

    // calling static method
    @Value("#{T(java.lang.Math).sqrt(144)}")
    private double sq;

    // calling static value
    @Value("#{T(java.lang.Math).E}")
    private double e;

    // creating object
    @Value("#{new java.lang.String('sanket')}")
    private String s1;

    @Value("#{new com.springcore.Student(12,\"sanket\",\"madhubani\")}")
    private Student std;

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Demo() {
        super();
    }

    public double getSq() {
        return this.sq;
    }

    public void setSq(double sq) {
        this.sq = sq;
    }

    public double getE() {
        return this.e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public String getS1() {
        return this.s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public Student getStd() {
        return this.std;
    }

    public void setStd(Student std) {
        this.std = std;
    }

    @Override
    public String toString() {
        return "{" +
                " x='" + getX() + "'" +
                ", y='" + getY() + "'" +
                ", sq='" + getSq() + "'" +
                ", e='" + getE() + "'" +
                ", s1='" + getS1() + "'" +
                ", std='" + getStd() + "'" +
                "}";
    }

}
