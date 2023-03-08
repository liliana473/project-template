package com.fleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalenderEventPage extends BasePage {

    @FindBy(xpath = "//a[@class='btn main-group btn-primary pull-right ']")
    public WebElement createCalenderEvent;

    @FindBy(xpath = "//input[@data-name='recurrence-repeat']")
    public WebElement repeatBox;

    @FindBy(xpath = "//input[@class='recurrence-subview-control__number']")
    public WebElement repeatEvery;

    @FindBy(xpath = "//input[@id='oro_calendar_event_form_allDay-uid-6407d8ca7155c']")
    public WebElement allDayEvent;

    @FindBy(xpath = "//span[@class='validation-failed']/span/span")
    public WebElement errorMessage;



}
