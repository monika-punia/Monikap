package com.cyb.seleniumDay2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SeleniumWithXpath {
	
	public static WebDriver driver;
	
public static void main(String[] args) throws InterruptedException {	
		
		System.setProperty("webdriver.chrome.driver", "F:/Selenium/work/chrome_driver/chromedriver.exe");
		driver =new ChromeDriver();
		
		
				
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		driver.findElement(By.xpath(".//input[@name='firstname']")).sendKeys("abc");
		System.out.println("firstName: " + "abc");
		
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("xyz");
		System.out.println("firstName: " + "xyz");
		
		List<WebElement> inputBox = driver.findElements(By.tagName("input"));
		
		System.out.println(inputBox.size());
		
		String getFirstNameLabel = driver.findElement(By.xpath(".//strong[text()='First name:']")).getText();
		
		System.out.println(getFirstNameLabel);
		
		String getLastNameLabel = driver.findElement(By.xpath(".//strong[text()='First name:']")).getText();
		
		System.out.println(getLastNameLabel);	
		
		Thread.sleep(3000);
		
		driver.close();	
}	

}
