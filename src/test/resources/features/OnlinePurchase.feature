
Feature: Add To Cart Features
 

  Scenario Outline: To verify the user can able to add the order purchase in Online website
    Given The launch online website
    When I enter the <Username> and <Password> in login page
    And I Click the login button
    And Go to Men Tab and select Tshirt option
    And Select anyone of Tshirt and Add to Cart
    When I go to Cart page and Select the Order
    And Enter the <Yourname> and <Email> and then <AddReview> and Submit the order
    Then User should get success message

    Examples: 
      | Username          | Password   | Yourname  |Email            |AddReview   |
      | tester55@mail.com |Password@123|Vijayakumar|tester55@mail.com|payment done|
      
