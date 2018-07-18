package com.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assertverification {
WebDriver driver;

	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}

	@Test
	public void GoogleTitle() {
		String s=driver.getTitle();
		Assert.assertEquals(s,"Google");
	}
	
	@Test
	public void Googlemail() {
		boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
		Assert.assertEquals(b, true);
	}
	
	@Test
	public void GoogleIma() throws InterruptedException {
		boolean c=driver.findElement(By.linkText("Images")).isDisplayed();
		Assert.assertTrue(c);
		
		}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
}
