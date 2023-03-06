package com.shopping.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.shopping.TestBase.TestBase;

public class ProfilePage extends TestBase
{
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")
	 WebElement Logout;
	
	
	public ProfilePage ClickonLogout()
	{
		Logout.click();
		return new ProfilePage();
	}
}
