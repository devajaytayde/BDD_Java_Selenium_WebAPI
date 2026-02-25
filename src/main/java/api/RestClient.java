package api;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class RestClient {

    public static Response get(String endpoint){
        return given()
                .header("Content-Type", "application/json")
                .when()
                .get(endpoint);
    }
}