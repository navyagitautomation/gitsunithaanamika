Feature: Login Feature
  Verify if user is able to Login in to the site

     
 @Tag2
 		
 		   Scenario: Login as a authenticated user with parameterised value
    Given homepage
    When Login Page
    And enters "Navya" and "kjhgh"
    Then message is displayed
    
    
    
    
    
    