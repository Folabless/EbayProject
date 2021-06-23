package co.uk.ebay.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/co/uk/ebay/features"},
        glue = {"co/uk/ebay/hooks", "co/uk/ebay/stepDefinitions"},
        publish = true
)
public class TestRunner {


}
