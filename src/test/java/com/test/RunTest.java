package com.test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/reports/cucumberTestes.json"

        },
        features = "src/test/resources/feature",
        tags = "@test",
        glue = "com.test"
)
public class RunTest {

    @AfterClass
    public static void fecharApp() {
        Hooks.quitDriver();
    }
}
