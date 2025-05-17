package dev.etech.automation.web.enums;

import dev.etech.automation.web.interfaces.AplicacaoWeb;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public enum Web implements AplicacaoWeb {
    CHROME {
        @Override
        public WebDriver getDriver() {
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            return new ChromeDriver(chromeOptions);
        }
    }
    ;
}
