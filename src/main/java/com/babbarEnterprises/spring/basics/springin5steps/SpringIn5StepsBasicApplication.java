package com.babbarEnterprises.spring.basics.springin5steps;

import com.babbarEnterprises.spring.basics.springin5steps.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {

//		System.out.println(result);

        ApplicationContext applicationContext =
                SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
        BinarySearchImpl binarySearch =
                applicationContext.getBean(BinarySearchImpl.class);

        BinarySearchImpl binarySearch1 =
                applicationContext.getBean(BinarySearchImpl.class);

        System.out.println(binarySearch);
        System.out.println(binarySearch1);

        int result =
                binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
        System.out.println(result);
    }


}
