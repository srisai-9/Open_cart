package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;

import pageObjects.Homepage;
import testBase.Baseclass;

public class accountregistrationtest extends Baseclass {

	

		@Test(groups= {"Regression","Master"})
		public void test_account_Registration() throws InterruptedException 
		{
			logger.debug("aplication logs");
			logger.info("***** starting accountregistrationtest****");;
			//try
			//{
			Homepage hp=new Homepage(driver);
			hp.clickmyacn();
			logger.info("clicked on my account");
			hp.clickregister();
			logger.info("clicked on register account");
			
			AccountRegistrationPage arp=new AccountRegistrationPage(driver);
			logger.info("**  providing customer details **");
			arp.first_name();
			arp.last_name();
			arp.email1(randomeString()+"@gmail.com");
			arp.password();
			Thread.sleep(3000);
			arp.clickagree();
			Thread.sleep(2000);
			arp.continue1();
			
			
			String confmsg=arp.getConfirmationMsg();
			logger.info("** Validating expected message **");
			Assert.assertEquals(confmsg, "Your Account Has Been Created!","Test fail");
			//}
		//	catch(Exception e)
			//{
				logger.error("test failed");
			 //   Assert.fail();	
			
			//}
			logger.info("** finished **");
		}
}
	


