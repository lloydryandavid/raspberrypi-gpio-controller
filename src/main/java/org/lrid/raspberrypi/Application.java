package org.lrid.raspberrypi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"org.lrid.raspberrypi"})
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        System.out.println("Beans created by Spring Boot:");
        String[] springBeanNames = ctx.getBeanDefinitionNames();
        for(String springBeanName : springBeanNames) {
            System.out.println(springBeanName);
        }
    }

}
