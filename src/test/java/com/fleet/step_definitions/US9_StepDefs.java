package com.fleet.step_definitions;

import com.fleet.pages.CalenderEventPage;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US9_StepDefs extends CalenderEventPage {



CalenderEventPage calenderEventPage=new CalenderEventPage();
    @And("Write a number  less than {string} in Repeat Every box")
    public void writeANumberLessThanInRepeatEveryBox(String arg0) {

repeatEvery.clear();
repeatEvery.click();
calenderEventPage.repeatEvery.sendKeys("0");





    }

    @And("Click the Save And Close button")
    public void clickTheSaveAndCloseButton() {

      calenderEventPage.SaveAndCloseButton.click();
    }

    @Then("Verify the app displays “The value have not be less than {string}.")
    public void verifyTheAppDisplaysTheValueHaveNotBeLessThan(String arg0) {

       BrowserUtils.waitForVisibility(calenderEventPage.ErrorMessageLessThan1,5);
       String actualResult=calenderEventPage.ErrorMessageLessThan1.getText();
        String expectedResult="The value have not be less than 1.";
        Assert.assertEquals(actualResult,expectedResult);
    }

    @And("Write a number  more than {string} Repeat Every box")
    public void writeANumberMoreThanRepeatEveryBox(String arg0) {

        repeatEvery.clear();
        calenderEventPage.repeatEvery.sendKeys("100");
    }



    @Then("Verify the app displays “The value have not be more than {string}.")
    public void verifyTheAppDisplaysTheValueHaveNotBeMoreThan(String arg0) {

        BrowserUtils.waitForVisibility(calenderEventPage.ErrorMessageMoreThan99,5);
        String actualResult=calenderEventPage.ErrorMessageMoreThan99.getText();
        String expectedResult="The value have not be more than 99.";
        Assert.assertEquals(actualResult,expectedResult);
    }
}
