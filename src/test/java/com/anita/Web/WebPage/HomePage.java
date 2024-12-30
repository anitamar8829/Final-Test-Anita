package com.anita.Web.WebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class HomePage {
    WebDriver driver;

    // Web Element

    By linkHome = By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a");
    By linkTextPhones = By.linkText("Phones");
    By linkTextLaptops = By.linkText("Laptops");
    By linkTextMonitors = By.linkText("Monitors");
    By linkTextSamsungGS6 = By.linkText("Samsung galaxy s6");
    By linkTextNokia1520 = By.linkText("Nokia lumia 1520");
    By linkTextNexus6 = By.linkText("Nexus 6");
    By linkTextSamsungGS7 = By.linkText("Samsung galaxy s7");
    By linkTextIp6 = By.linkText("Iphone 6 32gb");
    By linkTextSonyZ5 = By.linkText("Sony xperia z5");
    By linkTextHTCM9 = By.linkText("HTC One M9");
    By linkTextVaioI5 = By.linkText("Sony vaio i5");
    By linkTextVaioI7 = By.linkText("Sony vaio i7");
    By linkTextAppleMonitor = By.linkText("Apple monitor 24");
    By linkTextMBAir = By.linkText("MacBook air");
    By linkTextDellI78gb = By.linkText("Dell i7 8gb");
    By linkTextDell156Inch = By.linkText("2017 Dell 15.6 Inch");
    By linkTextASUSHD = By.linkText("ASUS Full HD");
    By linkTextMBPro = By.linkText("MacBook Pro");
    By addToCart = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickLinkTextPhones() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextPhones));
        try {
            Thread.sleep(2000); // Add a delay after the wait
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset the interrupted status
            throw new RuntimeException("Thread was interrupted", e);
        }
        driver.findElement(linkTextPhones).click();
    }

    public void clickLinkTextLaptops() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextLaptops));
        try {
            Thread.sleep(2000); // Add a delay after the wait
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset the interrupted status
            throw new RuntimeException("Thread was interrupted", e);
        }
        driver.findElement(linkTextLaptops).click();
    }

    public void clickLinkTextMonitors() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextMonitors));
        try {
            Thread.sleep(2000); // Add a delay after the wait
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset the interrupted status
            throw new RuntimeException("Thread was interrupted", e);
        }
        driver.findElement(linkTextMonitors).click();
    }

    public void clickLinkTextSamsungGS6() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextSamsungGS6));
        driver.findElement(linkTextSamsungGS6).click();
    }

    public void clickLinkTextSamsungGS7() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextSamsungGS7));
        driver.findElement(linkTextSamsungGS7).click();
    }

    public void clickLinkTextNokia1520() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextNokia1520));
        driver.findElement(linkTextNokia1520).click();
    }

    public void clickLinkTextNexus6() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextNexus6));
        driver.findElement(linkTextNexus6).click();
    }

    public void clickLinkTextIp6() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextIp6));
        driver.findElement(linkTextIp6).click();
    }

    public void clickLinkTextSonyZ5() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextSonyZ5));
        driver.findElement(linkTextSonyZ5).click();
    }

    public void clickLinkTextHTCM9() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextHTCM9));
        driver.findElement(linkTextHTCM9).click();
    }

    public void clickLinkTextVaioI5() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextVaioI5));
        driver.findElement(linkTextVaioI5).click();
    }

    public void clickLinkTextVaioI7() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextVaioI7));
        driver.findElement(linkTextVaioI7).click();
    }

    public void clickLinkTextAppleMonitor() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextAppleMonitor));
        driver.findElement(linkTextAppleMonitor).click();
    }

    public void clickLinkTextMBAir() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextMBAir));
        driver.findElement(linkTextMBAir).click();
    }

    public void clickLinkTextDellI78gb() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextDellI78gb));
        driver.findElement(linkTextDellI78gb).click();
    }

    public void clickLinkTextDell156Inch() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextDell156Inch));
        driver.findElement(linkTextDell156Inch).click();
    }

    public void clickLinkTextASUSHD() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextASUSHD));
        driver.findElement(linkTextASUSHD).click();
    }

    public void clickLinkTextMBPro() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkTextMBPro));
        driver.findElement(linkTextMBPro).click();
    }

    public void clickAddToCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(addToCart));
        driver.findElement(addToCart).click();
    }

    public void validatesCategoriesByPhones() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(linkTextNokia1520));
        String productName = driver.findElement(linkTextNokia1520).getText();
        assertEquals("Nokia lumia 1520", productName);
    }

    public void validatesCategoriesBylaptops() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(linkTextDellI78gb));
        String productName = driver.findElement(linkTextDellI78gb).getText();
        assertEquals("Dell i7 8gb", productName);
    }

    public void validatesCategoriesByMonitors() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(linkTextAppleMonitor));
        String productName = driver.findElement(linkTextAppleMonitor).getText();
        assertEquals("Apple monitor 24", productName);
    }




}

