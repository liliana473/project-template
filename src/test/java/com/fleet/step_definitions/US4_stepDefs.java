package com.fleet.step_definitions;

import com.fleet.pages.DashboardPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class US4_stepDefs {
    DashboardPage dashboardPage = new DashboardPage();
    Actions actions = new Actions(Driver.getDriver());

    @When("the user navigates to {string} - {string} module")
    public void theUserNavigatesToModule(String tab, String module) {

        dashboardPage.waitUntilLoaderScreenDisappear();
        dashboardPage.navigateToModule(tab, module);
        dashboardPage.waitUntilLoaderScreenDisappear();

        BrowserUtils.sleep(5);

    }



    @Then("the title contains {string}")
    public void the_title_contains(String title) {

        BrowserUtils.sleep(5);
       String actualTitle = Driver.getDriver().getTitle();
        BrowserUtils.sleep(5);
        Assert.assertEquals(actualTitle,title);







    }
    @Then("the page url is {string}")
    public void the_page_url_is(String Url) {

        String actualURL = Driver.getDriver().getCurrentUrl();
        BrowserUtils.sleep(3);
        Assert.assertEquals(actualURL,Url);


    }




    @Then("users see an error message as: {string}")
    public void users_see_an_error_message_as(String NoPermissionMessage) {
        BrowserUtils.sleep(10);
        dashboardPage.YouHaveNoPermissionMessage.isDisplayed();


    }



}

