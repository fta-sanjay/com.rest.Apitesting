package Request;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class putcall {

	@Test
	public void updatedata()
	{
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type","application/json");
		JSONObject json=new JSONObject();
		json.put("id", "5");
		json.put("title","putcallTesting");
		json.put("author","sanjay");
		request.body(json.toJSONString());
		Response response=request.put("http://localhost:3000/posts/5");
		Assert.assertEquals(response.getStatusCode(), 200);
	}
}
