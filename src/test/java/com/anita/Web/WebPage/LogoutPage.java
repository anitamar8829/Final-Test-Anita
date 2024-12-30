package com.anita.Web.WebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LogoutPage {
    WebDriver driver;

    // web element

    By logout_btn = By.id("logout2");

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLogoutButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(logout_btn));
        try {
            Thread.sleep(2000); // Allow time for the page to load fully
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Thread was interrupted", e);
        }
        driver.findElement(By.id("logout2")).click();

    }



}
