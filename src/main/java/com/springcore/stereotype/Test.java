package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/springcore/stereotype/resources/stereoconfig.xml");

        Student s1 = (Student) context.getBean("student1");

        System.out.println(s1);

        ((ClassPathXmlApplicationContext) context).close();
    }

}
