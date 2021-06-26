package Request;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.baseclass;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class getcall extends baseclass{

	@Test
	public void getdata()
	{
		Response response=RestAssured.given().get();
		System.out.println("Get request status= "+response.getStatusCode());
		ResponseBody responsebody=response.getBody();
		System.out.println("Response body of get call= "+responsebody);
		System.out.println("Total time consumed= "+response.getTime());
		
		
		System.out.println("data from get call= "+response.asString());
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}
}
