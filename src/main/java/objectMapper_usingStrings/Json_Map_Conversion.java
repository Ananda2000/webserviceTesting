package objectMapper_usingStrings;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Json_Map_Conversion 
{
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper objmapper = new ObjectMapper();
		
		/*String jsonString = "{\r\n" + 
				"\"name\":\"ananda K R\",\r\n" + 
				"\"age\":99\r\n" + 
				"}\r\n" + 
				"";*/
		String jsonString ="{\r\n" + 
				"\"Name\":\"ananda K R\",\r\n" + 
				"\"age\":99,\r\n" + 
				"\"score in subjects\":[99,84,67]\r\n" + 
				"}";
		Map map12 = new HashMap();
		map12 = objmapper.readValue(jsonString, Map.class);
		System.out.println(map12);
		
		// THE BELOW LOOPS WILL NOT WORKING NON GENERICS MAPS WE HAVE TO USE ITERATOR..
		/*for (Map.Entry string123 : map12.) {
			System.out.println(string123.getKey() +"--"+string123.getValue());
		}*/
		Iterator<Map.Entry> itr = map12.entrySet().iterator();
		
		while(itr.hasNext())
		{
			
			Map.Entry  entryy= itr.next();
			if(entryy.getKey() instanceof Object)
			{
			{
			System.out.println(entryy.getKey() +"--"+entryy.getValue());
			}
			if(entryy.getKey() instanceof Array)
			{
				int [] arraysize = (int[]) entryy.getValue();
				for (int i : arraysize) {
					System.out.println(arraysize[i]);
			}
			
				
			}
			
		}
	
	}
}
}