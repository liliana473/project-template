package com.fleet.step_definitions;

import com.fleet.pages.DashboardPage;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class US1_StepDefs extends DashboardPage {


    DashboardPage dashboardPage = new DashboardPage();



    @Then("verify the users see below modules")
    public void verify_the_users_see_below_modules(List<String> modules) {

        List<String> actualOptions = BrowserUtils.getElementsText(dashboardPage.menuOptions);
        Assert.assertEquals(modules,actualOptions);


    }

}
