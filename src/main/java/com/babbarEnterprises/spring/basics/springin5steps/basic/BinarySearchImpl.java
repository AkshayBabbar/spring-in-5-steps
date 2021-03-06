package com.babbarEnterprises.spring.basics.springin5steps.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Service
public class BinarySearchImpl {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearchFor) {

        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        return 3;
    }

    @PostConstruct
    public void postContruct() {
        LOGGER.info("POST --- CONTRUCT");
    }

    @PreDestroy
    public void preDestroy() {
        LOGGER.info(" ~~~~PRE --- DESTROY");
    }
}