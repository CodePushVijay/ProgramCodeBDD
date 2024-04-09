package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseClassHead;
import reuseablePackage.ReusableClass;

public class PageOfContactApp extends ReusableClass {
	
	public PageOfContactApp(WebDriver driver) {
		
		//this.driver =driver;
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	//Login Page
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;

	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@id='submit']")
	WebElement btnSubmit;
	
	//Title of Page
	@FindBy(xpath = "//h1[text()='Contact List']")
	WebElement getHomePageText;
	


	//Contact Home page 
	@FindBy(xpath = "//button[@id='add-contact']")
	WebElement addToContact;
	
	@FindBy(xpath = "//input[@id='firstName']")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@id='lastName']")
	WebElement lastName;
	
	@FindBy(xpath = "//input[@id='birthdate']")
	WebElement birthdate;
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement mail;
	
	@FindBy(xpath = "//input[@id='phone']")
	WebElement phone;
	
	@FindBy(xpath = "//input[@id='street1']")
	WebElement street1;
	
	@FindBy(xpath = "//input[@id='street2']")
	WebElement street2;
	
	@FindBy(xpath = "//input[@id='city']")
	WebElement city;
	
	@FindBy(xpath = "//input[@id='stateProvince']")
	WebElement stateProvince;
	
	@FindBy(xpath = "//input[@id='postalCode']")
	WebElement postalCode;
	
	@FindBy(xpath = "//input[@id='country']")
	WebElement country;
	
	@FindBy(xpath = "//button[@id='submit']")
	WebElement submitForContinue;
	
	@FindBy(xpath = "//p[text()='Click on any contact to view the Contact Details']")
	WebElement displayContactDetails;



public WebElement getEmail() {
	return email;

}

public WebElement getPassword() {
	return password;
}

public WebElement getBtnSubmit() {
	return btnSubmit;
}

public WebElement getAddToContact() {
	return addToContact;
}

public WebElement getFirstName() {
	return firstName;
}

public WebElement getLastName() {
	return lastName;
}

public WebElement getBirthdate() {
	return birthdate;
}

public WebElement getMail() {
	return mail;
}

public WebElement getPhone() {
	return phone;
}

public WebElement getStreet1() {
	return street1;
}

public WebElement getStreet2() {
	return street2;
}

public WebElement getCity() {
	return city;
}

public WebElement getStateProvince() {
	return stateProvince;
}

public WebElement getPostalCode() {
	return postalCode;
}

public WebElement getCountry() {
	return country;
}

public WebElement getSubmitForContinue() {
	return submitForContinue;
}

public WebElement getDisplayContactDetails() {
	return displayContactDetails;
}
public WebElement getGetHomePageText() {
	return getHomePageText;
}

}
