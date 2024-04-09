@ApolloLogin
Feature: Functionality of Book Appointment from Appollo website

  @BookAppointment
  Scenario: To verify the user is able to book the appointment in the Apollo website
    Given To launch the Apollo website
    When Go to Search bar and enter as Book Appointment and then Click it
    When I Click the Book Appointment character then move to Appointment page
    And Select the city, Speciality and then Select The Hospital Near You
    And while clicking Book Appoinment button
    Then system should be displayed as Hello guest along with Get OTP
