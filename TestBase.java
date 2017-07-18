package com.test.automation.uiAutomation.testBase;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {
	public static Logger log = Logger.getLogger(TestBase.class.getName());

	public WebDriver driver;
	String url = "http://automationpractice.com/index.php";
	String browser ="chrome";
	
	public void init()
	{
		browserSelecter(browser);
		getUrl(url);
		String log4jpath = "log4j.properties";
		PropertyConfigurator.configure(log4jpath);
	}
	
	
	
	public void browserSelecter(String browser)
	{
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "E:\\eclipse-juno\\chromedriver_win32 (2.29)\\chromedriver.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability("chrome.switches", Arrays.asList("--incognito"));
			log.info("Creating object of browser "+browser);
			driver = new ChromeDriver();
		}
	}
	public void getUrl(String url)
	{
		log.info("Navigating to URL : "+url);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

}
