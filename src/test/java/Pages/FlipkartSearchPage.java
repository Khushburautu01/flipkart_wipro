package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Reusablefunctions.SeleniumUtility;

public class FlipkartSearchPage {

    WebDriver driver;
    SeleniumUtility su;

    public FlipkartSearchPage(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);

        su = new SeleniumUtility(driver);
    }

    @FindBy(xpath = "//button[text()='✕']")
    WebElement closePopup;

    @FindBy(name = "q")
    WebElement searchBox;

    public void searchProduct(String productName) {

        try {

            try {

                if (closePopup.isDisplayed()) {
                    closePopup.click();
                }

            } catch (Exception e) {

                System.out.println("Popup not displayed");
            }

            // Wait for search box
            su.waitForElement(searchBox);

            // Clear old text
            searchBox.clear();

            // Enter product
            searchBox.sendKeys(productName);

            // Submit search
            searchBox.sendKeys(Keys.ENTER);

            System.out.println("Product searched successfully");

        } catch (Exception e) {

            System.out.println("Search failed: " + e.getMessage());
        }
    }
}