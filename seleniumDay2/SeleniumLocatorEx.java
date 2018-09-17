package com.cyb.seleniumDay2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocatorEx {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {	
		
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver_win32/chromedriver.exe");
		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		driver.findElement(By.name("firstname")).sendKeys("abc");
		System.out.println("firstName: " + "abc");
		
		driver.findElement(By.name("lastname")).sendKeys("xyz");
		
		driver.findElement(By.id("datepicker")).sendKeys("21-07-2017");
		
		driver.findElement(By.linkText("Link Test")).click();		
		
		Thread.sleep(3000);
		
		boolean verifyTable = driver.findElements(By.className("tsc_table_s13")).size() != 0;
		
		if(verifyTable)
		{
			System.out.println("Element found");
		}
		else
		{
			System.out.println("Element not found");
		}
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Partial Link")).click();
		
		Thread.sleep(3000);
	
		
		driver.close();
	}

}
