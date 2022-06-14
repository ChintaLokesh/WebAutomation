package com.automation;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example1 {

	WebDriver driver;
	String parentWindow;
	String childWindow;
	@Test
	public void test1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("lokesh");
		
		Select sel= new Select(driver.findElement(By.id("dropdown-class-example")));
		List<WebElement> list=sel.getOptions();
		for(WebElement wb:list)
		{
			System.out.println(wb.getText());
		}
		
		sel.selectByValue("option1");
		sel.selectByVisibleText("Option2");
		Thread.sleep(5000);
		
		
		List<WebElement> list1=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(list1.size());
		for(WebElement wb1:list1)
		{
				wb1.click();
		}
		List<WebElement> list2=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(list1.size());
		for(WebElement wb2:list2)
		{
				wb2.click();
		}
		driver.manage().window().maximize();
		driver.findElement(By.id("openwindow")).click();
		Set<String> set1=driver.getWindowHandles();
		System.out.println(set1.size());
		
		Iterator<String> it=set1.iterator();
		while(it.hasNext())
		{
		 parentWindow=it.next();
		 childWindow=it.next();
		}
		driver.switchTo().window(childWindow);
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
	//	driver.findElement(By.xpath("//a[text()='Practice']")).click();
		driver.close();
		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("opentab")).click();
		Set<String> set2=driver.getWindowHandles();
		System.out.println(set1.size());
		
		Iterator<String> it1=set2.iterator();
		while(it1.hasNext())
		{
		 parentWindow=it1.next();
		 childWindow=it1.next();
		}
		driver.switchTo().window(childWindow);
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentWindow);
		Thread.sleep(5000);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
	}
	   
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}
	
	
}


