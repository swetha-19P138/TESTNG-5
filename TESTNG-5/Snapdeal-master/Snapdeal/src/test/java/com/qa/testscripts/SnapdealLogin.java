package com.qa.testscripts;


import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.qa.pages.SnapdealPages;

public class SnapdealLogin extends testbase {
	
	@Test
	public void testcase_001() throws InterruptedException {
		SnapdealPages.signin.click();
		Actions action = new Actions(Driver);
		action.moveToElement(SnapdealPages.signin);
		SnapdealPages.login.click();
		Thread.sleep(3000);
		Driver.switchTo().frame(0);
		SnapdealPages.username.sendKeys("example@gmail.com");
		SnapdealPages.continuebtn.click();
		Thread.sleep(5000);
		if(SnapdealPages.header.getText().equals("Login On Snapdeal")) {
			System.out.println("Logged in Successfully");
		}
		else {
			System.out.println("Login failed");
		}
	}
}
