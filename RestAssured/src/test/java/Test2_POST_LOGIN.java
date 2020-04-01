import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test2_POST_LOGIN {
	
	
	@Test
	public void verifyTokenValue() {
		
		//1) Specify base URI
		RestAssured.baseURI = "https://reqres.in";
		
		// 2) Request Object
		RequestSpecification httpRequest = RestAssured.given();
		
		// 3) Response Object
		JSONObject requestParams = new JSONObject();
		
		requestParams.put("email", "eve.holt@reqres.in");
		requestParams.put("password", "cityslicka");
		
		httpRequest.header("Content-type", "application/json");
		
		httpRequest.body(requestParams.toJSONString());
		
		Response response = httpRequest.request(Method.POST, "/api/login" );
		
		// 4) Print response in Console Window
		String responseBody = response.getBody().asString();
		System.out.println("Response body is" + responseBody);
		
		//Validation
		 response
   		.then().statusCode(200).assertThat()
   			.body("token", equalTo("QpwL5tke4Pnpja7X4")); 
		
	}

}
