package com.shopping.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.shopping.TestBase.TestBase;

public class LoginPage extends TestBase
{
	
 @FindBy(xpath = "//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]")
 WebElement EmailAddress;
 
 @FindBy(xpath = "//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[3]")
 WebElement Password;
 
 @FindBy(xpath = "//button[contains(text(),'Login')]")
 WebElement LoginButton;
 
 @FindBy(xpath = "//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[2]")
 WebElement Name;
 
 @FindBy(xpath = "//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]")
 WebElement Mail;
 
 @FindBy(xpath = "//button[contains(text(),'Signup')]")
 WebElement SignUpButton;
 
 
 
 public LoginPage() 
 { 
	 PageFactory.initElements(driver, this);
 }
 
 public void Login(String Email, String Pword) 
 {
	 EmailAddress.sendKeys(Email);
	 Password.sendKeys(Pword);
	 LoginButton.click();
	
 }
 public void signup(String name, String mail) {
	 Name.sendKeys(name);
	 Mail.sendKeys(mail);
	 SignUpButton.click();
	 
 }

}
