package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//h2[text()='My Account']")
	WebElement msgheading;
	
	@FindBy(xpath = "//div[@class='list-group']//a[text()='Logout']")
	WebElement lnkLogout;
	
	public boolean isMyAccountPage()
	{
		try
		{
			return(msgheading.isDisplayed());
		}
		catch(Exception e)
		{
		    return (false);
		}
	}
	

	/*public void clickLogout() {
		lnkLogout.click();

	}*/


/*	public void clickLogout() {
		// TODO Auto-generated method stub
		lnkLogout.click();
	}*/


	public void clickLogout() {
		// TODO Auto-generated method stub
		lnkLogout.click();
	}
	
	
	
}
