package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

public class Products {

    public int statusCode;
    public RequestSpecification httpRequest;
    public Response response;
    public int responseCode;


    @Given("I hit the url of get products api end point")
    public void i_hit_the_url_of_get_products_api_end_point() {
        RestAssured.baseURI="https://fakestoreapi.com/";

    }

    @When("I pass the url in the request")
    public void i_pass_the_url_in_the_request() {
        httpRequest=RestAssured.given();
        response= httpRequest.get("products");
    }

    @Then("I receive the response code as {int}")
    public void i_receive_the_response_code_as(Integer int1) {
        httpRequest=RestAssured.given();
        response= httpRequest.get("products");
    }

}
