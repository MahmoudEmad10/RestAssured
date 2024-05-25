import io.restassured.RestAssured;
import org.junit.Before;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    // Define the baseUri as a constant
    protected static final String BASE_URI = "https://simple-books-api.glitch.me";

    @BeforeClass
    public void setUp() {
        // Set the base URI for REST Assured
        RestAssured.baseURI = BASE_URI;
    }
}

