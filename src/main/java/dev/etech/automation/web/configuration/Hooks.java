package dev.etech.automation.web.configuration;

import dev.etech.automation.web.common.BaseTest;
import dev.etech.automation.web.enums.Web;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.ScreenshotException;

public class Hooks extends BaseTest {

    @Before
    public void beforeTest() {
        super.inicializarDriver(Web.CHROME);
    }

    @After
    public void afterTest(Scenario scenario) {
        try {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        } catch (ScreenshotException ex) {
            ex.printStackTrace();
        }
        driver.quit();

    }
}
