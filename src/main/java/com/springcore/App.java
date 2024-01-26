package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Employee;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Student student1 = (Student) context.getBean("student1");
        Student student2 = (Student) context.getBean("student2");

        System.out.println(student1);
        System.out.println(student2);

        
        Employee emp1 = (Employee) context.getBean("emp1");

        System.out.println(emp1);
        
        // Close the context when done
        ((ClassPathXmlApplicationContext) context).close();
    }
}
