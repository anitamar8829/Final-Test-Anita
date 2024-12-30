package com.anita.Web.WebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage {
    WebDriver driver;

    // Web Elements

    By input_Uname = By.id("loginusername");
    By input_Pass = By.id("loginpassword");
    By login_btn = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
    By close_btn = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[1]");
    By logout_btn = By.id("logout2");
    By linkAboutUs = By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a");



    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputUsername(String username) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.presenceOfElementLocated(input_Uname));
        WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("loginusername")));
        passwordElement.click();
        passwordElement.clear();
        passwordElement.sendKeys(username);
    }

    public void inputPassword(String password) {
        driver.findElement(input_Pass).sendKeys(password);
    }

    public void clickLoginButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(login_btn));
        driver.findElement(login_btn).click();
    }

    public void validateOnHomePage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(logout_btn));
        wait.until(ExpectedConditions.elementToBeClickable(linkAboutUs));

        // Extract and trim text
        String welcomeUser = driver.findElement(By.id("nameofuser")).getText().trim();

        // Validate the text starts with "Welcome"
        assertTrue(welcomeUser.startsWith("Welcome"),
                "Expected text to start with 'Welcome' but found: " + welcomeUser);
    }

    public void validateError(String errorMessage) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.alertIsPresent());
        String alertLogin = driver.switchTo().alert().getText();
        assertEquals(errorMessage, alertLogin);
        driver.switchTo().alert().accept();
    }

    public void clickCloseButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(close_btn));
        driver.findElement(close_btn).click();
    }



}

