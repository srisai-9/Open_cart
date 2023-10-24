package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="input-email")
	WebElement txtemail;
	
	@FindBy(id="input-password")
	WebElement txtpwd;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginclick;
	
	public void setemail(String email) {
		
		txtemail.sendKeys(email);
	}

	public void setpwd(String pwd9)
	{
		txtpwd.sendKeys(pwd9);
	}
	
	public void clicklogin()
	{
		loginclick.click();
	}

}
	

