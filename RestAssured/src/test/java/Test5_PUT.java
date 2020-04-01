import static org.hamcrest.Matchers.equalTo;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test5_PUT {
	
	
	@Test
	public void verifyPutRequest() {
		
		//1) Specify base URI
		RestAssured.baseURI = "https://reqres.in";
		
		// 2) Request Object
		RequestSpecification httpRequest = RestAssured.given();
		
		// 3) Response Object
		JSONObject requestParams = new JSONObject();
		
		requestParams.put("name", "Morpheus2");
		
		httpRequest.header("Content-type", "application/json");
		
		httpRequest.body(requestParams.toJSONString());
		
		Response response = httpRequest.request(Method.PUT, "/api/users/2" );
		
		// 4) Print response in Console Window
		String responseBody = response.getBody().asString();
		System.out.println("Response body is" + responseBody);
		
		response.then().assertThat().statusCode(200).body("name", Matchers.equalTo("Morpheus2"));
	}

}
