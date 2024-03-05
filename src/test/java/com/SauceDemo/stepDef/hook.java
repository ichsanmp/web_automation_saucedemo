package com.SauceDemo.stepDef;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

import static com.SauceDemo.helper.utility.quitDriver;
import static com.SauceDemo.helper.utility.startDriver;

public class hook {

    @BeforeAll
    public static void setUp() {
        System.out.println("Before All");
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("After All");
    }

    @Before
    public void beforeTest() {
        System.out.println("Before Test");

        startDriver();
    }

    @After
    public void afterTest() throws InterruptedException {
        System.out.println("After Test");
        quitDriver();
    }
}
