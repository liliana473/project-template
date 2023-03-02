package com.fleet.step_definitions;

import com.fleet.pages.DashboardPage;
import com.fleet.pages.OroincPage;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US2_StepDefs {

    DashboardPage dashboardPage = new DashboardPage();

    @And("the user click on the question icon")
    public void theUserClickOnTheQuestionIcon() {
        BrowserUtils.sleep(10);
        dashboardPage.questionIcon.click();

    }

    @Then("the user should see {string}")
    public void theUserShouldSee(String expectedTitle) {
        BrowserUtils.switchToWindow(expectedTitle);
        Assert.assertEquals(expectedTitle , new OroincPage().oroincTitle.getText());

    }
}
