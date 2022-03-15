AutomationTestProject

This project is prepared to test ……. feature test scenarios.

Framework Dependencies: Java-Maven, Selenium, Cucumber, JUnit

Demo file is included:

Tests html report is included. Download all the cucumber-html-reports file content and click on the file report-feature_......

Table of Contents

•	pom.xml file

•	configuration.properties file

•	.feature file

•	pages package (Page Object Model-POM)

•	runners package

•	step_definitions package

•	utilities package

•	test reports and target folder

•	How to run the tests?

pom.xml file

•	This file includes the information, configuration details and dependencies used by Maven to build the project.

•	Public dependencies are used.

configuration.properties file

•	This file is the central repository for the common data used in the tests.

•	It gives us the advantage to change data from one place instead of going into test files and change data one by one.

•	Data is read by ConfigurationReader class which is under the utilities package.

.feature file

•	Test scenarios are written in feature files in Gherkin language format (Given, When, Then)

•	Gherkin language is giving us advantage to read test case steps easily without investigating codes especially for the non-technical personnel.

•	Scenarios can be tagged as @smoke, @regression, @test3 to run specific test cases only.

•	Scenario Outline is used to run same test case with different data. Data is taken from Examples Table. Instead of writing many similar scenarios, you can write only one test case with dynamic data.

•	In scenarios parameters are used to make the scenarios dynamic to used again in other test cases.

pages package (Page Object Model-POM)

•	Page Object Model is used in this package.

•	Locators stored in one class which is named of the specific page it belongs, to be able use reuse them easily.

•	We can create object from that class and call locators which are stored as WebElement variables.


•	When a locator value is changed, we don´t have to investigate all the test suite, we can change the locator from its page class.

•	POM increases the code reusebility and make the maintenance easy. Also increases readability and reliability of the code.
runners package

•	CukesRunner runs the tests and produces report based on its configuration.

•	We configure Cukesrunner by giving feature file and scripts location and input tags if we want to run specific tests.

•	Configuring the plugin will provide us a pretty HTML report.

