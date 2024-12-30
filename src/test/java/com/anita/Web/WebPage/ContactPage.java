package com.anita.Web.WebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactPage {
    WebDriver driver;

    // Web Element
    By linkContact = By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a");
    By contactEmail = By.id("recipient-email");
    By contactName = By.id("recipient-name");
    By contactMessage = By.id("message-text");
    By sendButton = By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]");
    By closeContact_btn = By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[1]");




    public ContactPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLinkContact() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(linkContact));
        try {
            Thread.sleep(2000); // Add a delay after the wait
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset the interrupted status
            throw new RuntimeException("Thread was interrupted", e);
        }

        driver.findElement(linkContact).click();



    }

    public void inputEmail(String email) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(contactEmail));
        WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("recipient-email")));
        passwordElement.click();
        passwordElement.sendKeys(email);
    }

    public void inputName(String name) {

//        driver.findElement(contactName).sendKeys(name);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(contactName));
        WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("recipient-name")));
        passwordElement.click();
        passwordElement.sendKeys(name);
    }

    public void inputMessage(String message) {
//        driver.findElement(contactMessage).sendKeys(message);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(contactMessage));
        WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("message-text")));
        passwordElement.click();
        passwordElement.sendKeys(message);

    }

    public void clickSendMessageButton() {
        driver.findElement(sendButton).click();
    }

    public void getMessage(String thanksMessage) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        String messageBoxPop = driver.switchTo().alert().getText();
        assertEquals(thanksMessage, messageBoxPop);
        driver.switchTo().alert().accept();
    }

    public void clickCloseButtonContact() {
        driver.findElement(closeContact_btn).click();
    }


}
