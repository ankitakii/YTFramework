package org.testing.TestScripts;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testing.base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC10 extends Base {


	@Test
	public void AutoSuggestion() throws InterruptedException {
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
		WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
		search.sendKeys("Roses");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(5000);
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
		WebElement video = driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer']"));
		video.click();
		Thread.sleep(5000);
		WebElement account = driver.findElement(By.xpath("//img[@id='img']"));
		account.click();
		Thread.sleep(1000);
		WebElement signout = driver.findElement(By.xpath("//yt-formatted-string[text()='Sign out']"));
		signout.click();
	
	}
}
