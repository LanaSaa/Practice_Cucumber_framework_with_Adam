package com.cydeo.utilities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class WebDriverFactory {

    public static WebDriver getDriver(String browserType){
       if(browserType.equalsIgnoreCase("chrome")){
          // WebDriverManager.chromedriver().setup();
          return new ChromeDriver();
       }else if(browserType.equalsIgnoreCase("firefox")){
          // WebDriverManager.firefoxdriver().setup();
           return new FirefoxDriver();
       }else{
           System.out.println("Given String doesn't represent any browser.");
           System.out.println("Either that browser does not exist or not currently supported.");
           System.out.println("driver = null");
           return null;
       }
    }

    public static void verifyWordContains(String sentence, String word) {
        if (sentence.contains(word)) {

            System.out.println("PASS");
        } else {
            System.err.println("FAIL");
        }

    }


    public static void clickAndVerifyRadioButton(WebDriver driver, String nameAttributeValue, String expectedIDValue){
        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='" +nameAttributeValue+"']"));

        for (WebElement each : radioButtons) {
            String actualID = each.getAttribute("id");
            System.out.println("actualID = " + actualID);

            if(actualID.equals(expectedIDValue)){
                each.click();
                System.out.println(actualID + " is selected: " + each.isSelected());
                break;
            }
        }
    }
}
