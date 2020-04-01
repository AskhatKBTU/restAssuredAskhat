import com.fasterxml.jackson.annotation.*;
import java.util.ArrayList;
import java.util.List;


	
	@JsonPropertyOrder({"id", "email", "first_name", "last_name", "avatar"})
	public class Data {
		
	    private String id;
	    private String email;
	    private String first_name;
	    private String last_name;
	    private String avatar;


	    public Data() {
	        this.id = id;
	        this.email = email;
	    	this.first_name = first_name;
	    	this.last_name = last_name;
	    	this.avatar = avatar;
	    }

	    @JsonProperty("id")
	    public String getId() {
	        return id;
	    }


	    @JsonProperty("email")
	    public String getEmail() {
	        return email;
	    }
	    

	    @JsonProperty("first_name")
	    public String getFirstName() {
	        return first_name;
	    }
	    


	    @JsonProperty("last_name")
	    public String getLastName() {
	        return last_name;
	    }

	
    
	    @JsonProperty("avatar")
	    public String getAvatar() {
	        return last_name;
	    }


	}


