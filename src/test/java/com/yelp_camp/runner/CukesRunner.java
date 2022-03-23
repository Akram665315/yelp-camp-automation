package com.yelp_camp.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/yelp_camp",
        tags = "@chicken",
        dryRun = false
)
public class CukesRunner extends AbstractTestNGCucumberTests {
}
