import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.equalTo;
import junit.framework.Assert;

public class Test1_GET_SINGLE_USER {
	
	
	@Test
	public void getSingleUserDetails() {
		
		//1) Specify base URI
		RestAssured.baseURI = "https://reqres.in";
		
		// 2) Request Object
		RequestSpecification httpRequest = RestAssured.given();
	
		// 3) Response Object
		Response response = httpRequest.request(Method.GET, "/api/users/2" );
		
		
		// 4) Print response in Console Window
		String responseBody = response.getBody().asString();
		System.out.println("Response body is" + responseBody);
		
		// Validation
	   response
	   		.then().statusCode(200).assertThat()
	   			.body("data.email", equalTo("janet.weaver@reqres.in"));
				
				
		int statusCode = response.getStatusCode();
		System.out.println("Status code is: " + statusCode);
		Assert.assertEquals(200, 200);
		
		String statusLine = response.getStatusLine();
		System.out.println("Status line is: " + statusLine);
		
		
	}


	
}