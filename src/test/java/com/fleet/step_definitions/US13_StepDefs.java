package com.fleet.step_definitions;

import com.fleet.pages.DashboardPage;
import com.fleet.pages.VehicleCostPage;
import com.fleet.pages.VehiclesModulePage;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US13_StepDefs {

    VehicleCostPage vehicleCostPage = new VehicleCostPage();
    VehiclesModulePage vehiclesModulePage= new VehiclesModulePage();

    @Then("the user should see expected {string} as below")
    public void the_user_should_see_expected_as_below(List<String> HeaderNames) {
        List<String> actualOptions = BrowserUtils.getElementsText(vehicleCostPage.allVehicleCostCheckBoxHeader);
        Assert.assertEquals(HeaderNames,actualOptions);

    }
    @When("the user clicks the first checkbox")
    public void the_user_clicks_the_first_checkbox() {
       BrowserUtils.sleep(3);
        vehicleCostPage.typeCheckBox.click();

    }



}
