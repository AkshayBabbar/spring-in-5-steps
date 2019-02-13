package com.babbarEnterprises.spring.basics.springin5steps;

import com.babbarEnterprises.spring.basics.springin5steps.xml.XMLPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import org.springframework.boot.SpringApplication;

public class SpringIn5StepsXMLContextApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsBasicScopeApplication.class);

    public static void main(String[] args) {


        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml")) {

            LOGGER.info("Beans Loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());

            XMLPersonDAO personDao = applicationContext.getBean(XMLPersonDAO.class);
            LOGGER.info("{} {}", personDao, personDao.getXMLJdbcConnection());
        }
    }


}
