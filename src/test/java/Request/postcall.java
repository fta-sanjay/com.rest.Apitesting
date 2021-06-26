package Request;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class postcall {

	@Test
	public void postdata()
	{
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type","application/json");
		JSONObject json=new JSONObject();
		json.put("id","6");
		json.put("title","API");
		json.put("author","sanjay singh");
		request.body(json.toJSONString());
		Response response=request.post("http://localhost:3000/posts/");
		System.out.println("post request status= "+ response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 201);
		
	}
}
