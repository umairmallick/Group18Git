package com.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * WebDriverFactory Class:
 * Use to create WebDriver(Selenium) object & return it. It will open the browser & maximize it.
 * Method:
 * getDriver(String browserType) - It will check browser type & returns object:
 If "Chrome" - It will set up chrome driver and return new Chrome driver
 */
public class WebDriverFactory {
    public static WebDriver getDriver(String browserType) {
        if (browserType.equalsIgnoreCase("chrome")||browserType.equalsIgnoreCase("googlechrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }
        else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }
        else {
            System.out.println("Invalid browser Please choose Google Chrome or Firefox");
            return null;
        }

        }

    }
