package com.babbarEnterprises.spring.basics.springin5steps;

import com.babbarEnterprises.spring.basics.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringIn5StepsBasicScopeApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsBasicScopeApplication.class);
//    (SpringIn5StepsBasicScopeApplication.class);
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class);
        PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
        PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);

        LOGGER.info("{}",personDAO);
        LOGGER.info("{}",personDAO.getJdbcConnection());

        LOGGER.info("{}",personDAO1);
        LOGGER.info("{}",personDAO1.getJdbcConnection());
    }
}
