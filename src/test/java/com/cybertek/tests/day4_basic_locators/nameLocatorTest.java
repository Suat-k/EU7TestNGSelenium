package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameLocatorTest {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().fullscreen();
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNameInput= driver.findElement(By.name("full_name"));

        fullNameInput.sendKeys("mike smith");

        //WebElement emailInput = driver.findElement(By.name("email"));

        //emailInput.sendKeys("mike@smith.com");
        driver.findElement(By.name("email")).sendKeys("mike@tom.com");

        //WebElement signUpButton = driver.findElement(By.name("wooden_spoon"));

        //signUpButton.click();

        driver.findElement(By.name("wooden_spoon")).click();













    }
}
