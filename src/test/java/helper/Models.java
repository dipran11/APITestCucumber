package helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

public class Models {

    private static RequestSpecification request;

    public static void  setupHeaders() {
        request = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Authorization", "Bearer 38cebe5affdc6038017ae850b112f50d15613c3f40d9d2a5d7bfd75f6218fcc2");
    }

    public static Response getListUsers(String endpoint) {
        setupHeaders();
        return request.when().get(endpoint);
    }

    public static Response postCreateUser(String endpoint) {
        setupHeaders();
        String name = "Brock love";
        String gender = "male";
        String email = "allasani.peddana@15ce.com";
        String status = "active";
        JSONObject payload = new JSONObject();
        payload.put("name", name);
        payload.put("gender", gender);
        payload.put("email", email);
        payload.put("status", status);
        return request.body(payload.toString()).when().post(endpoint);
    }
}


