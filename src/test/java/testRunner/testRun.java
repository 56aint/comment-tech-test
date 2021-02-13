package testRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Features/Comment.feature", 
		glue = "stepDefinitions", 
		dryRun = false, 
		monochrome = true, 
		plugin = { "pretty", "html:target/cucumber-report.html" },
		publish = true
)

public class testRun {

}
