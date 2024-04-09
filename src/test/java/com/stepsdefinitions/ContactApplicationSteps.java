package com.stepsdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.page.PageOfContactApp;

import basePackage.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import reuseablePackage.ReusableClass;

public class ContactApplicationSteps extends ReusableClass {

	public PageOfContactApp call;

	@Given("The launch browser for contact Application")
	public void the_launch_browser_for_contact_application() throws IOException {
		
		//setupConfigForLaunchBrowser();
		//launchingBrowser();
		//launchBrowserUrl();
		baseToLaunchURL();
		take_Screenshot();
	}

	@Given("Enter the username and password")
	public void enter_the_username_and_password() throws IOException {
		call=new PageOfContactApp(driver);
		
		enter_Text(call.getEmail(), "vijay7@mail.com");
		enter_Text(call.getPassword(), "Password@123");
		//contactAppLogin("Username", "Password");
		take_Screenshot();
		 
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() throws IOException {
	  
		btn_Click(call.getBtnSubmit());
		take_Screenshot();
		
	}

	@Then("validates Contact Home page should be displayed")
	public void validates_contact_home_page_should_be_displayed() throws IOException {
		
		waitForImplict();
		get_Textpage(call.getGetHomePageText(), "Contact List");
		//take_Screenshot();
	}


	@Then("Get the title of Contact Application")
	public void get_the_title_of_contact_application() {
	  
		get_TitleOfPage();
		waitDuration();
	}

	@Then("To click the Add contact button")
	public void to_click_the_add_contact_button() throws IOException {
	  
		
	   btn_Click(call.getAddToContact());
	   take_Screenshot();
	}

	@Then("Add the contact details for the users")
	public void add_the_contact_details_for_the_users() {
	  
		enter_Text(call.getFirstName(), "Vijaykumar");
		enter_Text(call.getLastName(), "Santharaman");
		enter_Text(call.getBirthdate(), "1987/11/05");
		enter_Text(call.getMail(), "test07@mail.com");
		enter_Text(call.getPhone(), "8678545623");
		enter_Text(call.getStreet1(), "89,Bala Street, T nagar");
		enter_Text(call.getStreet2(), "Near by Lux Shop");
		enter_Text(call.getCity(), "Chennai");
		enter_Text(call.getStateProvince(), "TN");
		enter_Text(call.getPostalCode(), "600015");
		enter_Text(call.getCountry(), "India");
	   
	}

	@When("I click the Submit button")
	public void i_click_the_submit_button() throws IOException {
	  
	   btn_Click(call.getSubmitForContinue());
	   take_Screenshot();
	}

	@Then("Contact Details should be displayed")
	public void contact_details_should_be_displayed() {
	  
	   get_Textpage(call.getDisplayContactDetails(), "Click on any contact to view the Contact Details");
	}
	
	@Then("Users logout the Contact Application")
	public void users_logout_the_contact_application() {
		close_Browser();
	}

	
	

}
