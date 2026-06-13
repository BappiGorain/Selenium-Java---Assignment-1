package com.assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CaseStudy1 
{
	WebDriver driver;
	String url = "https://www.login.hiox.com/register?referrer=easycalculation.com";
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void case1()
	{
		
		String title = driver.getTitle();
		String source = driver.getPageSource();
		int length = driver.getPageSource().length();
		System.out.println("url : " + url);
		System.out.println("Source :" + source);
		System.out.println("Length : " + length);
		
	}
	
	@AfterTest
	public void close()
	{
		driver.quit();
	}
	
	
	
}
