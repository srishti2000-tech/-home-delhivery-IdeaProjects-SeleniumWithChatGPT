package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class testscript {
    private  WebDriver driver;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/home/delhivery/Desktop/chromedriver");
         driver = new ChromeDriver();
    }

    @Test()

        public void testCase(){


    }
    @AfterClass
    public void tearDown(){

        driver.quit();
    }


    }




