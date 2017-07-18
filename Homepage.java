package com.test.automation.uiAutomation.uiAction;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	public static Logger log = Logger.getLogger(Homepage.class.getName());
	
	WebDriver driver;
	
	@FindBy(xpath=".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signIn;
	
	@FindBy(xpath=".//*[@id='email']")
	WebElement email;
	
	@FindBy(xpath=".//*[@id='passwd']")
	WebElement password;
	
	@FindBy(xpath=".//*[@id='SubmitLogin']")
	WebElement submit;
	
	@FindBy(xpath=".//*[@id='center_column']/div[1]/ol/li")
	WebElement invalidLoginText;
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginToApplication(String emailAddress, String passWord)
	{
		signIn.click();
		log.info("Clicked on Sign In and the object is : "+signIn.toString());
		email.sendKeys(emailAddress);
		log.info("Email address entered "+emailAddress+" and object is "+email.toString());
		password.sendKeys(passWord);
		log.info("Password entered "+passWord+" and object is "+password.toString());
		submit.click();
		log.info("Submit button is clicked and object is "+submit.toString());
		
	}
	
	public String getInvalidLoginText()
	{
		log.info("Error message is:"+invalidLoginText.getText());
		return invalidLoginText.getText();
		
	}
}
