package org.testing.TestScripts;
import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.assertions.Assert;
import org.testing.base.Base;
import org.testing.pages.LogOut;
import org.testing.pages.Login;
import org.testing.utilities.DateCalculate;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.ScreenShotCapture;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 extends Base {


	@Test
	public void YTLogin () throws InterruptedException, IOException {



		try {
			Login login = new Login(driver,pr);
			login.SignUp();
			Assert asser = new Assert();
			asser.Assertion("https://www.youtube.com/", driver.getCurrentUrl());
			String filename = "C://Users//ankit1//Documents//ScreenShot//TC1_login"+"_"+DateCalculate.calculate_date()+".png";
			ScreenShotCapture.takeScreenshot(driver,filename);

			WebElement trending = driver.findElement(By.xpath(pr.getProperty("Trending")));
			trending.click();
			Thread.sleep(5000);
			String filename2 = "C://Users//ankit1//Documents//ScreenShot//TC1_trending"+"_"+DateCalculate.calculate_date()+".png";
			ScreenShotCapture.takeScreenshot(driver,filename2);

			LogOut logout = new LogOut(driver,pr);
			logout.SignOut();
			LogsCapture.takelogs("TC1","TC1 PASSED" );

		}

		catch(Exception e) {
			String filename = "C://Users//ankit1//Documents//ScreenShot//TC1_exception"+"_"+DateCalculate.calculate_date()+".png";
			ScreenShotCapture.takeScreenshot(driver,filename);
		}
	}
}