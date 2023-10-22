package StepDefinitions;

import Utilities.ConfigReader;
import Utilities.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUp() {
        Driver.getDriver().get(ConfigReader.getProperty("urlN11"));
    }


    @After
    public void tearDown(Scenario scenario) {
        /*final byte[] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()){
            scenario.attach(screenshot,"image/png","screenshots");
        }*/
        Driver.quitDriver();
    }
}
