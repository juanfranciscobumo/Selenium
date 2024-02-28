package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage implements SearchPage{
    private final WebDriver driver;

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
    }
    @Override
    public void openUrl() {
        driver.get("http://www.google.com");
    }

    @Override
    public void searchFor(String query) {
        WebElement txtBuscar = driver.findElement(By.cssSelector("textarea[class='gLFyf']"));
        txtBuscar.sendKeys(query);
        txtBuscar.sendKeys(Keys.ENTER);
    }

    @Override
    public String getFirstResultTitle() {
        return driver.getTitle();
    }
}




