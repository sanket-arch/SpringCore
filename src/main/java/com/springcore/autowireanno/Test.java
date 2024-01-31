package com.springcore.autowireanno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/springcore/autowireanno/resources/autowireannoconfig.xml");

        Employee emp = context.getBean("emp", Employee.class);

        System.out.println(emp);

        // Close the context when done
        ((ClassPathXmlApplicationContext) context).close();

    }

}
