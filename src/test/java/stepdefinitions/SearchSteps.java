package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pages.FlipkartSearchPage;
import baseclass.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

// Step definition class for search feature
public class SearchSteps extends BaseTest {

    WebDriver driver;

    FlipkartSearchPage sp;

    @When("User searches for {string}")
    public void user_searches_for(String product) {

        driver = CommonSteps.driver;

        sp = new FlipkartSearchPage(driver);

        sp.searchProduct(product);
    }

    @Then("User should navigate to the search results page")
    public void user_should_navigate_to_the_search_results_page() {

        String currentUrl = driver.getCurrentUrl();

        System.out.println(currentUrl);

        Assert.assertTrue(
                currentUrl.contains("search"),
                "Search results page not opened");
    }
}