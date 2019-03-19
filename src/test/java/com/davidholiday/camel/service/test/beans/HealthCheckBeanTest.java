/*
Copyright 2019 Charter Communications, All Rights Reserved
 */
package com.davidholiday.camel.service.test.beans;


import com.davidholiday.camel.service.beans.HealthCheckBean;

import org.junit.Assert;
import org.junit.Test;


/**
 * example test for a bean
 */
public class HealthCheckBeanTest {

    HealthCheckBean healthCheckBean = new HealthCheckBean();

    @Test
    public void happyPathTest() {
        String expectedOutput = "{}";
        String actualOutput = healthCheckBean.getEmptyResponse();
        Assert.assertEquals(
                "what came out of the healthcheck bean isn't what was expected!",
                expectedOutput,
                actualOutput
        );

    }

}
