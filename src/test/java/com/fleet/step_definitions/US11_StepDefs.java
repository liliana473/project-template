package com.fleet.step_definitions;


import com.fleet.pages.DashboardPage;
import com.fleet.pages.VehicleOdometerPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US11_StepDefs {


    DashboardPage dashboardPage = new DashboardPage();
    Actions actions = new Actions(Driver.getDriver());

    @Then("users see an error message as: {string}")
    public void users_see_an_error_message_as(String NoPermissionMessage) {
        BrowserUtils.sleep(10);
        dashboardPage.YouHaveNoPermissionMessage.isDisplayed();
    }

    String expectedDefaultPageNum = "1";

    @Then("the user verifies the default page number is 1")

    public void theUserVerifiesTheDefaultPageNumberIs1() {

        String actualDefaultPageNum = VehicleOdometerPage.defaultPageNum.getText();

        Assert.assertEquals(actualDefaultPageNum, expectedDefaultPageNum);

    }

    String expectedDefaultViewPerPageNum = "25";

    @Then("the user verifies the default view per page is 25")
    public void theUserVerifiesTheDefaultViewPerPageIs25() {

        String actualDefaultViewPerPageNum = VehicleOdometerPage.defaultViewPerPage.getText();

        Assert.assertEquals(actualDefaultViewPerPageNum, expectedDefaultViewPerPageNum);

    }


}