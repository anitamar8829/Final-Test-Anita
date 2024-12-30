package com.anita.Web.WebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class FirstPage {
    WebDriver driver;

    By signin = By.id("login2");
    By signup = By.id("signin2");

    public FirstPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openWeb() {
        driver.get("https://www.demoblaze.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("navbarExample")));
    }

    public void clickSignin() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        // Wait for the element to be present in the DOM
        WebElement signinButton = wait.until(ExpectedConditions.presenceOfElementLocated(signin));

        // Scroll into view if necessary
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", signinButton);

        // Add a short delay for stability
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Thread interrupted", e);
        }

        // Click using JavaScript to bypass visibility issues
        js.executeScript("arguments[0].click();", signinButton);

        // Wait for the modal to appear
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logInModalLabel")));

    }

    public void clickSignup() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(signup));
        driver.findElement(signup).click();
    }

    public void validateOnFirstPage() {
        String text = driver.findElement(By.id("cat")).getText();
        assertEquals("CATEGORIES", text);
    }

}
