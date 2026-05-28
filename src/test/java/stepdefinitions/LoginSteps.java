// Step definition class for login feature
package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pages.LoginPage;
import baseclass.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseTest {

    WebDriver driver;

    LoginPage lp;
 // Launch Flipkart website
    @Given("User launches the Flipkart website")
    public void user_launches_the_flipkart_website() throws InterruptedException {

        driver = initialization();
    }
 // Click login button
    @When("User clicks Login button")
    public void user_clicks_login_button() {

        lp = new LoginPage(driver);

        lp.closePopup();

        lp.clickLogin();
    }
 // Click login button
    @Then("Login popup should appear")
    public void login_popup_should_appear() {

        Assert.assertTrue(lp.verifyLoginPopup());

    }
}