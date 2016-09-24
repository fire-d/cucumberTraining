package com.upticklowcross.cucumberTraining;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:target/json/cucumber.json", "html:target/html/"},
    features = {"src/test/resources"},tags={"@yahoo"})
public class TestRunner {

}
