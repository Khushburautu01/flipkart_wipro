package Reusablefunctions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtility {

    WebDriver driver;

    public SeleniumUtility(WebDriver driver) {

        this.driver = driver;
    }

    // Wait method
    public void waitForElement(WebElement element) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    // Type text
    public void typeText(WebElement element, String text) {

        element.sendKeys(text);
    }

    // Click element
    public void clickElement(WebElement element) {

        element.click();
    }
}