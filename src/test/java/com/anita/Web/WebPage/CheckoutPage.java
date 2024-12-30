package com.anita.Web.WebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckoutPage {
    WebDriver driver;

    //    Web Element
    By nameInput = By.id("name");
    By countryInput = By.id("country");
    By cityInput = By.id("city");
    By creditCardInput = By.id("card");
    By monthInput = By.id("month");
    By yearInput = By.id("year");
    By purchaseButton = By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");
    By closeButton = By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[1]");
    By finishedPurchase = By.xpath("/html/body/div[10]/div[7]/div/button");





    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputName(String name) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(nameInput));
        WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("name")));
        passwordElement.click();
        passwordElement.clear();
        passwordElement.sendKeys(name);
    }

    public void inputCountry(String country) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(countryInput));
        WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("country")));
        passwordElement.click();
        passwordElement.clear();
        passwordElement.sendKeys(country);
    }

    public void inputCity(String city) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(cityInput));
        WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("city")));
        passwordElement.click();
        passwordElement.clear();
        passwordElement.sendKeys(city);
    }

    public void inputCreditCard(String credit_card) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(creditCardInput));
        WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("card")));
        passwordElement.click();
        passwordElement.clear();
        passwordElement.sendKeys(credit_card);
    }

    public void inputMonth(String month) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(monthInput));
        WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("month")));
        passwordElement.click();
        passwordElement.clear();
        passwordElement.sendKeys(month);
    }

    public void inputYear(String year) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(yearInput));
        WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("year")));
        passwordElement.click();
        passwordElement.clear();
        passwordElement.sendKeys(year);
    }

    public void clickPurchaseButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(purchaseButton));
        driver.findElement(purchaseButton).click();
    }

    public void clickCloseButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(closeButton));
        driver.findElement(closeButton).click();
    }

    public void validateAlertMessage(String alertMessage) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        String alertMessageText = driver.switchTo().alert().getText();
        assertEquals(alertMessage, alertMessageText);
        driver.switchTo().alert().accept();
    }

    public void validateShopping() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(finishedPurchase));
        driver.findElement(finishedPurchase).click();
    }

}

