package dev.runTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
                snippets = CucumberOptions.SnippetType.CAMELCASE,
                plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
                features = {"./src/test/resources/features"},
                glue = {"dev.etech.automation.web.steps", "dev.etech.automation.web.configuration"},
                tags = "@cadastro")

public class RunTest {

}
