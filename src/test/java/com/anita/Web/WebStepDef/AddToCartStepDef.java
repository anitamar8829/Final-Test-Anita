package com.anita.Web.WebStepDef;

import com.anita.Helper.BaseTest;
import com.anita.Web.WebPage.CartPage;
import com.anita.Web.WebPage.FirstPage;
import com.anita.Web.WebPage.HomePage;
import com.anita.Web.WebPage.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddToCartStepDef extends BaseTest {
    FirstPage firstPage;
    LoginPage loginPage;
    HomePage homePage;
    CartPage cartPage;

    @Given("user on detail product page {string}")
    public void userOnDetailProductPage(String item) {
        firstPage = new FirstPage(getDriver());
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);

        firstPage.openWeb();
        firstPage.clickSignin();
        loginPage.inputUsername("ceria01");
        loginPage.inputPassword("ceria");
        loginPage.clickLoginButton();
        loginPage.validateOnHomePage();

        switch (item) {
            case "Samsung galaxy s6":
                homePage.clickLinkTextPhones();
                homePage.clickLinkTextSamsungGS6();
                break;

            case "Samsung galaxy s7":
                homePage.clickLinkTextPhones();
                homePage.clickLinkTextSamsungGS7();
                break;

            case "Nokia lumia 1520":
                homePage.clickLinkTextPhones();
                homePage.clickLinkTextNokia1520();
                break;

            case "Nexus 6":
                homePage.clickLinkTextPhones();
                homePage.clickLinkTextNexus6();
                break;

            case "Iphone 6 32gb":
                homePage.clickLinkTextPhones();
                homePage.clickLinkTextIp6();
                break;

            case "Sony xperia z5":
                homePage.clickLinkTextPhones();
                homePage.clickLinkTextSonyZ5();
                break;

            case "HTC One M9":
                homePage.clickLinkTextPhones();
                homePage.clickLinkTextHTCM9();
                break;

            case "Sony vaio i5":
                homePage.clickLinkTextLaptops();
                homePage.clickLinkTextVaioI5();
                break;

            case "Sony vaio i7":
                homePage.clickLinkTextLaptops();
                homePage.clickLinkTextVaioI7();
                break;

            case "MacBook air":
                homePage.clickLinkTextLaptops();
                homePage.clickLinkTextMBAir();
                break;

            case "Dell i7 8gb":
                homePage.clickLinkTextLaptops();
                homePage.clickLinkTextDellI78gb();
                break;

            case "2017 Dell 15.6 Inch":
                homePage.clickLinkTextLaptops();
                homePage.clickLinkTextDell156Inch();
                break;

            case "MacBook Pro":
                homePage.clickLinkTextLaptops();
                homePage.clickLinkTextMBPro();
                break;

            case "Apple monitor 24":
                homePage.clickLinkTextMonitors();
                homePage.clickLinkTextAppleMonitor();
                break;

            case "ASUS Full HD":
                homePage.clickLinkTextMonitors();
                homePage.clickLinkTextASUSHD();
                break;

        }

    }

    @When("user click add to cart")
    public void userClickAddToCart() {
        homePage = new HomePage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        homePage.clickAddToCart();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }


    @Then("product {string} add to cart")
    public void productAddToCart(String item_add) {
        cartPage = new CartPage(driver);
        cartPage.clinkLinkCart();
        cartPage.validateCartList(item_add);

    }

    @When("user click delete button")
    public void userClickDeleteButton() {
        cartPage = new CartPage(driver);
        cartPage.deletedCart();
    }

    @Then("product deleted from cart list")
    public void productDeletedFromCartList() {
        cartPage = new CartPage(driver);
        cartPage.validateCartListEmpty();

    }
}


