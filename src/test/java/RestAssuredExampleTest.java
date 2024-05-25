import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Before;
import org.junit.*;
import org.testng.annotations.Test;
import org.testng.annotations.*;

import static io.restassured.RestAssured.*;
import static java.lang.Math.log;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;

public class RestAssuredExampleTest extends BaseTest {

    @Test
    public void getBooks() {
        given().when().get("/books").then().statusCode(200);
    }
}



