package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.base.Base;

public class LogOut extends Base {
	
	WebDriver driver ;
	Properties pr ;
	
	public LogOut (WebDriver driver , Properties pr) {
		this.driver=driver;
		this.pr=pr;
	}
	
	public void SignOut() throws InterruptedException {
		WebElement account = driver.findElement(By.xpath(pr.getProperty("Account")));
		account.click();
		Thread.sleep(2000);
		WebElement signout = driver.findElement(By.xpath(pr.getProperty("Signout")));
		signout.click();
	}
	

}
