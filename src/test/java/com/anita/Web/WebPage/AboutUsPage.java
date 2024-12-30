package com.anita.Web.WebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AboutUsPage {
    WebDriver driver;

    AboutUsPage aboutUsPage;

    // Web Element

    By linkAboutUs = By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a");
    By playButton = By.xpath("//*[@id=\"example-video\"]/div[1]");
    By closeButtonAbout = By.xpath("//*[@id=\"videoModal\"]/div/div/div[3]/button");



    public AboutUsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLinkAboutUs() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        // Wait for the element to be present
        WebElement aboutUsLink = wait.until(ExpectedConditions.presenceOfElementLocated(linkAboutUs));

        // Scroll to the element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", aboutUsLink);

        // Add a short delay to ensure the page settles after scrolling
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Thread was interrupted", e);
        }

        // Wait for the element to be clickable
        wait.until(ExpectedConditions.elementToBeClickable(aboutUsLink));

        // Add another short delay before clicking
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Thread was interrupted", e);
        }

        // Click the element
        aboutUsLink.click();
    }

    public void clickPlayButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(playButton));
        driver.findElement(playButton).click();
    }

    public void closeAfterVideoPlay() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(closeButtonAbout));
        driver.findElement(closeButtonAbout).click();

    }

}

