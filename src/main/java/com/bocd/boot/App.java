package com.bocd.boot;

import com.bocd.model.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fuwc
 * @version 1.0, 2019/9/18
 */
public class App {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.bocd");
//        context.getBeansOfType(Person.class).values().forEach(System.out::println);

//        context.close();
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
    }
}
