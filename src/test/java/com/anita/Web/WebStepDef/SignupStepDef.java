package com.anita.Web.WebStepDef;

import com.anita.Helper.BaseTest;
import com.anita.Web.WebPage.FirstPage;
import com.anita.Web.WebPage.SignupPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupStepDef extends BaseTest {

    FirstPage firstPage;
    SignupPage signupPage;

    @Given("open web demoblaze signup")
    public void openWebDemoblazeSignup() {
        firstPage = new FirstPage(getDriver());
        firstPage.openWeb();
        firstPage.clickSignup();
    }

    @And("user input new username with {string}")
    public void userInputNewUsernameWith(String username) {
        signupPage = new SignupPage(driver);
        signupPage.inputNewusername(username);
    }

    @And("user input new password with {string}")
    public void userInputNewPasswordWith(String password) {
        signupPage = new SignupPage(driver);
        signupPage.inputNewPassword(password);
    }

    @And("user click signup button")
    public void userClickSignupButton() {
        signupPage = new SignupPage(driver);
        signupPage.clickSignupbutton();
    }

    @Then("user get confirmation message {string}")
    public void userGetConfirmationMessage(String confirmation) {
        signupPage = new SignupPage(driver);
        signupPage.getConfirmationMessage(confirmation);
    }


    @When("user cancel and click close button")
    public void userCancelAndClickCloseButton() {
        signupPage = new SignupPage(driver);
        signupPage.signupCancelAndClose();
    }

    @Then("user is on firstpage")
    public void userIsOnFirstpage() {
        firstPage = new FirstPage(getDriver());
        firstPage.validateOnFirstPage();
    }
}
