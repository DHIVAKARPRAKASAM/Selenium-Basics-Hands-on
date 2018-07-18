package com.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	
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

	
	@Test(priority=1)
	public void Googlemail() {
		boolean b=driver.findElement(By.linkText("mail")).isDisplayed();
		System.out.println(b);
	}
	@Test(priority=2)
	public void GoogleIma() throws InterruptedException {
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(2000);	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
		
	}

	
}
