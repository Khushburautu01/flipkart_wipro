//package declaration
package baseclass;
//Import required Selenium classes
import java.time.Duration;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
//Base class for browser setup and teardown
public class BaseTest {
	 // Browser initialization method
		public static WebDriver driver;
		public WebDriver initialization() throws InterruptedException {

		    WebDriverManager.chromedriver().setup();

		    ChromeOptions options = new ChromeOptions();

		    // Required for Docker/Linux
		    options.addArguments("--headless=new");
		    options.addArguments("--no-sandbox");
		    options.addArguments("--disable-dev-shm-usage");
		    options.addArguments("--disable-gpu");
		    options.addArguments("--remote-allow-origins=*");
		    options.addArguments("--window-size=1366,768");
		    options.addArguments("--single-process");

		    driver = new ChromeDriver(options);

		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));

		    try {
		        driver.get("https://www.flipkart.com");
		    } catch (Exception e) {
		        System.out.println("Retrying Flipkart launch...");
		        driver.navigate().to("https://www.flipkart.com");
		    }

		    Thread.sleep(3000);

		    return driver;
		}
		 // Take Screenshot
	    public void takeScreenshot(String screenshotName) throws IOException {

	        if (driver == null) {
	            System.out.println("Driver is null. Screenshot skipped.");
	            return;
	        }

	        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	        File destination = new File(
	                "./src/test/resources/screenshots/" + screenshotName + ".png");

	        FileUtils.copyFile(source, destination);

	        System.out.println("Screenshot saved successfully");
	    }

	    // Browser close method
	    public void tearDown() {

	        if (driver != null) {
	            driver.quit();
	            driver = null;
	        }
	    }
	}

