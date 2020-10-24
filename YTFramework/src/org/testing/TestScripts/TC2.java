package org.testing.TestScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC2 extends Base{

	


	@Test

	public void YTHistory () throws InterruptedException {
		WebElement login = driver.findElement(By.xpath("//yt-formatted-string[text()='Sign in']"));
		login.click();
		WebElement username = driver.findElement(By.xpath("//input[@id='identifierId']"));
		username.sendKeys("ankitprasadautomation@gmail.com");
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		Thread.sleep(5000);
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Ankit@123");
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		Thread.sleep(5000);
		WebElement trending = driver.findElement(By.xpath("//yt-formatted-string[text()='History']"));
		trending.click();
		Thread.sleep(5000);
		WebElement account = driver.findElement(By.xpath("//img[@id='img']"));
		account.click();
		Thread.sleep(1000);
		WebElement signout = driver.findElement(By.xpath("//yt-formatted-string[text()='Sign out']"));
		signout.click();
	}

	

}
