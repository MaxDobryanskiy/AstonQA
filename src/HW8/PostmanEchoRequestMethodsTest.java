package HW8;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

public class PostmanEchoRequestMethodsTest {

    private static final String BASE_URL = "https://postman-echo.com";

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = BASE_URL;
    }

    @Test
    public void testGetMethod() {
        Response response = RestAssured
                .given()
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .get("/get")
                .then()
                .statusCode(200)
                .extract().response();

        assertEquals("bar1", response.jsonPath().getString("args.foo1"));
        assertEquals("bar2", response.jsonPath().getString("args.foo2"));

    }

    @Test
    public void testPostMethod() {
        String requestBody = "{\"name\":\"John\",\"age\":30}";

        Response response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .extract().response();

        assertEquals("John", response.jsonPath().getString("json.name"));
        assertEquals(30, response.jsonPath().getInt("json.age"));
    }

    @Test
    public void testPutMethod() {
        String requestBody = "{\"update\":\"value\"}";

        Response response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .put("/put")
                .then()
                .statusCode(200)
                .extract().response();

        assertEquals("value", response.jsonPath().getString("json.update"));
    }

    @Test
    public void testDeleteMethod() {
        Response response = RestAssured
                .when()
                .delete("/delete")
                .then()
                .statusCode(200)
                .extract().response();

        assertNotNull(response.jsonPath().getString("url"));
    }

    @Test
    public void testPatchMethod() {
        String requestBody = "{\"patch\":\"data\"}";

        Response response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .patch("/patch")
                .then()
                .statusCode(200)
                .extract().response();

        assertEquals("data", response.jsonPath().getString("json.patch"));
    }
}
