package rest;

import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class RestSmokeTest
{
    private String path = "http://localhost:8091";

    @Test
    public void restSmokeTest()
    {
        RequestSpecification requestSpec = given().baseUri(path);
        requestSpec.when()
            .get("/list")
            .then().statusCode(200);
    }
}
