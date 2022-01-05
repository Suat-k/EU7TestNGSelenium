package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tagNameLocator {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().fullscreen();
        driver.get("http://practice.cybertekschool.com/sign_up");

        driver.findElement(By.tagName("input")).sendKeys("Mike Smith with TagName");
        driver.findElement(By.name("email")).sendKeys("tony@joe.com");
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(3000);
        driver.quit();


    }

}
