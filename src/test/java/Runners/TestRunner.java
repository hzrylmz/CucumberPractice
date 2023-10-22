package Runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber.json",
                "Utilities.Formatter.PrettyReports:target/cucumber-pretty-reports"},
        features = "src/test/Resources/Features",
        glue = "StepDefinitions",
        tags = "",
        dryRun = false
)
public class TestRunner {
}
