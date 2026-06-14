package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CaseStudy2 
{
	
	WebDriver driver;
	String url = "https://www.easycalculation.com/";
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	
	@Test
	public void case2()
	{
		
		driver.findElement(By.id("googleSearchId")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//button[@class='search_button']")).click();
		
		String title = driver.getTitle();
		String source = driver.getPageSource();
		int length = driver.getPageSource().length();
		
		System.out.println("url : " +url);
		System.out.println("Source :" + source);
		System.out.println("Length : " + length);	
		
	}
	
	@AfterTest
	public void close()
	{
		driver.quit();
	}
}
