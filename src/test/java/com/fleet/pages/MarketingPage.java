package com.fleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketingPage extends BasePage{


    @FindBy(xpath = "//i[@class='fa-filter hide-text']")
    public WebElement filterIcon;
    @FindBy(xpath = "//a[@class='add-filter-button']")
    public WebElement ManageFilter;


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
//*[@id="grid-oro-campaign-grid-182754037"]/div[1]/div/div[2]/ul/li[1]/label/span