package stepdefns;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class Steps {

    Response response;


    @Then("user receives the response along with status code")
    public void userReceivesTheResponseAlongWithStatusCode()
    {
        int statusCode = response.getStatusCode();

        Assert.assertEquals(statusCode,200);
    }

    @Given("user sends the request for single user")
    public void userSendsTheRequestForSingleUser()
    {
        response  = given().log().all().when().get("https://reqres.in/api/users/2")
                .then().log().all().extract().response();
    }

    @Given("user sends the request for all users")
    public void userSendsTheRequestForAllUsers()
    {
        response  = given().log().all().when().get("https://reqres.in/api/users?page=2")
                .then().log().all().extract().response();

    }
}
