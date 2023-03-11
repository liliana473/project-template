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

import java.util.*;

public class US5_StepDefs {

    DashboardPage dashboardPage = new DashboardPage();


    @Then("the user should see below options")
    public void theUserShouldSeeBelowOptions(List<String> expectedOptions) {

        List<String> allColumnsOptions = BrowserUtils.getElementsText(new VehicleColumnPage().columnOptions);
        List<String> actualOptions=new LinkedList<>();
      for (int i = 0; i < allColumnsOptions.size(); i++) {
          String temp=allColumnsOptions.get(i);
          if (!temp.isEmpty())
              actualOptions.add(temp);

       }

        Set<String> set=new LinkedHashSet<>(actualOptions);
      List<String> actualResult=new LinkedList<>(set);


        System.out.println("actualOptions = " + actualOptions);
        System.out.println("allColumnsOptions = " + allColumnsOptions);
        System.out.println("expectedOptions = " + expectedOptions);
        Assert.assertEquals(expectedOptions, actualResult);



    }


}






