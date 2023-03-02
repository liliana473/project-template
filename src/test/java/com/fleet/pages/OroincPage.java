package com.fleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OroincPage extends BasePage {

    @FindBy(xpath = "//h1[normalize-space()='Welcome to Oro Documentation']")
    public WebElement oroincTitle;


}
