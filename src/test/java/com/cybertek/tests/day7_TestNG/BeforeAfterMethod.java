package com.cybertek.tests.day7_TestNG;

import org.testng.annotations.*;

public class BeforeAfterMethod {

    @BeforeClass
    public void cool() {
        System.out.println("print before");
        System.out.println("class");
    }


    @Test

    public void Test3 () {
        System.out.println(" lets do it");


    }

    @Test

    public void test4 () {

        System.out.println("completed");
    }

    @BeforeMethod
    public void Attmp1 () {

        System.out.println("WebDriver, opening browser");
    }
    @AfterMethod
    public void Return () {
        System.out.println("Closing browser");
    }
    @AfterClass

    public void ending() {

        System.out.println("ending with my apologies");
    }



}
