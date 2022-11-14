Feature: Login Feature
  Verify if user is able to Login in to the site

     
 @Tag2
 		
 		   Scenario: Login as a authenticated user with parameterised value
    Given user is  on homepage
    When user navigates to Login Page
    And user enters "Navya" and "kjhgh"
    Then success message is displayed