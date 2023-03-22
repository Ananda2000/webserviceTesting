package readingJson;

import java.awt.print.Book;
import java.util.HashMap;
import java.util.Map;

import org.junit.runner.Request;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class A_2program 
{
	@Test
	
	public void readjsonresponse()
	{
		RestAssured.baseURI="https://restful-booker.herokuapp.com/";
		
		RequestSpecification request = RestAssured.given();
		Response  respon= request.get("booking/1");
		System.out.println("Am in WebServiceTesting-src-main-java-readingJson-A_2program.java");
		int responseCode = respon.getStatusCode();
		//System.out.println("The status code is --"+responseCode);
		Assert.assertEquals(200, responseCode);
		
		System.out.println("The response body is--"+respon.body());
		String responseBody = respon.body().asString();
		System.out.println("The response Body is==="+responseBody);
		
		JsonPath jsp = new JsonPath(responseBody);
		System.out.println("FirstName --"+jsp.get("firstname"));
		
		System.out.println(jsp.get("bookingdates.checkin"));
		
		
		Headers header = respon.headers();
		System.out.println("Headers---"+header);
		JsonPath jsio09=respon.body().jsonPath();
		//System.out.println(jsio09.get());
		jsio09.get();
 		
		
	}

}
