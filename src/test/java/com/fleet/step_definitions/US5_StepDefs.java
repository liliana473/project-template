package com.fleet.step_definitions;

import com.fleet.pages.DashboardPage;
import com.fleet.pages.VehicleColumnPage;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class US5_StepDefs {

    DashboardPage dashboardPage = new DashboardPage();


    @Then("the user should see below options")
    public void theUserShouldSeeBelowOptions(List<String> expectedOptions) {
        List<String> actualOptions = BrowserUtils.getElementsText(new VehicleColumnPage().columnOptions);

        Assert.assertEquals(actualOptions, expectedOptions);

    }
}





