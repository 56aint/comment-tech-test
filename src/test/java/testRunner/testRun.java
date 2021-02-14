package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = ".//Features/Comment.feature",
  glue = {"stepDefinitions"},
  dryRun = false,
  monochrome = true,
  plugin = { "pretty", "html:target/cucumber-report.html" },
  publish = true
)
public class testRun {}
