package com.anita.Web.WebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CartPage {
    WebDriver driver;

    //    Web Element
    By linkCart = By.id("cartur");
    By listProduct = By.id("tbodyid");
    By deleteCart = By.xpath("//*[@id=\"tbodyid\"]/tr/td[4]/a");
    By placeOrderButton = By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clinkLinkCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(linkCart));
        driver.findElement(linkCart).click();
    }

    public void validateCartList(String item_name) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(listProduct));
        String listProductCart = driver.findElement(listProduct).getText();
        assertTrue(driver.findElement(listProduct).isDisplayed());
    }

    public void deletedCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(deleteCart));
        driver.findElement(deleteCart).click();
    }

    public void validateCartListEmpty() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(listProduct));
        String Text = driver.findElement(listProduct).getText().trim();
        assertTrue(Text.contains("Delete"));
    }

    public void clickPlaceOrder() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderButton));
        driver.findElement(placeOrderButton).click();
    }

    public void validateOnCartPage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(placeOrderButton));
        assertTrue(driver.findElement(placeOrderButton).isEnabled());
    }

}
