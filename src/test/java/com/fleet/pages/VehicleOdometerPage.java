package com.fleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleOdometerPage {

    @FindBy(xpath = "//input[@value='1']")
    public static WebElement defaultPageNum;

    @FindBy(xpath = "//button[contains(@class,'btn dropdown-toggle')]")
    public static WebElement defaultViewPerPage;


}
