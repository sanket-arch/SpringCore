package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/resources/collectionconfig.xml");

        Employee emp1 = (Employee) context.getBean("emp1");

        System.out.println(emp1);

        // Close the context when done
        ((ClassPathXmlApplicationContext) context).close();
    }
}
