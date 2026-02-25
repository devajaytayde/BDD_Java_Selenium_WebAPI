package stepdefinitions;
import io.cucumber.java.en.Given;
import  api.RestClient;
import  api.ResponseValidator;
import io.restassured.response.Response;
public class api_test {
    @Given("1user calls get user api")
    public void callApi(){
        Response response = RestClient.get("https://reqres.in/api/users/2");
        ResponseValidator.validateStatus(response,200);
        System.out.println(response.asPrettyString());
    }


    @Given("user calls get user api")
    public void user_calls_get_user_api() {
        System.out.println("jjjjjjjjjjjjjjjjjj");
    }


}