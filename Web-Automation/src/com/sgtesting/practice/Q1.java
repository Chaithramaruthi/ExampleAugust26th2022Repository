package com.sgtesting.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchbrowser();	
		navigate();
		search();
		closeApp();
	}
private static void launchbrowser()
{
	try
	{
		System.setProperty("webdriver.chrome.driver","C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
		oBrowser =new ChromeDriver();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void navigate()
{
	try
	{
		oBrowser.get("https://www.youtube.com/");
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
	oBrowser.findElement(By.name("search_query")).sendKeys("Kannada Songs");
	oBrowser.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon")).click();
	Thread.sleep(5000);
	
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void closeApp()
{
	try
	{
	oBrowser.quit();	
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
