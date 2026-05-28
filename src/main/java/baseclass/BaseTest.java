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
import io.github.bonigarcia.wdm.WebDriverManager;
//Base class for browser setup and teardown
public class BaseTest {
	 // Browser initialization method
		public static WebDriver driver;
		public WebDriver initialization() throws InterruptedException {
			
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				 BaseTest.driver = driver;
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://www.flipkart.com");
				Thread.sleep(3000);
				return driver;
			}
		//take screenshot
		public void takeScreenshot(String screenshotName) throws IOException {

		    File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		    File destination = new File("./src/test/resources/screenshots/" + screenshotName + ".png");

		    FileUtils.copyFile(source, destination);

		    System.out.println("Screenshot saved successfully");
		}
		 // Browser close method
		public void tearDown() {
			if(driver != null) {
			driver.quit();
		}
		
		}
}

