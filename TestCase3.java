package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configuration.Configuration;

public class TestCase3 {
		public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
			
			System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
			
			WebDriver driver = new ChromeDriver();	
			driver.get("https://www.facebook.com/signup");
			driver.manage().window().maximize();
			
			Sign ss = new Sign(driver);	
			Utility util = new Utility();
			
			//TC01
			ss.enterFirstName(util.readExcelData(1, 0));
			ss.enterLastName(util.readExcelData(1, 1));
			ss.enterEmail(util.readExcelData(1, 2));
			ss.enterNewPassword(util.readExcelData(1, 3));
			ss.enterDay(util.readExcelData(1, 4));
			ss.enterMonth(util.readExcelData(1, 5));
			ss.enterYear(util.readExcelData(1, 6));
			ss.clickOnRadio();
			Thread.sleep(3000);
			driver.navigate().refresh();

			//TC02
			ss.enterFirstName(util.readExcelData(2, 0));
			ss.enterLastName(util.readExcelData(2, 1));
			ss.enterEmail(util.readExcelData(2, 2));
			ss.enterNewPassword(util.readExcelData(2, 3));
			ss.enterDay(util.readExcelData(2, 4));
			ss.enterMonth(util.readExcelData(2, 5));
			ss.enterYear(util.readExcelData(2, 6));
			ss.clickOnRadio();
			Thread.sleep(3000);
			driver.navigate().refresh();

}
}
