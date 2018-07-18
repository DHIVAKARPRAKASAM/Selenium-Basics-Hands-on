package com.testNG;

import org.testng.annotations.Test;

public class ExpectedException {

	@Test(expectedExceptions=NumberFormatException.class)
	public void sum(){
		String s1="100E";
		Integer.parseInt(s1);
	}
}
