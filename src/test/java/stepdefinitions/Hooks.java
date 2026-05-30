package stepdefinitions;

import java.io.IOException;

import baseclass.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseTest {

    @Before
    public void setup() throws InterruptedException {

        initialization();
    }

    @After
    public void tearDownScenario(Scenario scenario) throws IOException {

        // Take screenshot before closing browser
        takeScreenshot(scenario.getName());

        // Close browser safely
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}