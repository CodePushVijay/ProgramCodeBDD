package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import reuseablePackage.AdvanceReuseable;

public class OnlineCartPage extends AdvanceReuseable {
	
	public OnlineCartPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	

}
