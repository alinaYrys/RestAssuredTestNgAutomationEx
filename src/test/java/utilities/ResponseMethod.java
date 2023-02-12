package utilities;

import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import pojo.OrderPojo;

public class ResponseMethod {
    public static void verify201Status(Response response){
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_CREATED,"Unexpected response code!");
    }
    public  static void verifyOrderSuccess(OrderPojo orderPojo){
        Assert.assertTrue(orderPojo.getCreated());
        Assert.assertNotNull(orderPojo.getOrderId());
    }
}
