package com.babbarEnterprises.spring.basics.springin5steps;

import com.babbarEnterprises.spring.basics.springin5steps.basic.BinarySearchImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//import org.springframework.boot.SpringApplication;

@Configuration
@ComponentScan
public class SpringIn5StepsBasicApplication {

    public static void main(String[] args) {

//		System.out.println(result);

        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class);
        BinarySearchImpl binarySearch =
                applicationContext.getBean(BinarySearchImpl.class);

        BinarySearchImpl binarySearch1 =
                applicationContext.getBean(BinarySearchImpl.class);

        System.out.println(binarySearch);
        System.out.println(binarySearch1);

        int result =
                binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
        System.out.println(result);
        applicationContext.close();
    }


}
