// Page class for scroll functionality
package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollPage {

	WebDriver driver;
	// Method to scroll webpage
	public ScrollPage(WebDriver driver) {

		this.driver = driver;
	}

	public void scrollDownPage() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,3000)");
	}
}