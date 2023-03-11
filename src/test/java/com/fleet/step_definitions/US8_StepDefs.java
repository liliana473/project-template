package com.fleet.step_definitions;

import com.fleet.pages.CalenderEventPage;
import com.fleet.pages.DashboardPage;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US8_StepDefs {
    CalenderEventPage calenderEventPage = new CalenderEventPage();

    @When("the user click the Create Calendar Event button")
    public void the_user_click_the_create_calendar_event_button() {
        calenderEventPage.createCalenderEvent.click();

    }
    @Then("Check the Repeat checkbox")
    public void check_the_repeat_checkbox() {

        calenderEventPage.repeatBox.click();


    }

    @And("Verify the repeat number is {string}")
    public void verifyTheRepeatNumberIs(String valueNumber) {
        String actualResult=calenderEventPage.repeatEvery.getAttribute("value");

        String expectedResult= "1";
        Assert.assertEquals(actualResult,expectedResult);


    }

    @And("Clear\\(delete) the number {string}")
    public void clearDeleteTheNumber(String valueNumber) {
        BrowserUtils.waitForVisibility(calenderEventPage.repeatEvery,5);

        calenderEventPage.repeatEvery.clear();


    }

    @Then("Verify the app displays “This value should not be blank.”")
    public void verifyTheAppDisplaysThisValueShouldNotBeBlank() {
        BrowserUtils.waitForVisibility(calenderEventPage.errorMessage,10);
        String actualResult=calenderEventPage.errorMessage.getText();
        String expectedResult="This value should not be blank.";
        Assert.assertEquals(actualResult,expectedResult);


    }
}







//String repeatValue=calenderEventPage.repeatEvery.getAttribute("value");