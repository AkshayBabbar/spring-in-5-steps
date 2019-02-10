package com.babbarEnterprises.spring.basics.springin5steps;

import com.babbarEnterprises.spring.basics.componentScan.ComponentPersonDAO;
import com.babbarEnterprises.spring.basics.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.babbarEnterprises.spring.basics.componentScan")
public class SpringIn5StepsComponentScanApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);
//    (SpringIn5StepsBasicScopeApplication.class);
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
        ComponentPersonDAO personDAO = applicationContext.getBean(ComponentPersonDAO.class);
        ComponentPersonDAO personDAO1 = applicationContext.getBean(ComponentPersonDAO.class);

        LOGGER.info("{}",personDAO);
        LOGGER.info("{}",personDAO.getJdbcConnection());

        LOGGER.info("{}",personDAO1);
        LOGGER.info("{}",personDAO1.getJdbcConnection());
    }
}
