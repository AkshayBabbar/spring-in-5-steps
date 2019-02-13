package com.babbarEnterprises.spring.basics.springin5steps;

import com.babbarEnterprises.spring.basics.cdi.SomeCDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsCdiApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                SpringIn5StepsCdiApplication.class)) {
            SomeCDIBusiness business = applicationContext.getBean(SomeCDIBusiness.class);

            LOGGER.info("{} dao-{}", business, business.getSomeCDIDAO());
        }
    }
}
