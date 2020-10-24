package org.testing.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

	public WebDriver driver ;
	public Properties pr ;

	@BeforeMethod
	public void BrowserLaunch () throws IOException {
		System.setProperty("webdriver.chrome.driver","../YTFramework/chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		File f = new File("../YTFramework/Element.properties");
		FileInputStream fi = new FileInputStream(f);
		pr = new Properties();
		pr.load(fi);
	}

	@AfterMethod

	public void BrowserClose () {
		driver.close();
	}
}