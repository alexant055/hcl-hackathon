package org.hackathon;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = {"org.hackathon.stepdefinitions", "org.hackathon.hooks"}, tags = "", dryRun = false)
public class TestRunner {
}
