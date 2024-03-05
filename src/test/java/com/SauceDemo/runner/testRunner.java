package com.SauceDemo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.SauceDemo"},
        features = {"src/test/resources"},
        plugin = {"pretty"}
)
public class testRunner {
}
