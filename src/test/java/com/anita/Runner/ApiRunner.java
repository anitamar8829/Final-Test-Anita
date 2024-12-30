package com.anita.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"com.anita.API"},
        features = {"src/test/resources/ApiFeature"},
        tags = "@api"
)

public class ApiRunner {
}
