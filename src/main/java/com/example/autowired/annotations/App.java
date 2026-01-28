package com.example.autowired.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee.toString());

        Manager manager = context.getBean("manager", Manager.class);//here we can either cast it or write it as this
        System.out.println(manager.toString());
    }
}
