package config;

import io.restassured.RestAssured;

public class RestAssuredConfig {
    public static void setup() {
        RestAssured.baseURI = "https://api.coindesk.com/v1";
    }
}
