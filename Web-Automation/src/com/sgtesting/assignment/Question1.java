package com.sgtesting.assignment;
//launchBrowser --> navigate --> Login --> CreateUser --> DeleteUser --> Logout--> CloseApplication

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimize();
		creatUser();
		deleteUser();

	}
private static void launchBrowser()
{
	try
	{
		System.setProperty("webdriver.chrome.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
	oBrowser=new ChromeDriver();	
	}catch (Exception e)
	{
		e.printStackTrace();
	}
}
private static void navigate()
{
	try
	{
		oBrowser.get("http://localhost/login.do\r\n");
		Thread.sleep(2000);
	}catch (Exception e)
	{
		e.printStackTrace();
	}
}
private static void login()
{
	try
	{
		oBrowser.findElement(By.id("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
	}catch (Exception e)
	{
		e.printStackTrace();
	}
}
private static void minimize() 
{
	try
	{
	oBrowser.findElement(By.xpath("//*[@id=\"gettingStartedShortcutsPanelId\"]/div[1]")).click();
	Thread.sleep(2000);
	}catch (Exception e)
	{
		e.printStackTrace();
	}
}
private static void creatUser()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.name("firstName")).sendKeys("User1");
		oBrowser.findElement(By.name("lastName")).sendKeys("A");
		oBrowser.findElement(By.name("email")).sendKeys("User1@gmail.com");
		oBrowser.findElement(By.name("username")).sendKeys("First");
		oBrowser.findElement(By.name("password")).sendKeys("user123");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("user123");
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
		Thread.sleep(5000);
	}catch (Exception e)
	{
		e.printStackTrace();
	}
}
private static void deleteUser()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
		Thread.sleep(1000);
		Alert oAlert=oBrowser.switchTo().alert();
		String content=oAlert.getText();
		System.out.println(content);
		oAlert.accept();
		Thread.sleep(2000);
	}catch (Exception e)
	{
		e.printStackTrace();
	}
}
}

