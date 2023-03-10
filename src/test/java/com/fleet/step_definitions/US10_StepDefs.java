package com.fleet.step_definitions;

import com.fleet.pages.CalEvePage;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US10_StepDefs {

    WebElement driver;
    CalEvePage calEvePage = new CalEvePage();


    @When("user enters value in the Description field")
    public void user_enters_value_in_the_description_field() {
        calEvePage.waitUntilLoaderScreenDisappear();
        calEvePage.title.sendKeys("Cydeo");
        Driver.getDriver().switchTo().frame(0);
        calEvePage.description.sendKeys("Scrum Daily Meeting");
        Driver.getDriver().switchTo().defaultContent();
        calEvePage.button.click();
    }

    @Then("the user Verify the {string} is written in the input box")
    public void the_user_verify_the_is_written_in_the_input_box(String expected) {
     String actualResult = calEvePage.scrumMeetingMsg.getText();
     Assert.assertEquals(actualResult,expected);



    }





}
