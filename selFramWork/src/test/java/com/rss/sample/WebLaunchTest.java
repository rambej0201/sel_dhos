package com.rss.sample;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebLaunchTest {
    public static WebDriverManager webDriverManager;

    static void searchingSomethingOnGoogle() throws InterruptedException {
        webDriverManager.chromedriver().setup();
        WebDriver driving_chrome = new ChromeDriver();
        driving_chrome.get("https://www.google.com");
        System.out.println("Lanched Google website on chrome");
        Thread.sleep(3000);
        System.out.println("Waiting for some seconds1");
        Thread.sleep(2000);
        driving_chrome.manage().window().maximize();
        System.out.println("Waiting for some seconds2");
        Thread.sleep(2000);
        System.out.println("Waiting for some seconds3");
        WebElement searchBox = driving_chrome.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("Black Mountain Road San Diego");
        Thread.sleep(2000);
        System.out.println("Waiting for some seconds4");
        //List<WebElement> listOfSearchInputs = (List<WebElement>) driving_chrome.findElement(By.xpath("//input"));
        //System.out.println(listOfSearchInputs.size());
        //driving_chrome.findElement(By.xpath("//input[@class='gNO89b']")).sendKeys(Keys.RETURN);
        driving_chrome.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
        Thread.sleep(2000);
        System.out.println("Waiting for some seconds4");
        driving_chrome.close();
        driving_chrome.quit();
        System.out.println("closed and quite driving_chrome");
    }
    public static void main(String[] args) throws InterruptedException {
        searchingSomethingOnGoogle();
    }

}
