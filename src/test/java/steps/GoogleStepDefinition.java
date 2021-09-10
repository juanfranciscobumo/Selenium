package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.PageLoadStrategy.EAGER;

public class GoogleStepDefinition {

    public static void main(String[] ar) {
        WebDriver driver;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-infobars");
        options.setPageLoadStrategy(EAGER);
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("http://www.google.com");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement txtBuscar = driver.findElement(By.xpath("//input[@title='Buscar']"));
        txtBuscar.sendKeys("Fútbol");
        txtBuscar.sendKeys(Keys.ENTER);
        WebElement txtTexto = driver.findElement(By.xpath("//div[@id='search']/div/div/div[3]//h3"));
        txtTexto.getText().split(" ")[0].contains("Fútbol");
        driver.quit();
    }
}
