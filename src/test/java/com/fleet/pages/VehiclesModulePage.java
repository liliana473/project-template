package com.fleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehiclesModulePage extends BasePage{

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement all_checkboxes;

    @FindBy(xpath = "(//button[@class='btn btn-default btn-small dropdown-toggle'])[1]//input")
    public WebElement first_checkbox;

    @FindBy(xpath = "(//input[@tabindex='-1'])[2]")
    public WebElement Harley_Shields_checkbox;

}
