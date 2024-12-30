package com.anita.Helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import static com.anita.Helper.Utility.generateRandomEmail;

public class Models {
    private static RequestSpecification request;

    public static void setupHeaders() {
        request = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Authorization", "Bearer ee30d489d1ccec4639474a582da9a9fed59fa7c73cdaf8425968f5ca119e9095");
    }

    public static Response getListUsers(String endpoint) {
        setupHeaders();
        return request.when().get(endpoint);
    }

    public static Response getUsersbyId(String endpoint) {
        setupHeaders();
        return request.when().get(endpoint);
    }

    public static Response updateUser(String endpoint) {
        setupHeaders();
        String id = "7599481";
        String name = "User Test Anita";
        JSONObject payload = new JSONObject();
        payload.put("name",name);

        String finalEndpoint = endpoint + id;
        return request.body(payload.toString()).when().put(finalEndpoint);
    }

    public static Response postCreateUser(String endpoint){

        String name = "Anita Marsafira";
        String gender = "female";
        String email = generateRandomEmail();
        String status = "active";
        JSONObject payload = new JSONObject();
        payload.put("name", name);
        payload.put("gender", gender);
        payload.put("email", email);
        payload.put("status", status);

        setupHeaders();
        return request.body(payload.toString()).when().post(endpoint);

    }

    public static Response deleteUser(String endpoint, String id) {
        setupHeaders();
        String finalEndpoint = endpoint + "/" + id;
        return request.when().delete(finalEndpoint);
    }

    public static Response emptyGender(String endpoint) {
        String name = "Empty Gender";
        String gender = "";
        String email = generateRandomEmail();
        String status = "active";
        JSONObject payload = new JSONObject();
        payload.put("name", name);
        payload.put("gender", gender);
        payload.put("email", email);
        payload.put("status", status);

        setupHeaders();
        return request.body(payload.toString()).when().post(endpoint);
    }

    public static Response emptyEmail(String endpoint) {
        String name = "Empty Email";
        String gender = "female";
        String email = "";
        String status = "active";
        JSONObject payload = new JSONObject();
        payload.put("name", name);
        payload.put("gender", gender);
        payload.put("email", email);
        payload.put("status", status);


        setupHeaders();
        return request.body(payload.toString()).when().post(endpoint);
    }

}
