Feature: sign up functionality
Scenario Outline: sigup verification
When open home page
And enter the username '<uname>'
And enter the firstName
And enter the lastname
And enter the password
And enter the confirm password
And enter the gender
And enter the email
And enter the mobile no
And enter	the date of birth
And enter the address
And enter the security question
And enter the answer
Then click register

Examples:
|uname|
|pratiksudeep|

 Scenario Outline: login
   When enter name '<uname>'
    When enter password '<pswd>'
    And enter login button
 
   Then validate page

    Examples: 
      |uname  |pswd       |
      |lalitha|password123|
  
 Scenario: the one where the user moves to cart whithout adding any item in it
  And search the particular product
  And try to proceed to payment without adding any item in the cart
    



    
