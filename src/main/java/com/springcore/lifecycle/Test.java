package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(
                "com/springcore/lifecycle/resources/lifecycleconfig.xml");

        // For xml implementation
        Book b1 = (Book) context.getBean("book1");

        System.out.println(b1);

        // For interface implementation
        School schl1 = (School) context.getBean("school1");

        System.out.println(schl1);

        // For annotation implementation
        Subject sub1 = (Subject) context.getBean("sub1");
        System.out.println(sub1);

        // Registering shutdown hook which is to tell that we have to call the destroy
        // method. This method is inside AbstractApplicationContext interface.
        context.registerShutdownHook();

        ((ClassPathXmlApplicationContext) context).close();
    }
}
