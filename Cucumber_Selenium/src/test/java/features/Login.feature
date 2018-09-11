@FunctionalTest
Feature: Login Feature
  Verify if user is able to Login in to the site
@SmokeTest @RegressionTest
  Scenario: Login as a authenticated user
    Given user is  on "http://sl-etisalatqa-3.systemsltd.local:7001/SalesToolkit/#/Dashboard"
    And User enters "777777777777777" and "Test@123"
    Then Success message is displayed
    
@SmokeTest @RegressionTest
  Scenario: Notify the SWYP Offer
    Given user select the SWYP option
    When Click on Next
    Then user will see the SWYP Offer
    And Click on flip to see offer Details
    Then User will see the Offer Details
    And Click on flip back
    And Select the offer
    And Enter the information to Notify
    Then User will see the Reference Number
    
@SmokeTest @RegressionTest
  Scenario: Notify the ELife Family Offer
    Given user select the ELife family option
    When Click on Next for ELife Family
    Then user will see the ELife Family Offer
    And Click on flip to see ELife Familyoffer Details
    Then User will see the ELife Family Offer Details
    And Click on ELife Family flip back
    And Select the ELife Family offer
    And Enter the information to Notify ELife Family Offer
    Then User will see the Reference Number for ELife Family
    
@SmokeTest @RegressionTest
  Scenario: Notify the ELife Premium Offer
    Given user select the ELife Premium option
    When Click on Next for ELife Premium
    Then user will see the ELife Premium Offer
    And Click on flip to see ELife Premium offer Details
    Then User will see the ELife Premium Offer Details
    And Click on ELife Premium flip back
    And Select the ELife Premium offer
    And Enter the information to Notify ELife Premium Offer
    Then User will see the Reference Number for ELife Premium

@SmokeTest @RegressionTest
  Scenario: Select the Prepaid
    Given user select the Prepaid
    When Click on Next for Prepaid option
    Then user will see the Prepaid Page
 
@SmokeTest @RegressionTest
	Scenario: Select Visitor
	Given user select Visitor
	When Click on Next to Visitor
	Then user will see Vistor Surf Line Offers
	And Click on Flip for Surf Line Details
	Then Surf Line Details will display
	And user Click on Flip back for Surf Line
	And Select the Surf Lne Offer
	And Enter the information to Notify Surf Line Offer
	Then User will display the Reference Number for Surf Line
	
	@SmokeTest @RegressionTest
	Scenario: Select Visitor 
	And Click on Flip for Line Talk & Text Details
	Then Line Talk & Text Details will display
	And user Click on Flip back for Line Talk & Text
	And Select the Line Talk & Text Offer
	And Enter the information to Notify Line Talk & Text Offer
	Then User will display the Reference Number for Line Talk & Text
	
		@SmokeTest @RegressionTest
	Scenario: Select Visitor 
	And Click on Flip for Talk, Text & Surf Details
	Then Talk, Text & Surf Details will display
	And user Click on Flip back for Talk, Text & Surf
	And Select the Talk, Text & Surf Offer
	And Enter the information to Notify Talk, Text & Surf Offer
	Then User will display the Reference Number for Talk, Text & Surf