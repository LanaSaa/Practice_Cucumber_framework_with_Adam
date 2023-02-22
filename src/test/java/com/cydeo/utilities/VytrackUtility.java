package com.cydeo.utilities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class VytrackUtility {

    public static List<String> getElementsText(List<WebElement> list){
        List<String> textList = new ArrayList<>();
        for (WebElement webElement : list) {
            textList.add(webElement.getText());
        }
        return textList;
    }


}


