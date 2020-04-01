import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Test3_DELETE_204 {
	
	
	@Test
	public void verifyDeleteResponse() {
		
		
		//1) Specify base URI
		RestAssured.baseURI = "https://reqres.in";
		
		// 2) Request Object
		RequestSpecification httpRequest = RestAssured.given();
	
		// 3) Response Object
		Response response = httpRequest.request(Method.DELETE, "/api/users/2" );
		
		
		// 4) Print response in Console Window
		String responseBody = response.getBody().asString();
		System.out.println("Response body is" + responseBody);
				
		int statusCode = response.getStatusCode();
		System.out.println("Status code is: " + statusCode);
		Assert.assertEquals(204, 204);
		
		
	}

}
