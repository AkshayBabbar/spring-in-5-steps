package com.babbarEnterprises.spring.basics.springin5steps;

import com.babbarEnterprises.spring.basics.componentScan.ComponentPersonDAO;
import com.babbarEnterprises.spring.basics.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.babbarEnterprises.spring.basics.componentScan")
public class SpringIn5StepsComponentScanApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);
//    (SpringIn5StepsBasicScopeApplication.class);
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                SpringIn5StepsComponentScanApplication.class)) {
            ComponentPersonDAO componentDAO = applicationContext.getBean(ComponentPersonDAO.class);

            LOGGER.info("{}", componentDAO);
        }
    }
}
