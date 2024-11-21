package com.commands;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demotestng {
	
	
	@AfterTest
	public void Testcase1()
	{
		System.out.println("Testcase1");
	}
	
	@BeforeTest
	public void Testcase2()
	{
		System.out.println("Testcase2");
	}

}
