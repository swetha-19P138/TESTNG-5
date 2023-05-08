package com.qa.testscripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.SnapdealPages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testbase 
{
  WebDriver Driver;
  @Parameters({"Browser","Url"})
  @BeforeClass
  public void setup(String Browser,String Url)throws IOException,InterruptedException
  {
	  if(Browser.equalsIgnoreCase("chrome"))
	  {
		  WebDriverManager.chromedriver().setup();
		  Driver=new ChromeDriver();
	  }
	  if(Browser.equalsIgnoreCase("firefox"))
	  {
		  WebDriverManager.firefoxdriver().setup();
		  Driver=new FirefoxDriver();
	  }
	  if(Browser.equalsIgnoreCase("edge")) {
		    WebDriverManager.edgedriver().setup();
			Driver = new EdgeDriver();
		  }
	  SnapdealPages driver=new SnapdealPages(Driver);
	  Driver.navigate().to(Url);
	  Thread.sleep(3000);
  }
	
@AfterClass
public void tearDown() 
{
	Driver.close();
}
}
