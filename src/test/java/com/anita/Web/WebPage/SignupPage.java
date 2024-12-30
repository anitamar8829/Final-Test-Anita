package com.anita.Web.WebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class SignupPage {
    WebDriver driver;

    // Web Element

    By usernameInput = By.id("sign-username");
    By passwordInput = By.id("sign-password");
    By signup_btn = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");
    By close_signup = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[1]");

    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputNewusername(String username){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(usernameInput));
        WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("sign-username")));
        passwordElement.click();
        passwordElement.clear();
        passwordElement.sendKeys(username);
    }

    public void inputNewPassword(String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(passwordInput));
        WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("sign-password")));
        passwordElement.click();
        passwordElement.clear();
        passwordElement.sendKeys(password);
    }

    public void clickSignupbutton() {
        driver.findElement(signup_btn).click();
    }

    public void getConfirmationMessage(String confirmation) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        String alertLogin = driver.switchTo().alert().getText();
        assertEquals(confirmation, alertLogin);
        driver.switchTo().alert().accept();
    }

    public void signupCancelAndClose() {
        driver.findElement(close_signup).click();
    }




}
