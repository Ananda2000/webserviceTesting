// reading simple json object from file "one_1.json"....

package readJsonFiles_Practicing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonBooleanFormatVisitor;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import io.restassured.path.json.JsonPath;

public class A_1Program 
{
	@Test
	public void readingBasicJson() throws FileNotFoundException
	{
		
		FileReader f1 = new FileReader("Resources/one_1.json");
		JsonElement s1 =new JsonParser().parse(f1);
		System.out.println(s1);
		boolean ss =s1.isJsonObject();
		System.out.println("boolean--->"+ss);
		if(ss==true)
		{
			String s2 =s1.toString();
			JsonPath jsp = new JsonPath(s2);
			//System.out.println(jsp.get("Names.Name[0]"));
		ArrayList<String> NamesList = jsp.get("Names.Name");
		ArrayList<Integer> agelist = jsp.get("Names.age");
		System.out.println("Names are ---------"+NamesList);
		System.out.println("agelist are ---------"+agelist);
		}
		
		
	}

}
