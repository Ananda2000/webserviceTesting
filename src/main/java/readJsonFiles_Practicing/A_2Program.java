package readJsonFiles_Practicing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import io.restassured.parsing.Parser;

public class A_2Program 
{
	@Test
	public void nestedJson() throws FileNotFoundException
	{
		FileReader fi = new FileReader("Resources/One2.json");
		JsonParser jsopar = new JsonParser();
		JsonElement s1 = jsopar.parse(fi);
		
		JsonObject jsobj = s1.getAsJsonObject();
		System.out.println(s1);
		
		JsonArray jsarr = new JsonArray();
		jsarr = jsobj.getAsJsonArray("Names");
		
		System.out.println(jsarr.size());
			
		for (JsonElement jsonElement : jsarr) 
		{
			System.out.println(jsonElement.getAsJsonObject().get("Name"));
			
		}
		
	}

}
