package Request;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class deletecall {

	@Test
	public void deletedata()
	{
		RequestSpecification request=RestAssured.given();
		Response response=request.delete("http://localhost:3000/posts/6");
		Assert.assertEquals(response.getStatusCode(), 200);
	}
}
