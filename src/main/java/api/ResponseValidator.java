package api;


import io.restassured.response.Response;
import org.testng.Assert;

public class ResponseValidator {

    public static void validateStatus(Response response, int expected){
        Assert.assertEquals(response.getStatusCode(), expected);
    }
}