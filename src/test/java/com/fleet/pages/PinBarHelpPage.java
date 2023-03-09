package com.fleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PinBarHelpPage extends BasePage{

    @FindBy(xpath ="//a[.='Learn how to use this space']")
    public WebElement LearnHowToUseThisSpaceButton;

    @FindBy(xpath = "//h3[.='How To Use Pinbar']")
    public WebElement HowToUsePinbarMsg;

    @FindBy(xpath = "(//h3[.='How To Use Pinbar']/../p)[1]")
    public  WebElement usePinIconMessage;


    @FindBy(tagName = "img")
    public WebElement PinPageImage;

}
