package com.fleet.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class FeyzaUtils {

    public static List<String> getElementsText(By locator) {

        List<WebElement> elems = Driver.getDriver().findElements(locator);
        List<String> elemTexts = new ArrayList<>();

        for (WebElement el : elems) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }
}
