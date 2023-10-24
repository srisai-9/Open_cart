package testCases;

//import org.testng.Assert;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.LoginPage;
//import pageObjects.MyAccountPage;
//import pageObjects.MyAccountPage;
import testBase.Baseclass;

public class LoginTest extends Baseclass {
	
	@Test(groups= {"Sanity","Master"})
	public void test_login() throws InterruptedException
	{
		
		logger.info(" **** Strating loginterstcase**");
		
		//try {
			Homepage hp=new Homepage(driver);
			hp.clickmyacn();
			//hp.clickregister();
			hp.clickLoginhome();
			
			LoginPage lp=new LoginPage(driver);
			// lp.clicklogin();
			 Thread.sleep(3000);
			 lp.setemail(rb.getString("email"));
			 lp.setpwd(rb.getString("pwds"));
			 Thread.sleep(1000);
			 lp.clicklogin();
			 
		/* MyAccountPage mac=new MyAccountPage(driver);
			 boolean targetpage=mac.
			 Assert.assertEquals(targetpage, true); */
			 
			
	/*	}
		catch(Exception e)
		{
			Assert.fail();
		} */
		logger.info("***Finished logintest ***");
				
	}
		

}
