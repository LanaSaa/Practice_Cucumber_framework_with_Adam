package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class DemoQA_Page {

    public DemoQA_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void clickOption(String option){
        String locator = "//li[.='"+option+"']";
        Driver.getDriver().findElement(By.xpath(locator)).click();
    }
}
