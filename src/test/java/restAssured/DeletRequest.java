package restAssured;

import static io.restassured.RestAssured.given;

import io.restassured.path.json.JsonPath;

public class DeletRequest {

	public static void main(String[] args) {

		String DeleteResponse=  given().pathParam("id", "2")
	        .when()
	        .delete("http://dummy.restapiexample.com/api/v1/delete/{id}")
	        
	       
	       .then().assertThat().statusCode(200).
	       extract().response().asString();
		JsonPath js1= new JsonPath(DeleteResponse);
		String msg=js1.get("message");
		System.out.println(msg);
	     
	}

}
