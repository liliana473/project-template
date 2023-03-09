package com.fleet.step_definitions;

import com.fleet.pages.MarketingPage;
import com.fleet.pages.VehiclesModulePage;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US14_StepDefs {

    VehiclesModulePage vehiclesModulePage = new VehiclesModulePage();

    MarketingPage marketingPage = new MarketingPage();
    @Then("the user click the Manage filter button")
    public void the_user_click_the_manage_filter_button() {
       marketingPage.filterIcon.click();
       marketingPage.waitUntilLoaderScreenDisappear();
        marketingPage.ManageFilter.click();

    }


    @And("verify {string} options are checked by default")
    public void verifyOptionsAreCheckedByDefault(String arg0) {
      // marketingPage.ManageFilter.getSize();

        Assert.assertTrue(vehiclesModulePage.all_checkboxes.isSelected());

        }

     

    @And("uncheck one or more filter options")
    public void uncheckOneOrMoreFilterOptions() {
        marketingPage.nameCheckbox.click();
        marketingPage.codeCheckbox.click();
        marketingPage.startDateCheckbox.click();

    }

    @Then("verify one or more options are unchecked")
    public void verifyOneOrMoreOptionsAreUnchecked() {
    //    Assert.assertTrue();

    }



}
