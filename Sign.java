package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Sign {

	// Declaration
	@FindBy(xpath = "//input[@name=\"firstname\"]")
	private WebElement firstName;

	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@name='reg_email__']")
	private WebElement email;

	@FindBy(xpath = "//input[@name='reg_passwd__']")
	private WebElement newPassword;

	@FindBy(xpath = "//select[@name=\"birthday_day\"]")
	private WebElement day;

	@FindBy(xpath = "//select[@name='birthday_month']")
	private WebElement month;

	@FindBy(xpath = "//select[@name=\"birthday_year\"]")
	private WebElement year;

	@FindBy(xpath = "(//input[@class=\"_8esa\"])[2]")
	private WebElement radioButton;

	// Initialization
	public Sign(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	// Usage
	public void enterFirstName(String fname) {
		firstName.sendKeys(fname);
	}

	public void enterLastName(String lname) {
		lastName.sendKeys(lname);
	}

	public void enterEmail(String email1) {
		email.sendKeys(email1);
	}

	public void enterNewPassword(String pass) {
		newPassword.sendKeys(pass);
	}

	public void enterDay(String day1) {
		day.sendKeys(day1);
	}

	public void enterMonth(String month1) {
		month.sendKeys(month1);
	}

	public void enterYear(String year1) {
		year.sendKeys(year1);
	}

	public void clickOnRadio() {
		radioButton.click();
	}

	public void selectMonth(String mon) {
		Select sel = new Select(month);
		sel.selectByVisibleText(mon);
	}

}
