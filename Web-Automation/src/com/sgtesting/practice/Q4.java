package com.sgtesting.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q4 {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launch();
		navigate();
		search();
		

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
	oBrowser.get("https://www.amazon.in/");	
	Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void search()
{
	try
	{
	oBrowser.findElement(By.linkText("Fashion")).click();
	Thread.sleep(2000);
	WebElement a=oBrowser.findElement(By.xpath("//span[text()='Kids']"));
	Actions oMouse=new Actions(oBrowser);
	Thread.sleep(2000);
	oMouse.moveToElement(a).build().perform();
	Thread.sleep(2000);
	oBrowser.findElement(By.linkText("Clothing")).click();
	Thread.sleep(1000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
