package com.fleet.step_definitions;

import com.fleet.pages.CalenderEventPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class US9_StepDefs {

CalenderEventPage calenderEventPage=new CalenderEventPage();
    @And("Write a number  less than {string} in Repeat Every box")
    public void writeANumberLessThanInRepeatEveryBox(String arg0) {


    }

    @And("Click the Save And Close button")
    public void clickTheSaveAndCloseButton() {
    }

    @Then("Verify the app displays “The value have not be less than {string}.")
    public void verifyTheAppDisplaysTheValueHaveNotBeLessThan(String arg0) {
    }

    @And("Write a number  more than {string} Repeat Every box")
    public void writeANumberMoreThanRepeatEveryBox(String arg0) {
    }

    @Then("Verify the app displays “The value have not be more than {string}.")
    public void verifyTheAppDisplaysTheValueHaveNotBeMoreThan(String arg0) {
    }
}
