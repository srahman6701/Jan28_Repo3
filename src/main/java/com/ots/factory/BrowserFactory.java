package com.ots.factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.ots.dataprovider.ConfigUtility;

public class BrowserFactory {

	
	public static WebDriver startBrowser(String browser,String appUrl)
	{
		WebDriver driver=null;
		
		if (browser.equalsIgnoreCase("Chrome")|| browser.equalsIgnoreCase("GC")||browser.equalsIgnoreCase("Google Chrome"))
		{
			ChromeOptions opt=new ChromeOptions();
			
			if(ConfigUtility.readProperty("headless").equalsIgnoreCase("true"))
			{
				opt.addArguments("--headless=new");
			}
			
			driver=new ChromeDriver(opt);
		}
		else if(browser.equalsIgnoreCase("Firefox")||browser.equalsIgnoreCase("FF")||browser.equalsIgnoreCase("Mozilla Firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		else if(browser.equalsIgnoreCase("Edge")||browser.equalsIgnoreCase("Microsoft Edge"))
		{
			driver=new EdgeDriver();
			
		}
		else if(browser.equalsIgnoreCase("Safari"))
		{
			driver=new SafariDriver();
			
		}
		else
		{
			System.out.println("Sorry, currently we support chrome, firefox and edge ");
		}
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(Integer.parseInt(ConfigUtility.readProperty("pageloadTime"))));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(Integer.parseInt(ConfigUtility.readProperty("scriptTimeOut"))));
		
		//String implicitWaitTime=ConfigUtility.readProperty("implicitWait");
		//int implicitWait=Integer.parseInt(implicitWaitTime);
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(Integer.parseInt(ConfigUtility.readProperty("implicitWait"))));
		//driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(implicitWait));
		
		driver.manage().window().maximize();
		
		driver.get(appUrl);
		return driver;
		
	}
}
