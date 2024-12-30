package com.anita.API.ApiStepDef;

import com.anita.API.ApiPage.ApiPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ApiStepDef {
    ApiPage apiPage;

    public ApiStepDef() {
        this.apiPage = new ApiPage();
    }


    @Given("prepare valid url for {string}")
    public void prepareValidUrlFor(String url) {
        apiPage.prepareUrlValidFor(url);
    }

    @And("hit api get list users")
    public void hitApiGetListUsers() {
        apiPage.hitApiGetListUsers();
    }

    @And("hit api get users by id")
    public void hitApiGetUsersById() {
        apiPage.hitApiGetUsersById();
    }

    @And("hit api post create new user")
    public void hitApiPostCreateNewUser() {
        apiPage.hitApiPostCreateUser();
    }

    @Then("validation status code is equal {int}")
    public void validationStatusCodeIsEqual(int status_code) {
        apiPage.validationStatusCodeIsEqual(status_code);
    }

    @Then("validation response body get list of users")
    public void validationResponseBodyGetListOfUsers() {
        apiPage.validationResponseBodyGetListUsers();
    }


    @Then("validation response json with JSONSchema {string}")
    public void validationResponseJsonWithJSONSchema(String filename) {
        apiPage.validationResponseJsonWithJSONSchema(filename);
    }


    @Then("validation response body post create new users")
    public void validationResponseBodyPostCreateNewUsers() {
        apiPage.validationResponseCreateUser();
    }

    @And("hit api update user")
    public void hitApiUpdateUser() {
        apiPage.hitApiUpdateUser();
    }

    @And("hit api delete new")
    public void hitApiDeleteNew() {
        apiPage.hitApiDeleteUser();
    }

    @And("hit api post create new user with empty gender")
    public void hitApiPostCreateNewUserWithEmptyGender() {
        apiPage.hitApiUserWithEmptyGender();
    }

    @And("hit api post create new user with empty email")
    public void hitApiPostCreateNewUserWithEmptyEmail() {
        apiPage.hitApiUserWithEmptyEmail();
    }
}

