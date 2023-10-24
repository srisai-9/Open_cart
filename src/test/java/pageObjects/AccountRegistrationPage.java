package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//locators
	@FindBy(id="input-firstname")
	WebElement firstname;
	
	@FindBy(id="input-lastname")
	WebElement lastname;
	
	@FindBy(id="input-email")
	WebElement email;
	
	@FindBy(id="input-password")
	WebElement pwd;
	
	
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement agree;
	
	@FindBy(xpath="//button[normalize-space()='Continue']")
	WebElement Continue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgconfirmation;
	
	//actions
	public void first_name()
	{
		firstname.sendKeys("swapna");
	}
	
	public void last_name()
	{
		lastname.sendKeys("chintu");
	}
	
	public void email1(String email2)
	{
		email.sendKeys(email2);
	}
	
	public void password()
	{
		pwd.sendKeys("Test123");
	}
	
	public void clickagree()
	{
		agree.click();
	}
	
	
	public void continue1()
	{
		Continue.click();
	}
	
	
	public String getConfirmationMsg() {
		try {
			return (msgconfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}

	
	
	
}
}
