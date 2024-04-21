package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/resources/test design/AmazonValidation.feature"},
        glue = {"stepdef"}
)
public class TestRunner {
}
