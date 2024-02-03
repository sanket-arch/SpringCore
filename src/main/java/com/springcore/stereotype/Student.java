package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// DOUBT: How can we create multiple beans using @components. Also, How can we insert multiple value using @value.

@Component("student1")
public class Student {

    @Value("sanket")
    private String studentName;
    @Value("22MCA0143")
    private String regNumber;

    @Value("#{myFriends}")
    private List<String> myFriends;

    public Student() {
        super();
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getRegNumber() {
        return this.regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public List<String> getMyFriends() {
        return this.myFriends;
    }

    public void setMyFriends(List<String> myFriends) {
        this.myFriends = myFriends;
    }


    @Override
    public String toString() {
        return "{" +
            " studentName='" + getStudentName() + "'" +
            ", regNumber='" + getRegNumber() + "'" +
            ", myFriends='" + getMyFriends() + "'" +
            "}";
    }
    

}
