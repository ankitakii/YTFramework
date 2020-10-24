package org.testing.TestScripts;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC9 extends Base {

	@Test
	public void YtComment() throws InterruptedException {
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
		List<WebElement> all = driver.findElements(By.id("video-title"));
		WebElement video = all.get(3);
		video.click();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,350)");
		Thread.sleep(5000);
		WebElement comments = driver.findElement(By.xpath("//div[@class='style-scope ytd-comment-simplebox-renderer']"));
		comments.click();
		Thread.sleep(2000);
		WebElement comment = driver.findElement(By.xpath("//div[@class='style-scope yt-formatted-string']"));
		comment.sendKeys("Test Comment");
		Thread.sleep(5000);
		WebElement commentsub = driver.findElement(By.xpath("//ytd-button-renderer[@id='submit-button']/a[1]/paper-button[1]"));
		commentsub.click();
		Thread.sleep(5000);
		WebElement account = driver.findElement(By.xpath("//img[@id='img']"));
		account.click();
		Thread.sleep(1000);
		WebElement signout = driver.findElement(By.xpath("//yt-formatted-string[text()='Sign out']"));
		signout.click();
	}

}