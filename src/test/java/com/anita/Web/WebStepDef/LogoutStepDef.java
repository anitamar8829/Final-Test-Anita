package com.anita.Web.WebStepDef;

import com.anita.Helper.BaseTest;
import com.anita.Web.WebPage.LogoutPage;
import io.cucumber.java.en.And;


public class LogoutStepDef extends BaseTest {

    LogoutPage logoutPage;

    @And("user click logout button")
    public void userClickLogoutButton() {
        logoutPage = new LogoutPage(driver);
        logoutPage.clickLogoutButton();
    }
}
