package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launch();
	}
private static void launch()
{
	try
	{
		System.setProperty("webdriver.chrome.driver","C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
	oBrowser= new ChromeDriver();	
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
