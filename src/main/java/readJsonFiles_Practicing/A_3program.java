// Here am reading json object and json array both . Am using One3.json file..

package readJsonFiles_Practicing;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonBooleanFormatVisitor;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import io.restassured.parsing.Parser;

public class A_3program 
{
	@Test
	public void readjsonarrays() throws JsonParseException, JsonMappingException, IOException
	{
		JsonParser jsp = new JsonParser();
		ObjectMapper objmap = new ObjectMapper();
		FileReader fr = new FileReader("Resources/One3.json");
		Object obj = jsp.parse(fr);
		JsonObject jsobj = (JsonObject) obj;
		System.out.println(jsobj.get("Name"));
		System.out.println(jsobj.get("age"));
		System.out.println(jsobj.get("score in subjects"));
		
		JsonArray jsobje = jsobj.getAsJsonArray("score in subjects");
		System.out.println(jsobje.size());
		List<Object> scores_list = new ArrayList<Object>();
		for(int i=0;i<jsobje.size();i++)
		{
			//System.out.println(jsobje);
			scores_list.add(jsobje.get(i));
		}
	
			System.out.println(scores_list);
		
		
		
	}

}
