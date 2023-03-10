package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MarketingPage extends BasePage{


    @FindBy(xpath = "//i[@class='fa-filter hide-text']")
    public WebElement filterIcon;
    @FindBy(xpath = "//a[@class='add-filter-button']")
    public WebElement ManageFilter;

    @FindBy(css = "input[type='checkbox']")//all check box
     public WebElement checkBoxes;

    public void checkboxIsSelected(){
        List<WebElement> eachRow = Driver.getDriver().findElements(By.xpath("//input[@tabindex='-1']"));
        for (int i = 1; i < eachRow.size(); i++) {
            String eachElement = "//table/tbody/tr["+i+"]/td[1]/input";
            WebElement eachCheckbox = Driver.getDriver().findElement(By.xpath(eachElement));
            Assert.assertTrue(eachCheckbox.isSelected());
        }
    }

    public void uncheckBoxes(){
        List<WebElement> uncheckBoxes=Driver.getDriver().findElements(By.cssSelector("input[type='checkbox']"));

    }

 //   @FindBy(xpath = "//div[@class='ui-multiselect-menu ui-corner-all select-filter-widget dropdown-menu']")
//    public WebElement checkBoxes;



    @FindBy(xpath = "//input[@id='ui-multiselect-0-0-option-0']")
    public WebElement nameCheckbox;

    @FindBy(xpath = "//input[@id='ui-multiselect-0-0-option-1']")
    public WebElement codeCheckbox;
    @FindBy(xpath = "//input[@id='ui-multiselect-0-0-option-2']")
    public WebElement startDateCheckbox;
    @FindBy(xpath = "//input[@id='ui-multiselect-0-0-option-3']")
    public WebElement endDateCheckbox;
    @FindBy(xpath = "//input[@id='ui-multiselect-0-0-option-4']")
    public WebElement budgetCheckbox;



}
