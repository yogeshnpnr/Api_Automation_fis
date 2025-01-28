package tests;

import config.RestAssuredConfig;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CoinDeskAPITest {

    @BeforeAll
    public static void setup() {
        RestAssuredConfig.setup();
    }

    @Test
    public void testGetBitcoinPriceIndex() {
        //  GET request and  the response
        Response response = given()
                .when()
                .get("/bpi/currentprice.json")
                .then()
                .statusCode(200) // Verify HTTP status code is 200
                .extract()
                .response();

       // Parsing and validating the response
        String responseBody = response.getBody().asString();

        // Validate presence of USD, GBP, EUR
        assertThat(responseBody, allOf(containsString(""USD""), containsString(""GBP""), containsString(""EUR"")));

        // Validate GBP description
        String gbpDescription = response.jsonPath().getString("bpi.GBP.description");
        assertThat(gbpDescription, equalTo("British Pound Sterling"));
    }
}
