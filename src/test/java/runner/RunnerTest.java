package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources"},
        format = {"pretty" ,"json:target/cucumber.json"},
        strict = false,
        monochrome = true,
        glue = "guruStep"
		        )
public class RunnerTest {

}
