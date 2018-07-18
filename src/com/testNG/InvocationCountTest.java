package com.testNG;

import org.testng.annotations.Test;

public class InvocationCountTest {
	@Test(invocationCount=15)
	public void sum() {
		int a=1;
		int b=2;
		int c=a+b;
		System.out.println("sum of a nd b "+c);
	}

}
