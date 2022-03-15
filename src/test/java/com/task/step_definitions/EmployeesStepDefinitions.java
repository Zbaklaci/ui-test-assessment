package com.task.step_definitions;
import com.task.pages.TestPage;
import com.task.utilities.BrowserUtils;
import com.task.utilities.ConfigurationReader;
import com.task.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EmployeesStepDefinitions {

    TestPage testPage = new TestPage();

    @Given("user in the employees.html page")
    public void user_in_the_employees_html_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("user clicks  on the View selected data button")
    public void user_clicks_on_the_View_selected_data_button() {
        testPage.clickViewButton();
    }

    @When("user clicks dropDown icon in Steven cell")
    public void userClicksDropDownIconInStevenCell() {
        testPage.clickDropIcon();
    }

    @And("user clicks  checkbox in {string} cell")
    public void userClicksCheckboxInCell(String name) {
        testPage.clickCheckboxesInCell(name);
    }

    @Then("user should not be able to get origin")
    public void userShouldNotBeAbleToGetOrigin() {
        Assert.assertFalse(Driver.get().findElement(By.id("listBoxContentlistBoxSelected")).getText().contains(" is from "));
    }

    @Then("all the employee origins should match following data")
    public void all_the_employee_origins_should_match_following_data(List<String> expectedAllOrigins) {

        List<WebElement> actualAllOrigins = Driver.get().findElements(By.xpath("//*[@id='listBoxSelected']//*[@role='option']"));

        for (int i = 0; i < actualAllOrigins.size(); i++) {
            Assert.assertEquals(actualAllOrigins.get(i).getText(), expectedAllOrigins.get(i) );
        }

    }


    @And("user clicks following employees checkboxes")
    public void user_clicks_following_employees_checkboxes(List<String> names) {
        for (String name : names) {
            if (name.equals("Steven")){
                testPage.clickDropIcon();
                testPage.clickCheckboxesInCell(name);
            }else{
                BrowserUtils.waitForVisibility(testPage.checkbox(name), 3);
                testPage.clickCheckboxesInCell(name);
            }
        }
    }

    @Then("user should be able to get origin {string}")
    public void userShouldBeAbleToGetOrigin(String origin) {

        Assert.assertEquals(Driver.get().findElement(By.xpath("//*[@id='listitem0listBoxSelected']")).getText(),origin);

    }
}
