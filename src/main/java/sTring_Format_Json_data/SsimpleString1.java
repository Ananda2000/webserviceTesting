package sTring_Format_Json_data;

import java.util.Collection;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;

public class SsimpleString1 
{
	@Test
	public void simpleString()
	{
		//String s1="{\"Name\":\"guru\",\"Village\":\"kethaganahalli\",\"language\":\"kannada\"}";
		String s1 ="[{\"bookingid\":2361},{\"bookingid\":3049},{\"bookingid\":4909},{\"bookingid\":5256},{\"bookingid\":5298},{\"bookingid\":11574},{\"bookingid\":2195}]";
		
		ObjectMapper objmap = new ObjectMapper();
		//JSONObject jobj= (JSONObject) JSONValue.parse(s1);
		JSONArray jarr = (JSONArray) JSONValue.parse(s1);
		System.out.println(jarr);
		System.out.println(jarr.size());
		for(int i=0;i<jarr.size();i++)
		{
			//System.out.println(jarr.get(i));
			JSONObject json1 = (JSONObject) jarr.get(i);
			//System.out.println(json1.get("bookingid"));
			if(json1 instanceof JSONObject)
			{
				//JSONObject jobj = new JSONObject();
				System.out.println(json1.keySet() +"------"+json1.values());
			/*String sw = json1.keySet().toString().replaceAll("\\,|\\[|\\]|\\s", "");
			String aa = json1.values().toString();
			String sss = String.valueOf(sw);
			String ss1 ="ssss";
			String[] ss2= {"sdds"};
			System.out.println(ss1);
			System.out.println(ss2[0]);
			System.out.println(sw +"---"+aa);
			
				System.out.println(sw.equalsIgnoreCase("bookingid"));*/
			}
		}
		
		
		//System.out.println(jobj);
		
		
		
	}

}
