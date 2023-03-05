package com.fleet.step_definitions;

import com.fleet.pages.DashboardPage;
import com.fleet.pages.VehiclesModulePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US7_StepDefs {

    DashboardPage dashboardPage = new DashboardPage();
    @When("the user navigates to {string} - {string}")
    public void the_user_navigates_to(String tab, String module) {
        dashboardPage.waitUntilLoaderScreenDisappear();
        dashboardPage.navigateToModule(tab, module);
        dashboardPage.waitUntilLoaderScreenDisappear();

    }

    VehiclesModulePage vehiclesModulePage = new VehiclesModulePage();
    @Then("the user should see all checkboxes are unchecked")
    public void the_user_should_see_all_checkboxes_are_unchecked() {
        vehiclesModulePage.waitUntilLoaderScreenDisappear();
        Assert.assertTrue(!(vehiclesModulePage.all_checkboxes.isSelected()));
        vehiclesModulePage.waitUntilLoaderScreenDisappear();
    }
}
