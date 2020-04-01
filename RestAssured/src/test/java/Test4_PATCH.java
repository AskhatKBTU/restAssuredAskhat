import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class Test4_PATCH {

@Test
public void validatePatchRequest() {
	
	String jsonString = "{\r\n" + 
			"    \"name\" : \"Morpheus2\"}";

	//GIVEN
	RestAssured
		.given()
				.baseUri("https://reqres.in/api/users/2")
				.contentType(ContentType.JSON)
				.body(jsonString)
		// WHEN
		.when()
				.patch()
		// THEN
		.then()
				.assertThat()
				.statusCode(200)
				.body("name", Matchers.equalTo("Morpheus2"));

	}
}
