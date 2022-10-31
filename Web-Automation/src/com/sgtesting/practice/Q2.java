package com.sgtesting.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launch();
		navigate();

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
		oBrowser.get("https://www.w3schools.com/");	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
