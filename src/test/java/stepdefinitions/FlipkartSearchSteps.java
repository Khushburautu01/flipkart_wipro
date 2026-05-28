package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartSearchSteps {

	@Given("User launches browser")
	public void user_launches_browser() {

		System.out.println("Browser launched");
	}

	@When("User searches mobiles")
	public void user_searches_mobiles() {
		
		

		System.out.println("Searching mobiles");
	}

	@Then("Search results should display")
	public void search_results_should_display() {

		System.out.println("Search results displayed");
	}
}