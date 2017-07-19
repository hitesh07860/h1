package test1;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.WrapsElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test99 {

			public static void main(String[] args) throws Throwable {
			System.setProperty("webdriver.chrome.driver", "K:\\eclipse-jee-oxygen-R-win32\\eclipse\\chromedriver_win32\\chromedriver.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability("chrome.switches", Arrays.asList("--incognito"));
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https:##########");
			
			driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("test123");
			WebElement logcheck = driver.findElement(By.xpath("//label[@class='login-checkbox'][@for='remuser']/div"));
			
			if(!logcheck.isSelected()){
			logcheck.click();}
			driver.findElement(By.xpath(".//*[@id='input_10']")).sendKeys("12345");
			
			
			WebElement passcheck = driver.findElement(By.xpath("//label[@class='login-checkbox'] [@for='keepme']/div"));
			
			if(!passcheck.isSelected()){
			passcheck.click();}
			driver.findElement(By.xpath("*//button[@class='btn btn-default login-button'] [@type='submit' ]")).click();
			
			//Thread.sleep(4000);// logut
			//driver.findElement(By.xpath("*//button[@class='md-fab md-primary md-mini md-button md-ink-ripple'][@type='button']")).click();
			//driver.findElement(By.xpath("*//button[@class='md-fab md-raised md-warn md-mini md-button md-ink-ripple'] [@ng-click='logout()']")).click();
			//Thread.sleep(2000);

			//driver.switchTo().alert().dismiss();	
			
			Thread.sleep(3000);
			//WebElement p1 = driver.findElement(By.xpath(".//*[@id='list-parent']/div[2]/div[1]/div[1]/div/div[1]"));
			
			
			
			Actions action = new Actions(driver);
//			action.moveToElement(p1).click().build().perform();
//			System.out.println("clicked");
			
			Thread.sleep(3000);
			WebElement p2 = driver.findElement(By.xpath("//*[@id='list-parent']/div[2]/div[3]/div[1]/div/div[1]"));
			action.moveToElement(p2).click().build().perform();
			System.out.println(driver.getTitle());
			
			Thread.sleep(4000);
			WebElement p3=driver.findElement(By.xpath("*//md-menu/div[@class='light-text text-reading text-normal'][@aria-label='Click to view more options']"));
			action.moveToElement(p3).click().build().perform();
			System.out.println(driver.getTitle());
			
			Thread.sleep(1000);
			WebElement showthread = driver.findElement(By.xpath(".//md-menu-content/md-menu-item[1]/button"));
			action.moveToElement(showthread).click().build().perform();
			System.out.println(driver.getTitle());
			
			Thread.sleep(15000);
			WebElement g1=driver.findElement(By.xpath(".//*[@id='kip']/div[1]/div[4]/div[3]/div/div[1]"));
			action.moveToElement(g1).click().build().perform();
			System.out.println(driver.getCurrentUrl());
			
			Thread.sleep(3000);
			WebElement assist= driver.findElement(By.xpath("*//header/div[6][@class='insa-button1'][@aria-label='INS Assistant']"));
			action.moveToElement(assist).click().build().perform();
			
			Thread.sleep(4000);
			WebElement msgbox=driver.findElement(By.xpath("*//div/md-autocomplete[@class='ng-isolate-scope']/md-autocomplete-wrap"));
//			WebElement q1 = driver.findElement(By.xpath(".//*[@id='ul-63']/li[5]"));
			action.moveToElement(msgbox).click().sendKeys("how").sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).sendKeys(Keys.ENTER).build().perform();
			
			Thread.sleep(15000);
			driver.navigate().back();
			
			Thread.sleep(3000);
			WebElement home = driver.findElement(By.xpath("*//header/md-nav-bar[1]/div/nav/ul/li[1]/button"));
			action.moveToElement(home).click().build().perform();
			
			driver.findElement(By.xpath("*//button[@class='md-fab md-primary md-mini md-button md-ink-ripple'][@type='button']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("*//button[@class='md-fab md-raised md-warn md-mini md-button md-ink-ripple'] [@ng-click='logout()']")).click();
			System.out.println("Logout");
			driver.close();
	
			
			}
}
