package com.rss.tets;

import com.rss.pages.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
    public static WebDriverManager webDriverManager;

    static void searchingSomethingOnGoogle() throws InterruptedException {
        webDriverManager.chromedriver().setup();
        WebDriver driving_chrome = new ChromeDriver();
        driving_chrome.get("https://www.google.com");
        System.out.println("Lanched Google website on chrome");
        Thread.sleep(3000);
        System.out.println("1 Waiting for some seconds");
        Thread.sleep(2000);
        driving_chrome.manage().window().maximize();
        System.out.println("2 Waiting for some seconds");
        Thread.sleep(2000);
        System.out.println("3 Waiting for some seconds");

        GoogleSearchPage.enterTextSearch(driving_chrome).sendKeys("Black Mountain Road San Diego");
        Thread.sleep(2000);
        System.out.println("4 Waiting for some seconds");

        GoogleSearchPage.clickButtonSearch(driving_chrome).sendKeys(Keys.RETURN);
        Thread.sleep(2000);
        System.out.println("5 Waiting for some seconds");
        
        driving_chrome.close();
        driving_chrome.quit();
        System.out.println("closed and quite driving_chrome");
    }
    public static void main(String[] args) throws InterruptedException {
        searchingSomethingOnGoogle();
    }

}
