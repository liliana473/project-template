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

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class US13_StepDefs {

    VehicleCostPage vehicleCostPage = new VehicleCostPage();

    @When("the user clicks the first checkbox")
    public void the_user_clicks_the_first_checkbox() {
       BrowserUtils.sleep(3);
        vehicleCostPage.typeCheckBox.click();

    }


    @Then("the user should see expected below options")
    public void theUserShouldSeeExpectedBelowOptions(List<String>HeaderNames) {
        BrowserUtils.sleep(2);
        List<String> actualOptions=BrowserUtils.getElementsText(vehicleCostPage.allVehicleCostCheckBoxHeader);

        List<String>actualNameOptions=new ArrayList<>();

        for (int i = 1; i < actualOptions.size()-1; i++) {
            actualNameOptions.add(actualOptions.get(i));

        }
        Assert.assertEquals(HeaderNames,actualNameOptions);



    }
}
