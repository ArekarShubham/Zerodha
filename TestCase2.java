package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configuration.Configuration;

public class TestCase2 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		
		SignUpPage ss = new SignUpPage(driver);
		
		//TC01
		ss.enterFirstName("Rahul");
		ss.enterLastName("Dravid");
		ss.enterEmail("abc@gmail.com");
		ss.enterNewPassword("xyz");
		ss.enterDay("25");
		ss.enterMonth("Mar");
		ss.enterYear("1994");
		ss.clickOnRadio();
		Thread.sleep(3000);
		driver.navigate().refresh();

		
		//TC02
		ss.enterFirstName("Steve");
		ss.enterLastName("Smith");
		ss.enterEmail("xyz@gmail.com");
		ss.enterNewPassword("abc");
		ss.enterDay("07");
		ss.enterMonth("July");
		ss.enterYear("1990");
		ss.clickOnRadio();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		//TC03
		ss.enterFirstName("Rohit");
		ss.enterLastName("Sharma");
		ss.enterEmail("pqr@gmail.com");
		ss.enterNewPassword("pqr");
		ss.enterDay("10");
		ss.enterMonth("Dec");
		ss.enterYear("1983");
		ss.clickOnRadio();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		
}
}
