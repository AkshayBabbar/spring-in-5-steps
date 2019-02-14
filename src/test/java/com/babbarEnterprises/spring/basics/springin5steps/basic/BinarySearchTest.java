package com.babbarEnterprises.spring.basics.springin5steps.basic;


import com.babbarEnterprises.spring.basics.springin5steps.SpringIn5StepsBasicApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringIn5StepsBasicApplication.class)
public class BinarySearchTest {

    // Get this bean from the context
    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario() {

        // call method on binarySearch
        int actualResult = binarySearch.binarySearch(new int[]{}, 5);

        // check if the value is correct
        assertEquals(3, actualResult);

    }

}