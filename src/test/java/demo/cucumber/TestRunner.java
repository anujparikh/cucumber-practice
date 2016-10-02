package demo.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by anujparikh on 10/2/16.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "feature",
        glue = {"demo.stepDefinition"}
)
public class TestRunner {
}
