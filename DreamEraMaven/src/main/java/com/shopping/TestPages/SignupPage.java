package com.shopping.TestPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.shopping.TestBase.TestBase;

public class SignupPage extends TestBase
{
 
	@FindBy(xpath = "//input[@id='id_gender1']")
	 WebElement Gender;
	
	@FindBy(xpath = "//input[@id='password']")
	 WebElement Passwrd;
	
	@FindBy(xpath = "//select[@id='days']")
	 WebElement Day;
	
	@FindBy(xpath = "//select[@id='months']")
	 WebElement Month;
	
	@FindBy(xpath = "//select[@id='years']")
	 WebElement Year;
	
	@FindBy(xpath = "//input[@id='newsletter']")
	 WebElement Checkbox;
	
	@FindBy(xpath = "//input[@id='optin']")
	 WebElement Checkbox1;
	
	@FindBy(xpath = "//input[@id='first_name']")
	 WebElement FirstName;
	
	@FindBy(xpath = "//input[@id='last_name']")
	 WebElement LastName;
	
	@FindBy(xpath = "//input[@id='company']")
	 WebElement Compony;
	
	@FindBy(xpath = "//input[@id='address1']")
	 WebElement Address;
	
	@FindBy(xpath = "//input[@id='address2']")
	 WebElement Address1;
	
	@FindBy(xpath = "//input[@id='state']")
	 WebElement State;
	
	@FindBy(xpath = "//input[@id='city']")
	 WebElement City;
	
	@FindBy(xpath = "//input[@id='zipcode']")
	 WebElement Zipcode;
	
	@FindBy(xpath = "//input[@id='mobile_number']")
	 WebElement MobileNumber;
	
	@FindBy(xpath = "//button[contains(text(),'Create Account')]")
	 WebElement CreateAccount;
	
	
	public SignupPage() 
	 { 
		 PageFactory.initElements(driver, this);
	 }
	 
	public void SignUP(String Pword, String Fname, String Lname, String com, String Ad1, String Ad2, String state, String city, String zcode, String Mobno) 
	 {
		 Gender.click();
		 Passwrd.sendKeys(Pword);
		 Select Days = new Select(Day);
	     Days.selectByVisibleText("10");
	     Select Months = new Select(Month);
	     Months.selectByVisibleText("December");
	     Select Years = new Select(Year);
	     Years.selectByVisibleText("1995");
	     
	     JavascriptExecutor Scrolldown = (JavascriptExecutor)driver;
	      Scrolldown.executeScript("window.scrollBy(0,600)");
		 Checkbox.click();
		 Checkbox1.click();
		 FirstName.sendKeys(Fname);
		 LastName.sendKeys(Lname);
		 Compony.sendKeys(com);
		 
		 JavascriptExecutor Scrolldown2 = (JavascriptExecutor)driver;
	      Scrolldown2.executeScript("window.scrollBy(0,400)");
		 Address.sendKeys(Ad1);
		 Address.sendKeys(Ad2);
		 State.sendKeys(state);
		 City.sendKeys(city);
		 Zipcode.sendKeys(zcode);
		 MobileNumber.sendKeys(Mobno);
		 CreateAccount.submit();;
		
	 
		 
	 }

	
	
	
}
