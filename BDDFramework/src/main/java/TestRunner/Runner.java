package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/main/java/Features/login.feature", glue = "stepDefinition", dryRun = false, monochrome = true

)

public class Runner {

}
