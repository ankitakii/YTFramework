package org.testing.pages;

import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.base.Base;

public class Login  {

	 WebDriver driver ;
	 Properties pr ;

	public Login(WebDriver driver , Properties pr) {
	 	this.driver=driver;
		this.pr=pr;
	}
	
	public void SignUp () throws InterruptedException {
		WebElement login = driver.findElement(By.xpath(pr.getProperty("LoginButton")));
		login.click();
		WebElement username = driver.findElement(By.xpath(pr.getProperty("UserName")));
		username.sendKeys(pr.getProperty("MailId"));
		driver.findElement(By.xpath(pr.getProperty("Next"))).click();
		Thread.sleep(6000);
		WebElement password = driver.findElement(By.xpath(pr.getProperty("Password")));
		password.sendKeys(pr.getProperty("MailPassword"));
		driver.findElement(By.xpath(pr.getProperty("Next"))).click();
		Thread.sleep(20000);
	}
}
