package com.shopping.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shopping.TestBase.TestBase;
import com.shopping.TestPages.HomePage;
import com.shopping.TestPages.LoginPage;
import com.shopping.TestPages.ProfilePage;

public class LoginPageTest extends TestBase
{
  HomePage Home;
  LoginPage Loginp;
  ProfilePage Logout;
  
  public LoginPageTest() 
  {
		super();
	}
  
  @BeforeMethod
  void setup() 
  {
	  Initialization();
	  Home = new HomePage();
	  Loginp = new LoginPage();
	  Logout = new ProfilePage();
	  }
  
  @Test
  void VerifyValidLogin() 
  {
	  Loginp = Home.ClickonLogin(); 
	  Loginp.Login(prop.getProperty("EmailAddress"), prop.getProperty("Password"));
	  Assert.assertEquals("https://automationexercise.com/", "https://automationexercise.com/");
	  
  }
  
  @AfterMethod
  void teradown() 
  {
	  driver.quit();
  }
  
}

