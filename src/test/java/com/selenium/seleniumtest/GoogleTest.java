package com.selenium.seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {

	String appURL = "https://www.google.com/";
	
	
	@Test
	public void testGoogle(){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Desktop\\SeleniumProject\\project1\\lib\\drivers\\windows\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get(appURL);
		Assert.assertTrue(true);
		driver.close();
	}
}
