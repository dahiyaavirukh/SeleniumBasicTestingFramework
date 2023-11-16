package main.java.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.java.BaseTest;

import java.util.List;

import static test.java.BaseTest.driver;

public class Generic {
    public WebElement getWebElement(String identifierType,String identifierValue){
        switch (identifierType){
            case "ID":
                return driver.findElement(By.id(identifierValue));
            case "CSS":
                return driver.findElement(By.cssSelector(identifierValue));
            case "TAGNAME":
                return driver.findElement(By.tagName(identifierValue));
            case "XPATH":
                return driver.findElement(By.xpath(identifierValue));
            default:
                return null;

        }
    }

    public List<WebElement> getListWebElements(String identifierType, String identifierValue){
        switch (identifierType){
            case "ID":
                return driver.findElements(By.id(identifierValue));
            case "CSS":
                return driver.findElements(By.cssSelector(identifierValue));
            case "TAGNAME":
                return driver.findElements(By.tagName(identifierValue));
            case "XPATH":
                return driver.findElements(By.xpath(identifierValue));
            default:
                return null;

        }
    }

    public boolean isVisibleUsingExplicitWait(String xpath){
        try {
            WebDriverWait wait = new WebDriverWait(driver,30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            return true;
        }
        catch (Exception e)
        {
            return false;
        }

    }
}
