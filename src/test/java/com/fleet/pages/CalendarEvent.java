package com.fleet.pages;

import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CalendarEvent {

    public CalendarEvent() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(css = "dropdown dropdown-level-1 align-menu-right")
    public List<WebElement> activities;


    @FindBy(xpath = "//span[normalize-space()='Calendar Events']")
    public List<WebElement> calendarEvents;


    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalendarEvent;

    @FindBy(id = "#tinymce")
    public WebElement description;


}