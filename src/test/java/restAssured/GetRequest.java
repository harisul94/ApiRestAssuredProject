package restAssured;

import static io.restassured.RestAssured.*;

import io.restassured.path.json.JsonPath;



public class GetRequest {

	public static void main(String[] args) {
        String GetResponse=given().pathParam("id", "10")
        .when()
        .get("http://dummy.restapiexample.com/api/v1/employee/{id}")
        
       
       .then().assertThat().statusCode(200).extract().
       response().asString();
        JsonPath js1= new JsonPath(GetResponse);
		String msg=js1.get("message");
		System.out.println(msg);
     
	}

}
