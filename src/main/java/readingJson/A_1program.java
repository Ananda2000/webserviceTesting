// READING THE SIMPLE JSON STRING AND VALIDATING IT...... USING TESTNG

package readingJson;

import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class A_1program {
	
	@Test
	public void readingjons() throws ParseException
	{
		String s1 ="{\r\n" + 
				"    \"firstname\": \"Mark\",\r\n" + 
				"    \"lastname\": \"Brown\",\r\n" + 
				"    \"totalprice\": 904,\r\n" + 
				"    \"depositpaid\": false,\r\n" + 
				"    \"bookingdates\": {\r\n" + 
				"        \"checkin\": \"2019-01-26\",\r\n" + 
				"        \"checkout\": \"2023-01-04\"\r\n" + 
				"    },\r\n" + 
				"    \"additionalneeds\": \"Breakfast\"\r\n" + 
				"}";
		JSONParser jspar= new JSONParser();
		Object obj =jspar.parse(s1);
		System.out.println(obj);
		JSONObject jobj = new JSONObject((Map) obj);
		System.out.println(jobj.get("firstname"));
		
		
		
		JsonPath jsp = new JsonPath(s1);
		String firstname =jsp.get("firstname");
		System.out.println(firstname);
		
		String checkin = jsp.getString("bookingdates.checkin");
		System.out.println(checkin);
		
		String additionalneeds = jsp.getString("additionalneeds");
		System.out.println(additionalneeds);
		
		
	}

}
