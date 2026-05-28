package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pages.ScrollPage;
import baseclass.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScrollSteps extends BaseTest {

	WebDriver driver;

	ScrollPage sp;

	
	
	@When("User scrolls down the page")
	public void user_scrolls_down_the_page() {

		driver = CommonSteps.driver;

		sp = new ScrollPage(driver);

		sp.scrollDownPage();
	}

	@Then("Page should scroll successfully")
	public void page_should_scroll_successfully() {

		String title = driver.getTitle();

		System.out.println(title);

		Assert.assertTrue(driver.getCurrentUrl().contains("flipkart"));

		
	}
}