package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/issackabdi/eclipse-workspace/Cucumber01/src/test/resources/Features",
glue = {"StepDefinition"},
monochrome = false,
plugin = {"pretty","junit:target/HtmlReports.xml"},
tags = "@RegressionTest",
dryRun = false
)
public class TestRunner {

}
