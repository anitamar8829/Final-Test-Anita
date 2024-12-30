package com.anita.API.ApiPage;

import com.anita.Helper.Endpoint;
import com.anita.Helper.Utility;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.io.File;
import java.util.List;

import static com.anita.Helper.Models.*;
import static com.anita.Helper.Models.emptyEmail;
import static org.assertj.core.api.Assertions.assertThat;

public class ApiPage {
    String setURL, global_id;

    Response res;

    public void prepareUrlValidFor(String url) {
        switch (url) {
            case "GET_LIST_USERS":
                setURL = Endpoint.GET_LIST_USERS;
                break;
            case "GET_USER_BY_ID":
                setURL = Endpoint.GET_USER_BY_ID;
                break;
            case "CREATE_NEW_USERS":
                setURL = Endpoint.CREATE_NEW_USERS;
                break;
            case "UPDATE_USERS":
                setURL = Endpoint.UPDATE_USERS;
                break;
            case "DELETE_LIST_USERS":
                setURL = Endpoint.DELETE_LIST_USERS;
                break;

            default:
                System.out.println("Input right url");
        }

    }

    public void hitApiGetListUsers() {
        res = getListUsers(setURL);
        System.out.println(res.getBody().asString());
    }

    public void hitApiGetUsersById() {
        res = getUsersbyId(setURL);
        System.out.println(res.getBody().asString());
    }

    public void validationStatusCodeIsEqual(int status_code) {
        assertThat(res.statusCode()).isEqualTo(status_code);
    }

    public void validationResponseBodyGetListUsers() {
        List<Object> id = res.jsonPath().getList("id");
        List<Object> name = res.jsonPath().getList("name");
        List<Object> email = res.jsonPath().getList("email");
        List<Object> gender = res.jsonPath().getList("gender");
        List<Object> status = res.jsonPath().getList("status");

        assertThat(id.get(0)).isNotNull();
        assertThat(name.get(0)).isNotNull();
        assertThat(email.get(0)).isNotNull();
        assertThat(gender.get(0)).isIn("female", "male");
        assertThat(status.get(0)).isIn("active", "inactive");
    }

    public void validationResponseJsonWithJSONSchema(String filename) {
        File JSONFile = Utility.getJSONSchemaFile(filename);
        res.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JSONFile));
    }

    public void hitApiPostCreateUser() {
        res = postCreateUser(setURL);
        System.out.println(res.getBody().asString());
    }

    public void validationResponseCreateUser() {
        JsonPath jsonPathEvaluator = res.jsonPath();
        Integer id = jsonPathEvaluator.get("id");
        String name = jsonPathEvaluator.get("name");
        String email = jsonPathEvaluator.get("email");
        String gender = jsonPathEvaluator.get("gender");
        String status = jsonPathEvaluator.get("status");

        assertThat(id).isNotNull();
        assertThat(name).isNotNull();
        assertThat(email).isNotNull();
        assertThat(gender).isIn("female", "male");
        assertThat(status).isIn("active", "inactive");

        global_id = Integer.toString(id);
    }

    public void hitApiUpdateUser() {
        res = updateUser(setURL);
        System.out.println(res.getBody().asString());
    }

    public void hitApiDeleteUser() {
        res = deleteUser(setURL, global_id);
    }

    public void hitApiUserWithEmptyGender() {
        res = emptyGender(setURL);
        System.out.println("Gender can't be blank, can be male or female");
    }

    public void hitApiUserWithEmptyEmail() {
        res = emptyEmail(setURL);
        System.out.println("Email can't be blank");
    }

}

