package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojo.OrderPojo;

import static io.restassured.RestAssured.given;

public class RequestMethod {
    //post an Order
    public  static Response postOrderRequest(OrderPojo orderPojo){
        return given().baseUri(ConfigReader.getInstance().getUri()).and().contentType(ContentType.JSON).
                and().header("Authorization", "Bearer " + ConfigReader.getInstance().getToken()).body(orderPojo)
                .and().post("/orders");

    }

}
