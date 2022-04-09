package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sample {

	// Declaration

	@FindBy(xpath = "//input[@id='email']") private WebElement userName;
	@FindBy(xpath = "//input[@id='pass']") private WebElement password;
	@FindBy(xpath = "//button[@name='login']") private WebElement loginBtn;

	// Initialization

	Sample(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// Usage

	public void enterUserName() {
		userName.sendKeys("Tester");
	}

	public void enterPassword() {
		password.sendKeys("12345");
	}

	public void clickOnLogin() {
		loginBtn.click();
	}

}
