package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGbasics {

	@BeforeSuite
	public void setup() {
		System.out.println("setup method");
		
	}
	
	@BeforeTest
	public void Lauchbrowser() {
		System.out.println("launching browser");
	}
	
	@BeforeClass
	public void Login() {
		System.out.println("login app");
	}
	
	@BeforeMethod
	public void EnterURL() {
		System.out.println("entering url");
	}
	@Test
	public void ImageTest() {
		System.out.println("Testing image");
	}
	
	@Test
	public void Googletest() {
		System.out.println("Google test case");
	}
	
	@Test
	public void SearchBox() {
		System.out.println("Search bx testing");
	}
	
	@AfterMethod
	public void Logout() {
		System.out.println("Loging out");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("close the browser");
		
	}
	
	@AfterTest
	public void DeleteAllCookies() {
		
		System.out.println("Delete all cookies");
		
	}
	
	
}
