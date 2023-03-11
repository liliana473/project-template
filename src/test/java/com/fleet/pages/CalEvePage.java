package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalEvePage extends BasePage{

    public CalEvePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//input[contains(@data-name,'field__title')]")
    public WebElement title;

    @FindBy(xpath = "//button[@class='btn btn-success action-button']")
    public WebElement button;

  //  @FindBy(xpath = "//span[normalize-space()='Calendar Events']")
   // public WebElement calendarEvents;


   // @FindBy(xpath = "//a[@title='Create Calendar event']")
    //public WebElement createCalendarEvent;

    @FindBy(id ="tinymce")
    public WebElement description;

    @FindBy(xpath = "//p[normalize-space()]")
    public WebElement scrumMeetingMsg;


}
