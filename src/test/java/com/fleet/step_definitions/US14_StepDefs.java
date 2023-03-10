package com.fleet.step_definitions;

import com.fleet.pages.MarketingPage;
import com.fleet.pages.VehiclesModulePage;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
    public void verifyOptionsAreCheckedByDefault(String numOptions) {

    vehiclesModulePage.checkboxIsSelected();


        }


    @And("uncheck one or more filter options")
    public void uncheckOneOrMoreFilterOptions() {
        marketingPage.nameCheckbox.click();
        marketingPage.codeCheckbox.click();


    }

    @Then("verify one or more options are unchecked")
    public void verifyOneOrMoreOptionsAreUnchecked() {
        Assert.assertFalse(marketingPage.nameCheckbox.isSelected()&&marketingPage.checkBoxes.isSelected());


        }




    }




