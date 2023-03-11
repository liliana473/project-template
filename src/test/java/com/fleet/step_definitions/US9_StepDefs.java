package com.fleet.step_definitions;

import com.fleet.pages.CalenderEventPage;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US9_StepDefs extends CalenderEventPage {



CalenderEventPage calenderEventPage=new CalenderEventPage();
    @And("Write a number  less than one as {int} in Repeat Every box")
    public void writeANumberLessThanInRepeatEveryBox(int value) {
BrowserUtils.sleep(3);
repeatEvery.clear();

calenderEventPage.repeatEvery.sendKeys(value+"");





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

    @And("Write a number  more than ninetynine as {int} Repeat Every box")
    public void writeANumberMoreThanRepeatEveryBox(int value) {

        repeatEvery.clear();
        calenderEventPage.repeatEvery.sendKeys(value+"");
    }



    @Then("Verify the app displays “The value have not be more than {string}.")
    public void verifyTheAppDisplaysTheValueHaveNotBeMoreThan(String arg0) {

        BrowserUtils.waitForVisibility(calenderEventPage.ErrorMessageMoreThan99,5);
        String actualResult=calenderEventPage.ErrorMessageMoreThan99.getText();
        String expectedResult="The value have not be more than 99.";
        Assert.assertEquals(actualResult,expectedResult);
    }
}
