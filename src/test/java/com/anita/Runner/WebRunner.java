package com.anita.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"com.anita.Web"},
        features = {"src/test/resources/WebFeature"},
        tags = "@web"
)

public class WebRunner {
}
