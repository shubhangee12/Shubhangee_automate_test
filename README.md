# Shubhangee_automate_test

QA Technical Test:

	1.Automation Test1: Using BlazeDemo

	2.API Testing:Space X

Description:

1.Automation Test1 to test  "https://blazedemo.com/" 

Framework: Selenium + testNG with POM model

      a.  for All Webpages page object class with Web elements and Methods created under src/main/java/Blazedemo.Pages

      b.  Webelements intialized using By 

      c.  Methods for webpages are created in same Class.

      d.  Test method created at location src/test/java/BlazedemoTest

      e. Download Code, open same in Intellij and Run Testng file 

      f.  Automated and non Automated scenarios seperated in below files

              1.FunctionalAutomatedTestSuite.xml
              2.FunctionalNonAutomatedTestSuiteforRegisteredUser.xml
              3.FunctionalNonAutomatedTestSuiteforGuestUser.xml

Note:
for Report in intellij  Please set path for output directory from Run configuration  and check checkbox " Default Report " on listeners
  src\Test\Report\emailable-report.html

Scenarios Needs to be tested before Production deployement

     Guest User:

      TC1:Verify Successful Flight booking and confirmation ID when Valid Departure city and Destnation city provided in input

      TC2:Verify Failure to select Departure City when Invalid city/city not exist in list provided in input

      TC3:Verify Failure to select Destination City when Invalid city/city not exist in list provided

      TC04:Verification of Departure City and Destination City on Choose Flight Screen

      TC05:Verification of Airline name, Flight Number, Price and Total Cost in Passenger Details Screen as on confirmation Screen

      TC06:Verify error Message when invalid input Values given in Passenger details

      TC07:Verify Error message when clicked on Purachse Flight with all input values Empty for all values
	
	

        Registered USer:

        TC01:Verify Error Message on "https://blazedemo.com/login" when clicked on Login with Email and Password Values Null

        TC02:Verify Error Message on "https://blazedemo.com/login" when clicked on Login with Invalid Email 
        Values like abcd, @abcd , abcd@ 

        TC03:Verify Error Message on "https://blazedemo.com/login" when clicked on Login with Valid Email and Password Empty

        TC04:Verify Login Failure with User email is  not registered

        TC05:Verify "Register" link is working and user regiration page is launched

        TC06:Verify "Login" link is working and Login screen is launched

        TC07:Verify on Register Screen when clicked on Register with name,company,email address ,password and confirm password Empty

        TC08:Verify Error Message on Register Screen when any of field is empty 

        TC09:Verify Error Message for invalid email ID entered on Register Screen

        TC10:Verify Successful Flight booking and confirmation ID when Valid Departure city and Destnation city provided in input for Registered User

        TC11:Verify error Message when invalid input Values given in Passenger details for Registered User

        TC12:Verify Error message when clicked on Purachse Flight with all input values Empty for all values

        TC13:Verify Link 'Home' on Homepage are clickable for Registered User

        TC14:Verify Link 'Travel to the World' is Clickable and opening new Page for Registered User

        TC15:Verify Link 'destination of the week ! The Beach !' is Clickable and opening new Page for Registered User

        TC16:Verify"Forgot Password" Link is clickable and launched Reset Password page

        TC17:Verify Error Message when clicked on Send Password Reset Link with email address empty

        TC18:Verify Error Message for invalid email ID entered on Reset Password Page

        TC19:Verify Error Message for email ID not registered entered on Reset Password Page

        TC20:Verfiy Sucess Message for email ID already registered entered on Reset Password Page




2.API Testing:Space X

Tool Used: Postman
Please find attached Colletion in folder Postman_API_Collection/API_Space_X.postman_collection.json

Steps to Run Positive Scenarios:
	
	1.Import collection in Postman
	
	2.Click on Runner 
	
	3.Select API_Space_X
	
	4.Select Positive Scenario
	
	5.Click on API_Space_X
 
This will verify below Positive scenarios for API
		
		1.Verify Endpoint is Valid when hit with Valid method and repsonse code is success
		
		2.Verify Response body for successful response
		
		3.Verify Response Code and body is same  when API hit multiple time 

Steps to Run Negative Scenarios:
	
	1.Import collection in Postman
	
	2.Click on Runner 
	
	3.Select API_Space_X
	
	4.Select Negative Scenario
	
	5.Click on API_Space_X
  
This will verify below Negative scenarios for API  
	
	1.Verify Reponse code when endpoint in invalid and method is valid
	
	2.Verify Reponse code when endpoint is valid and method is invalid
 
