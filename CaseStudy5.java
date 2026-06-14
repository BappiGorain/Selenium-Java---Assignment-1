package com.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CaseStudy5 {
    
    WebDriver driver;
    String url = "https://www.amazon.in/";   // Given webpage is not working so i have used this
    
    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }
    
    @Test
    public void case5() throws InterruptedException 
    {
        
    	Thread.sleep(10000);
       
        String title = driver.getTitle();
        int titleLength = title.length();
        System.out.println("Page Title: " + title);
        System.out.println("Title Length: " + titleLength);
        
        
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);
        
        if (url.equals(currentUrl)) {
            System.out.println("URL is Matching");
        } else {
            System.out.println("URL is not Matching");
        }
        
        
        String pageSource = driver.getPageSource();
        int pageSourceLength = pageSource.length();
        System.out.println("Page Source Length: " + pageSourceLength);
        
       
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        int linkCount = elements.size();
        System.out.println("Number of Links: " + linkCount);
        
        System.out.println("All Links:");
        for (WebElement ele : elements) {
            System.out.println(ele.getAttribute("href"));
        }
    }
    
    @AfterTest
    public void close() {
        driver.quit();
    }
}