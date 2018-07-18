package com.testNG;

import org.testng.annotations.Test;

public class DependsOn {

	@Test
	public void Login() {
		System.out.println("login method");
		
	}
	
	@Test(dependsOnMethods="Login")
	public void Reg() {
		System.out.println("Register page");
	}
	@Test(dependsOnMethods="Login")
	public void Home() {
		System.out.println("Home page");
	}
	@Test(dependsOnMethods="Login")
	public void Contact() {
		System.out.println("contact page");
	}
}
