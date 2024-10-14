import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;

public class GetRequest {

    @Test
    public void testGetUser() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        given()
                .when()
                .get("/todos/1")
                .then()
                .statusCode(200)
                .body("title", equalTo("delectus aut autem"))
                .log().all();  // Log the complete response
    }



}
