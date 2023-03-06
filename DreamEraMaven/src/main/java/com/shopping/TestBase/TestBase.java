package com.shopping.TestBase;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase
{

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() 
	{
		prop = new Properties();
		
		FileInputStream fis;
		
		try {
			fis = new FileInputStream("C:\\Users\\aksha\\eclipse-workspace\\DreamEraMaven\\src\\main\\java\\com\\shopping\\config\\config.properties");
			
			prop.load(fis);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }	
		}
	
	public void Initialization() 
	{
		
		String browsername = prop.getProperty("browser");
		
		if (browsername.equals("Chrome")){
			driver = new ChromeDriver();
		}
		else {
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(prop.getProperty("testurl"));
	}
 
}
