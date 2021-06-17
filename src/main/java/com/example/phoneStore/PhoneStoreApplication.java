package com.example.phoneStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class PhoneStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhoneStoreApplication.class, args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Phone phoneForFamily = context.getBean("lowCostPhone", Phone.class);
        Phone phoneForCompany = context.getBean("midCostPhone", Phone.class);

        System.out.println(phoneForFamily.readyForSale());
        System.out.println(phoneForCompany.readyForSale());
    }
}
