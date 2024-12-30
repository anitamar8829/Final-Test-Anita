package com.anita.Web.WebStepDef;

import com.anita.Helper.BaseTest;
import com.anita.Web.WebPage.FirstPage;
import com.anita.Web.WebPage.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDef extends BaseTest {
    LoginPage loginPage;
    FirstPage firstPage;

    @Given("open web demoblaze login")
    public void openWebDemoblazeLogin() {
        firstPage = new FirstPage(getDriver());
        firstPage.openWeb();
        firstPage.clickSignin();
    }

    @And("user input username with {string}")
    public void userInputUsernameWith(String username) {
        loginPage = new LoginPage(driver);
        loginPage.inputUsername(username);
    }


    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
        loginPage = new LoginPage(driver);
        loginPage.inputPassword(password);
    }

    @When("user click login button")
    public void userClickLoginButton() {
        loginPage = new LoginPage(driver);
        loginPage.clickLoginButton();
    }

    @Then("user is on homepage")
    public void userIsOnHomepage() {
        loginPage = new LoginPage(driver);
        loginPage.validateOnHomePage();
    }

    @Then("user get error message {string}")
    public void userGetErrorMessage(String errorMessage) {
        loginPage = new LoginPage(driver);
        loginPage.validateError(errorMessage);
    }

    @When("user click close button")
    public void userClickCloseButton() {
        loginPage = new LoginPage(driver);
        loginPage.clickCloseButton();
    }

    @Given("user login and on homepage")
    public void userLoginAndOnHomepage() {
        firstPage = new FirstPage(getDriver());
        loginPage = new LoginPage(driver);


        firstPage.openWeb();
        firstPage.clickSignin();
        loginPage.inputUsername("ceria01");
        loginPage.inputPassword("ceria");
        loginPage.clickLoginButton();
        loginPage.validateOnHomePage();
    }
}


