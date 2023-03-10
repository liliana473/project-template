package com.fleet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VehicleColumnPage extends BasePage {

    @FindBy(css = ".grid-header-cell__label")
    public List<WebElement> columnOptions;



}



