package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalEventsPage extends BasePage {

    public CalEventsPage() {


        PageFactory.initElements(Driver.getDriver(), this);


    }

    public void frame() {

        Driver.getDriver().switchTo().frame(0);
// locate the body element using XPath
        WebElement body = driver.findElement(By.xpath("//body[@data-id='oro_calendar_event_form_description-uid-6409008f6d386']"));

// interact with the body element
        body.sendKeys("text");

// switch back to the default content
        driver.switchTo().defaultContent();
    }

    WebDriver driver;
    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Activities']")
    public WebElement activities;


    @FindBy(xpath = "//span[normalize-space()='Calendar Events']")
    public WebElement calEventButton;


    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCal;

    @FindBy(xpath = "//input[contains(@data-name,'field__title')]")
    public WebElement title;

    //  @FindBy(xpath = "//body[@data-id='oro_calendar_event_form_description-uid-6409008f6d386']")
    // public WebElement description;

    @FindBy(id="tinymce")
    public WebElement description;

    @FindBy(xpath = "//button[@class='btn btn-success action-button']")
    public WebElement saveAndClose;

    @FindBy(xpath = "//div[@class='control-label html-property']")
    public WebElement actualTitle;

}

