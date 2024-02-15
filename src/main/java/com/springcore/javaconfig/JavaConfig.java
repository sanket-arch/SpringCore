package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Configuration tells spring that it is configuration file we want to use
@Configuration
public class JavaConfig {

    // by default name of the bean will be getFriends
    @Bean
    public Friends getFriends() {
        // returned object will be given to the IOC container
        return new Friends();
    }

    // Here, we can mention names we want to refer this bean with.
    // we can mention as many names we want in array format
    @Bean(name = { "samosaBean" })
    public Samosa getSamosa() {
        return new Samosa();
    }

    @Bean
    public Student getStudent() {
        Student firstStudent = new Student(getSamosa(), getFriends());
        return firstStudent;
    }

}
