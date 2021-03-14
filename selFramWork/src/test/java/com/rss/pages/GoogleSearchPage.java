package com.rss.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
    private static WebElement element = null;

    public static WebElement enterTextSearch(WebDriver driver){
        element = driver.findElement(By.name("q"));
        return element;
    }
    public static WebElement clickButtonSearch(WebDriver driver){
        element = driver.findElement(By.name("btnK"));
        //element = driver.findElement(By.xpath("//input[@class='gNO89b']"));
        return element;
    }
}
