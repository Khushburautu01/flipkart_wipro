// Page class for Login functionality
package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }
 // Method to close login popup
    public void closePopup() {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {

            WebElement popup = driver.findElement(By.xpath("//button[contains(text(),'✕')]"));

            popup.click();

        } catch (Exception e) {

            System.out.println("Popup not displayed");
        }
    }
 // Method to click login button
    public void clickLogin() {

        WebElement loginBtn = driver.findElement(By.xpath("//span[text()='Login']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", loginBtn);
    }
 // Method to verify login popup
    public boolean verifyLoginPopup() {

        WebElement popupTitle = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));

        return popupTitle.isDisplayed();
    }
}