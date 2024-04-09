package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reuseablePackage.AdvanceReuseable;

public class ApolloPage extends AdvanceReuseable {
	
	public ApolloPage(WebDriver driver) {
		
		//this.driver = driver;
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath = "(//input[@id='search'])[1]")
	WebElement EnterSearch; 
	

	@FindBy(xpath = "(//a[text()='Book Appointment'])[1]")
	WebElement clickEnterText;
	
	@FindBy(xpath = "//img[@alt='Chennai']")
	WebElement selectCity;
	
	@FindBy(xpath = "//a[@data-speciality-name='General Physician']")
	WebElement selectCateory;
	
	@FindBy(xpath = "//a[text()='Apollo Hospitals Greams Road Chennai']")
	WebElement selectHosiptal;
	
	@FindBy(xpath = "(//button[text()='BOOK AN APPOINTMENT'])[1]")
	WebElement bookDoctor;
	
	@FindBy(xpath = "//p[text()='Quick login using Mobile Number.']")
	WebElement getOTPText;
	


public WebElement getEnterSearch() {
	return EnterSearch;
}

public WebElement getClickEnterText() {
	return clickEnterText;
}

public WebElement getSelectCity() {
	return selectCity;
}

public WebElement getSelectCateory() {
	return selectCateory;
}

public WebElement getSelectHosiptal() {
	return selectHosiptal;
}

public WebElement getBookDoctor() {
	return bookDoctor;
}

public WebElement getOTPText() {
	return getOTPText;
}
}
