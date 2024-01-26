package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/springcore/constructorinjection/resources/config.xml");

        Person p1 = (Person) context.getBean("person");

        System.out.println(p1);

        // Close the context when done
        ((ClassPathXmlApplicationContext) context).close();

    }
}
