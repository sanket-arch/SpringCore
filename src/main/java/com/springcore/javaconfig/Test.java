package com.springcore.javaconfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        Student firstStudent = context.getBean("getStudent", Student.class);

        System.out.println(firstStudent);
        firstStudent.display();

        context.close();
    }
}
