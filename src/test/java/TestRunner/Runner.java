package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/TestLoging.feature",glue={"StepsDefinitions"},
		plugin={"pretty","html:target/cucumber-html-report"}
		)
public class Runner {

}
