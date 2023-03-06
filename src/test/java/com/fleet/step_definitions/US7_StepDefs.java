package com.fleet.step_definitions;

import com.fleet.pages.DashboardPage;
import com.fleet.pages.VehiclesModulePage;
import io.cucumber.java.en.And;
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

    @And("the user clicks the first checkbox in the web-table")
    public void theUserClicksTheFirstCheckboxInTheWebTable() {
        vehiclesModulePage.waitUntilLoaderScreenDisappear();
        vehiclesModulePage.first_checkbox.click();

    }

    @Then("the user verifies all checkboxes are checked")
    public void theUserVerifiesAllCheckboxesAreChecked() {

        Assert.assertTrue(vehiclesModulePage.all_checkboxes.isSelected());

    }

    @And("the user clicks any car's checkbox")
    public void theUserClicksAnyCarSCheckbox() {
        vehiclesModulePage.waitUntilLoaderScreenDisappear();
        vehiclesModulePage.Harley_Shields_checkbox.click();

    }

    @Then("the user verifies the box is checked")
    public void theUserVerifiesTheBoxIsChecked() {
        Assert.assertTrue(vehiclesModulePage.Harley_Shields_checkbox.isSelected());
    }
}
