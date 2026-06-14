package com.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CaseStudy3
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
	public void case3()
	{
		
		List<WebElement> totalLinks = driver.findElements(By.xpath("//a"));	
		
		System.out.println("Total Links : " + totalLinks.size());
		
		for(var link : totalLinks)
			System.out.println(link.getText());
		
	}
	
	@AfterTest
	public void close()
	{
		driver.quit();
	}
}
