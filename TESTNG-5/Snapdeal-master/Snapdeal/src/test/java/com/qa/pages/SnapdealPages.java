package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SnapdealPages {

	WebDriver Driver; 
	@FindBy(xpath="//div[@class='accountInner']")
	public static WebElement signin;
	
	@FindBy(xpath="//span[@class='accountBtn btn rippleWhite']")
	public static WebElement login;
	
	@FindBy(xpath="//input[@id='userName']")
	public static WebElement username;
	
	@FindBy(xpath="//button[@id='checkUser']")
	public static WebElement continuebtn;
	
	@FindBy(xpath="//div[@class='screen2']//header")
	public static WebElement header;
	
	public SnapdealPages(WebDriver Driver) {
		this.Driver = Driver;
		PageFactory.initElements(Driver, this);
		
	}
}
