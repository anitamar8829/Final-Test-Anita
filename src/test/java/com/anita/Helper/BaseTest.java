package com.anita.Helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    protected static WebDriver driver;

    protected WebDriver getDriver() {
        if (driver == null) { // Ensure driver is initialized only once
            System.setProperty("webdriver.chrome.driver", "./src/test/resources/Chromedriver/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--headless");
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        }
        return driver;
    }

    protected void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null; // Reset the driver to prevent reuse
        }
    }

}
