package com.shopping.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shopping.TestBase.TestBase;
import com.shopping.TestPages.HomePage;

public class HomePageTest extends TestBase 
{
 
	HomePage Home;
	
	@BeforeMethod
	void setup() 
	{
		Initialization();
		Home= new HomePage();
	}
	
	public HomePageTest() 
	{
		super();
		
	}
	@Test
	void VerifyTitle() 
	{
		String Title = Home.Verifytitle();
		Assert.assertEquals(Title, "Automation Exercise");
	}
	@Test
	void VerifyHomePageLanding() 
	{
		boolean ElementVisible = Home.VerifyHomePage();
		Assert.assertEquals(true, ElementVisible);
		
	}
	
	
	@AfterMethod
	void teradown() 
	{
		driver.quit();
	}
	
}
