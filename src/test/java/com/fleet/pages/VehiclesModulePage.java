package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VehiclesModulePage extends BasePage{

    @FindBy(xpath = "//input[@tabindex='-1']")
    public WebElement all_checkboxes;

    public void checkboxIsSelected(){
        List<WebElement> eachRow = Driver.getDriver().findElements(By.xpath("//input[@tabindex='-1']"));
        for (int i = 1; i < eachRow.size(); i++) {
            String eachElement = "//table/tbody/tr["+i+"]/td[1]/input";
            WebElement eachCheckbox = Driver.getDriver().findElement(By.xpath(eachElement));
            Assert.assertTrue(eachCheckbox.isSelected());
        }
    }


    @FindBy(xpath = "(//button[@class='btn btn-default btn-small dropdown-toggle'])[1]//input")
    public WebElement first_checkbox;

    @FindBy(xpath = "(//input[@tabindex='-1'])[2]")
    public WebElement Harley_Shields_checkbox;

}
