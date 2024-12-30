package com.anita.Web.WebStepDef;

import com.anita.Helper.BaseTest;
import com.anita.Web.WebPage.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutStepDef extends BaseTest {
    FirstPage firstPage;
    LoginPage loginPage;
    HomePage homePage;
    CartPage cartPage;
    CheckoutPage checkoutPage;

    @Given("user in cart page")
    public void userInCartPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        firstPage = new FirstPage(getDriver());
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        cartPage = new CartPage(driver);
        checkoutPage = new CheckoutPage(driver);

        firstPage.openWeb();
        firstPage.clickSignin();
        loginPage.inputUsername("ceria01");
        loginPage.inputPassword("ceria");
        loginPage.clickLoginButton();
        loginPage.validateOnHomePage();
        homePage.clickLinkTextLaptops();
        homePage.clickLinkTextMBAir();
        homePage.clickAddToCart();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        cartPage.clinkLinkCart();
        cartPage.clickPlaceOrder();

    }

    @And("user input name {string}")
    public void userInputName(String name) {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.inputName(name);
    }

    @And("user input country with {string}")
    public void userInputCountryWith(String country) {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.inputCountry(country);
    }

    @And("user input city with {string}")
    public void userInputCityWith(String city) {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.inputCity(city);
    }

    @And("user input credit card with {string}")
    public void userInputCreditCardWith(String credit_card) {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.inputCreditCard(credit_card);
    }


    @And("user input month with {string}")
    public void userInputMonthWith(String month) {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.inputMonth(month);
    }

    @And("user input year with {string}")
    public void userInputYearWith(String year) {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.inputYear(year);
    }

    @When("user click purchase button")
    public void userClickPurchaseButton() {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.clickPurchaseButton();
    }

    @Then("purchase processed")
    public void purchaseProcessed() {
        checkoutPage = new CheckoutPage(driver);
        loginPage = new LoginPage(driver);

        checkoutPage.validateShopping();
        loginPage.validateOnHomePage();
    }

    @When("user click close button button")
    public void userClickCloseButtonButton() {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.clickCloseButton();
    }

    @Then("user back in cart page")
    public void userBackInCartPage() {
        cartPage = new CartPage(driver);
        cartPage.validateOnCartPage();
    }

    @Then("user get message alert {string}")
    public void userGetMessageAlert(String alertMessage) {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.validateAlertMessage(alertMessage);
    }

}
