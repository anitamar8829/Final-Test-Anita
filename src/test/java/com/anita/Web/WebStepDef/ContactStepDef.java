package com.anita.Web.WebStepDef;

import com.anita.Helper.BaseTest;
import com.anita.Web.WebPage.ContactPage;
import com.anita.Web.WebPage.FirstPage;
import com.anita.Web.WebPage.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactStepDef extends BaseTest {
    FirstPage firstPage;
    LoginPage loginPage;
    ContactPage contactPage;


    @Given("user on contact page")
    public void userOnContactPage() {
        firstPage = new FirstPage(getDriver());
        contactPage = new ContactPage(driver);

        firstPage.openWeb();
        contactPage.clickLinkContact();
    }

    @And("user input email with {string}")
    public void userInputEmailWith(String email) {
        contactPage = new ContactPage(driver);
        contactPage.inputEmail(email);
    }

    @And("user input name with {string}")
    public void userInputNameWith(String name) {
        contactPage = new ContactPage(driver);
        contactPage.inputName(name);
    }

    @And("user input message with {string}")
    public void userInputMessageWith(String message) {
        contactPage = new ContactPage(driver);
        contactPage.inputMessage(message);
    }

    @When("user click send message button")
    public void userClickSendMessageButton() {
        contactPage = new ContactPage(driver);
        contactPage.clickSendMessageButton();
    }

    @Then("user get message {string}")
    public void userGetMessage(String thanksMessage) {
        contactPage = new ContactPage(driver);
        contactPage.getMessage(thanksMessage);
    }


    @And("user click link contact")
    public void userClickLinkContact() {
        contactPage = new ContactPage(driver);
        contactPage.clickLinkContact();
    }

    @When("user click close button contact")
    public void userClickCloseButtonContact() {
        contactPage.clickCloseButtonContact();
    }
}
