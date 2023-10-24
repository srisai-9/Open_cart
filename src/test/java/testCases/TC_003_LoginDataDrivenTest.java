package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

//import pageObjects.HomePage;
import pageObjects.Homepage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
//import testBase.BaseClass;
import testBase.Baseclass;
import utilities.DataProviders;

public class TC_003_LoginDataDrivenTest extends Baseclass {

	
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
	public void test_LoginDDT(String email, String pwd, String exp) {
		logger.info(" Starting TC_003_LoginDataDrivenTest ");

		try {
			Homepage hp = new Homepage(driver);
			hp.clickmyacn();
			hp.clickLoginhome();

			LoginPage lp = new LoginPage(driver);
			lp.setemail(email);
			lp.setpwd(pwd);
			lp.clicklogin();

		/*	MyAccountPage macc=new MyAccountPage(driver);
			boolean targetpage = macc.isMyAccountPage();// this method is created MyAccountPage

			//boolean targetpage;
			if (exp.equals("Valid")) {
				if (targetpage == true) {
					macc.clickLogout();
					Assert.assertTrue(true);
				} else {
					Assert.assertTrue(false);
				}
			}

			if (exp.equals("Invalid")) {
				if (targetpage == true) {
					MyAccountPage myaccpage = new MyAccountPage(driver);
					myaccpage.clickLogout();
					Assert.assertTrue(false);
				} else {
					Assert.assertTrue(true);
				}
			
*/
		MyAccountPage macc=new MyAccountPage(driver);
		boolean target=macc.isMyAccountPage();
		
		if(exp.equals("Valid"))
		{
			if(target==true) {
				macc.clickLogout();
			    Assert.assertTrue(true);
			}else
			{
				Assert.assertTrue(false);
			}
			
		}
		if(exp.equals("InValid"))
		{
			if(target==true) {
				macc.clickLogout();
			    Assert.assertTrue(true);
			}else
			{
				Assert.assertTrue(false);
			}
			
		}
			
		
		} catch (Exception e) {
			Assert.fail();
		}

		logger.info(" Finished TC_003_LoginDataDrivenTest");

	}

}
