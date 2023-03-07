package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage extends BasePage{

public  DashboardPage(){

    PageFactory.initElements(Driver.getDriver(),this);

}
@FindBy(css = "span[class='title title-level-1']")
    public List<WebElement>mainModules;




}
