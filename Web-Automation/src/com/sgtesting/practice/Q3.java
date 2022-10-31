package com.sgtesting.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launch();
		navigate();
		mouseMovement();
	}
	private static void launch()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
		oBrowser.get("https://www.flipkart.com/");	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void mouseMovement()
	{
		try
		{
		oBrowser.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
