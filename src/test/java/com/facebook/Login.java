package com.facebook;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

	public WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() 
	{
		driver=new ChromeDriver();
	}
	
	

@Test
@Parameters("myntra")
public void navigate(String url) 
{
	 driver.get(url);

}

@AfterClass
public void close() 
{
	driver.quit();}

	
}
