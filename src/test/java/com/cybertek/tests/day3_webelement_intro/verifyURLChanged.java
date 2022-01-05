package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyURLChanged {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInputBox = driver.findElement(By.name("email"));

        emailInputBox.sendKeys("mike@smith.com");

        WebElement retrievePasswordButton= driver.findElement(By.id("form_submit"));

        retrievePasswordButton.click();

        String expectedUrl ="http://practice.cybertekschool.com/email_sent";
        String actualUrl = driver.getCurrentUrl();

        if(expectedUrl.equals(actualUrl)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        driver.quit();


    }



}

