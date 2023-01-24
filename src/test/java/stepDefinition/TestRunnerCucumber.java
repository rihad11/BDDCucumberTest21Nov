package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "./src/test/resources/Features",
glue = {"stepDefinition"},
monochrome = true,
//checks if the console output is readable
plugin = {"pretty","html:target/reports"},
// for reporting purpose
//plugin = {"pretty","json:target/reports2"},
//tags = "@ddt",
//what tags in the feature file should be executed
dryRun = false
//checks if all the steps has step definition

//cucumber hooks

)
public class TestRunnerCucumber {

}
