package calls;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojo.OrderPojo;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;

public class PostAnOrder extends DataStorage{
    Response response;
    @Test(dataProvider = "PostAnOrderPositive")
    public void  test1(int bookId, String customerName){
               /*
        POST /orders/
Authorization: Bearer <YOUR TOKEN>
{
  "bookId": 1,
  "customerName": "John"
}
         */
        OrderPojo orderPojo=new OrderPojo(bookId,customerName);//2,"Alina"  5,"Josh"
       response= utilities.RequestMethod.postOrderRequest(orderPojo);//method will help to send request
       response.prettyPrint();
        OrderPojo responseData=response.body().as(OrderPojo.class);
        utilities.ResponseMethod.verify201Status(response);
        utilities.ResponseMethod.verifyOrderSuccess(responseData);



    }
}
