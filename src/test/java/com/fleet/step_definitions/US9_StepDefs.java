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


    @And("Write a number  more than ninetynine as {int} Repeat Every box")
    public void writeANumberMoreThanRepeatEveryBox(int value) {

        repeatEvery.clear();
        calenderEventPage.repeatEvery.sendKeys(value+"");
    }


    @Then("Verify the app displays {string}")
    public void verifyTheAppDisplays(String expectedMessage) {
        BrowserUtils.waitForVisibility(calenderEventPage.ErrorMessage1,10);
        String actualResult=calenderEventPage.ErrorMessage1.getText();
        Assert.assertEquals(expectedMessage,actualResult);
    }
}
