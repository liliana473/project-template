package com.fleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleCostPage extends BasePage {

    @FindBy(xpath = "(//button[@class='btn btn-default btn-small dropdown-toggle'])[1]/input")
    public WebElement TypeCheckBox;
}
