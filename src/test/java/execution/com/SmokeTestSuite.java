package execution.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SmokeTestSuite {
	
	WebDriver driver;
	
	@BeforeClass
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		System.out.println(System.getProperty("user.dir"));
		driver = new ChromeDriver();
	}
	
	@Test
	public void loginTest() {
		System.out.println("Hello");
	}

}
