package com.fleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalenderEventPage extends BasePage {

    @FindBy(xpath = "//a[@class='btn main-group btn-primary pull-right ']")
    public WebElement createCalenderEvent;

    @FindBy(xpath = "//input[@data-name='recurrence-repeat']")
   public WebElement repeatBox;

    @FindBy(xpath = "//div[@class='recurrence-subview-control__item']/label/input[@data-related-field='interval']")
    public WebElement repeatEvery;
    //input[@class='recurrence-subview-control__number']

 //   @FindBy(xpath = "//input[@placeholder='Enter shortcut action']")
 //   public WebElement repeatEvery;


    @FindBy(xpath = "//input[@id='oro_calendar_event_form_allDay-uid-6407d8ca7155c']")
    public WebElement allDayEvent;

    @FindBy(xpath = "//span[@class='validation-failed']/span/span")
    public WebElement errorMessage;

    @FindBy(xpath ="//button[@class=\"btn btn-success action-button\"]")
    public WebElement SaveAndCloseButton;



    @FindBy(xpath="(//span[@class='validation-failed'])[2]//span/span")
    public WebElement ErrorMessage1;


}
