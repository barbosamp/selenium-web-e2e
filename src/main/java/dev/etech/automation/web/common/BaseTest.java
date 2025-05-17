package dev.etech.automation.web.common;

import com.github.javafaker.Faker;
import dev.etech.automation.web.interfaces.AplicacaoWeb;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public Faker faker = new Faker(new Locale("pt-BR"));
    protected void inicializarDriver(AplicacaoWeb aplicacaoWeb){
        
        driver = aplicacaoWeb.getDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.manage().window().maximize();

    }
}
