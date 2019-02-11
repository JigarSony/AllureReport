package com.demo.AllureReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllureDemoReport {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	@Test(priority=1)
	public void openGoogle() {
		driver.get("https://www.google.com/");
		System.out.println("openGoogle");
		Assert.assertTrue(driver.getTitle().contains("Google"));
	}
	
	@Test(priority=2)
	public void openFacebook() {
		driver.get("https://in.yahoo.com/");
		System.out.println("openFacebook");
		Assert.assertTrue(driver.getTitle().contains("Yahoo"));
	}
	
	@Test(priority=3)
	public void openYahoo() {
		driver.get("https://www.facebook.com");
		System.out.println("openYahoo");
		Assert.assertTrue(driver.getTitle().contains("Facebook – log in or sign up"));
	}
}
