package com.rss.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPageObjects {
    WebDriver driver = null;

    By enter_text_search = By.name("q");
    By click_button_search = By.name("btnK");

    public GoogleSearchPageObjects(WebDriver driver) {
        this.driver = driver;
    }

    public void enterTextSearchObject(String text){
        driver.findElement(enter_text_search).sendKeys(text);
    }

    public void clickButtonSearchObject(){
        driver.findElement(click_button_search).sendKeys(Keys.RETURN);
    }

}
