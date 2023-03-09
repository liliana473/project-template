package com.fleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VehicleCostPage extends BasePage {

    @FindBy(xpath = "(//button[@class='btn btn-default btn-small dropdown-toggle'])[1]/input")
    public WebElement typeCheckBox;

    @FindBy(xpath = "(//tr[@Class='grid-header-row'])[1]")
    public List<WebElement> allVehicleCostCheckBoxHeader;


}
