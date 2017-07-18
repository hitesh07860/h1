package com.test.automation.uiAutomation.homepage;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.TestBase;
import com.test.automation.uiAutomation.uiAction.Homepage;

public class TC001_VerifyLoginwithInvalidCredential extends TestBase {

	public static Logger log = Logger.getLogger(TC001_VerifyLoginwithInvalidCredential.class.getName());
	
	Homepage homepage;
	
	@BeforeTest
	public void setup()
	{
	init();	
	}
	
	@Test
	public void verifyLoginwithInalidCredential()
	{
		log.info("================Starting verifyLoginwithInalidCredential Test================");
		homepage = new Homepage(driver);
		homepage.loginToApplication("test@test.com","793793");
		Assert.assertEquals(homepage.getInvalidLoginText(),"Authentication failed.");
		log.info("================Finished verifyLoginwithInalidCredential Test================");
	 }
	
	@AfterTest
	public void endtest()
	{
		driver.close();
	}

}
