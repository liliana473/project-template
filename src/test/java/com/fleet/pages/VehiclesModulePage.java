package com.fleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehiclesModulePage extends BasePage{

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement all_checkboxes;
}
