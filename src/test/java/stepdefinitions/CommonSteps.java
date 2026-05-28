package stepdefinitions;
	import org.openqa.selenium.WebDriver;

	import baseclass.BaseTest;
	import io.cucumber.java.en.Given;

	public class CommonSteps extends BaseTest {

	    public static WebDriver driver;

	    @Given("User launches the browser and opens Flipkart website")
	    public void user_launches_the_browser_and_opens_flipkart_website() throws InterruptedException {

	        driver = initialization();
	    }
	}


