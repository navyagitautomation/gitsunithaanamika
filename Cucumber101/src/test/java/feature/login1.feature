Feature: Login Feature
  Verify if user is able to Login in to the site

     
 @Tag2
 		
 		   Scenario: Login as a authenticated user with parameterised value
    Given user is  on homepage
    When user navigates to Login Page
    And user enters <username> and <password>
    Then success message is displayed
    
    Examples: 
    
    
    |username|          password|
    |chandan |           ajajjsj|
    | keerthi|            qwerty|
    |Navya   |          ahh1hhk2|
    
  