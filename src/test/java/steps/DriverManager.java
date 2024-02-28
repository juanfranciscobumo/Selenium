package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static org.openqa.selenium.PageLoadStrategy.EAGER;

public class DriverManager {
    private final WebDriverConfigurator configurator;
    private WebDriver driver;

    public DriverManager(WebDriverConfigurator configurator) {
        this.configurator = configurator;
    }

    public WebDriver initDriver() {
        driver = configurator.configureDriver();
        return driver;
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
