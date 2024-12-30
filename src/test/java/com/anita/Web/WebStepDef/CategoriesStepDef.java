package com.anita.Web.WebStepDef;

import com.anita.Helper.BaseTest;
import com.anita.Web.WebPage.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CategoriesStepDef extends BaseTest {
    HomePage homePage;


    @Given("user click link phone categories")
    public void userClickLinkPhoneCategories() {
        homePage = new HomePage(driver);
        homePage.clickLinkTextPhones();
    }

    @Then("categories by phones displayed")
    public void categoriesByPhonesDisplayed() {
        homePage = new HomePage(driver);
        homePage.validatesCategoriesByPhones();
    }

    @When("user click link laptop categories")
    public void userClickLinkLaptopCategories() {
        homePage = new HomePage(driver);
        homePage.clickLinkTextLaptops();
    }

    @Then("categories by laptop displayed")
    public void categoriesByLaptopDisplayed() {
        homePage = new HomePage(driver);
        homePage.validatesCategoriesBylaptops();
    }

    @When("user click link monitors categories")
    public void userClickLinkMonitorsCategories() {
        homePage = new HomePage(driver);
        homePage.clickLinkTextMonitors();
    }

    @Then("categories by monitors displayed")
    public void categoriesByMonitorsDisplayed() {
        homePage = new HomePage(driver);
        homePage.validatesCategoriesByMonitors();
    }

}
