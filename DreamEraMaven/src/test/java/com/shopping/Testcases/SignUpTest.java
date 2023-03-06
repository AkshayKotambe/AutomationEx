package com.shopping.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shopping.TestBase.TestBase;
import com.shopping.TestPages.HomePage;
import com.shopping.TestPages.LoginPage;
import com.shopping.TestPages.ProfilePage;
import com.shopping.TestPages.SignupPage;

public class SignUpTest extends TestBase
{
  HomePage Home;
  LoginPage Linp;
  SignupPage Sup;
  
  public SignUpTest() 
  {
		super();
	}
  
  @BeforeMethod
  void setup() 
  {
	  Initialization();
	  Home = new HomePage();
	  Linp = new LoginPage();
	  Sup = new SignupPage();
	  }
  
  
  @Test
  void VerifyValidLogin() 
  {
	  Linp = Home.ClickonLogin(); 
	  Linp.signup(prop.getProperty("Name"), prop.getProperty("Mail"));
	  Assert.assertEquals("https://automationexercise.com/signup", "https://automationexercise.com/signup");
	  
	  Sup.SignUP("Passwrd", "FirstName", "LastName", "Compony", "Address", "Address1", "State", "City", "Zipcode", "MobileNumber");
	  
  }
  
  @AfterMethod
  void teradown() 
  {
	  driver.quit();
  }
  
}
