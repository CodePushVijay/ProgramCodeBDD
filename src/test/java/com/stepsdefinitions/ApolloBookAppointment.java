package com.stepsdefinitions;

import java.io.FileNotFoundException;

import com.page.ApolloPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import reuseablePackage.AdvanceReuseable;

public class ApolloBookAppointment extends AdvanceReuseable {
	
	public ApolloPage run;
	
	@Given("To launch the Apollo website")
	public void toLaunchTheApolloWebsite() throws FileNotFoundException {
		
		ApolloPage.launchBrowserUrl();
		ApolloPage.waitDuration();
	}
	@When("Go to Search bar and enter as Book Appointment and then Click it")
	public void goToSearchBarAndEnterAsBookAppointmentAndThenClickIt() throws InterruptedException {
		 run=new ApolloPage(driver);
		 
		 Thread.sleep(3000);
		ApolloPage.toEnterKey(run.getEnterSearch(), "Book Appointment");
		
		Thread.sleep(4000);
		ApolloPage.waitDuration();
		
	}
	@When("I Click the Book Appointment character then move to Appointment page")
	public void iClickTheBookAppointmentCharacterThenMoveToAppointmentPage() {
	   
		ApolloPage.toClickBtn(run.getClickEnterText());
		ApolloPage.waitDuration();
	  
	}
	@When("Select the city, Speciality and then Select The Hospital Near You")
	public void selectTheCitySpecialityAndThenSelectTheHospitalNearYou() {
	   
		ApolloPage.toClickBtn(run.getSelectCity());
		ApolloPage.waitDuration();
		ApolloPage.toClickBtn(run.getSelectCateory());
		ApolloPage.waitDuration();
		ApolloPage.toClickBtn(run.getSelectHosiptal());
	  
	}
	@When("while clicking Book Appoinment button")
	public void whileClickingBookAppoinmentButton() {
		
		ApolloPage.toClickBtn(run.getBookDoctor());
	   
	  
	}
	@Then("system should be displayed as Hello guest along with Get OTP")
	public void systemShouldBeDisplayedAsHelloGuestAlongWithGetOTP() {
	   
		ApolloPage.getTextOutput(run.getOTPText());
	}


}
