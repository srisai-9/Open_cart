package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage {

	public Homepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//locators
	@FindBy(xpath="//span[text()='My Account']")
	WebElement myacn;
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	WebElement register;
	
	@FindBy(linkText = "Login")   // Login link added in step6
	WebElement linkLogin;
	
	public void clickmyacn()
	{
		myacn.click();
	}
	
	public void clickregister()
	{
		register.click();
	}
	public void clickLoginhome()    // added in step6
	{
		linkLogin.click();
	}
	
}
