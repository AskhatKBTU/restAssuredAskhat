
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import java.util.List;


public class Test6_GET_SINGLE_DESERIALIZE {
	

	    @Test
	    public void requestFirstName_expectJanet() {

	        Data data =
	        given().
	        when().
	            get("https://reqres.in/api/users/2").
	        as(Data.class);

	        Assert.assertEquals(
	            "Janet",
	            data.getFirstName()
	        );
	    }
	
}
