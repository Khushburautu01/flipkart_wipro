// Page class for search functionality
package Pages;

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

    // Login popup close button
    @FindBy(xpath = "//button[text()='✕']")
    WebElement closePopup;
 // Web element for search box
    
    @FindBy(name = "q")
    WebElement searchBox;
    
 // Method to search product
    public void searchProduct(String productName) {
    	try {

            // Handle popup if displayed
            try {

                if (closePopup.isDisplayed()) {

                    closePopup.click();
                }

            } catch (Exception e) {

            }


            // Wait for search box
    		su.waitForElement(searchBox);

            // Clear old text
            searchBox.clear();

            // Enter product
            searchBox.sendKeys(productName);
            
            // Submit search
            searchBox.submit();


            System.out.println("Product searched successfully");

        } catch (Exception e) {

            System.out.println("Search failed: " + e.getMessage());
        }
    }
}
    
