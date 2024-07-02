package ReadingComplexJson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Json1 
{
	public static void main(String [] args) throws IOException
	{
		ObjectMapper objmapper = new ObjectMapper();
		objmapper.enable(SerializationFeature.INDENT_OUTPUT);
		String  str ="[\r\n" + 
				"			{\"name\":\"guru\",\r\n" + 
				"				\"village\":\"kethaganahalli\",\r\n" + 
				"				\"language\":\"Kannada\"\r\n" + 
				"			},\r\n" + 
				"			{\"name\":\"guru1\",\r\n" + 
				"			\"village\":\"kethaganahalli1\",\r\n" + 
				"			\"language\":\"Kannada1\"\r\n" + 
				"			}\r\n" + 
				"]\r\n" + 
				"";
		System.out.println(str);
		Map map = objmapper.readValue(str, Map.class);
		
		System.out.println(map.size());
		Set keysinmap = map.keySet();
		System.out.println(keysinmap);
		
		for (Object object : keysinmap) 
		{
			System.out.print(object+":");
			if(map.get(object) instanceof String)
			{
				System.out.println(map.get(object));
			}
			if(map.get(object) instanceof Integer)
			{
				System.out.println(map.get(object));
			}
			if(map.get(object) instanceof ArrayList)
			{
				ArrayList<Integer> aa = (ArrayList<Integer>) map.get(object);
				for (Integer integer : aa) 
				{
					System.out.print(integer+",");
					if(integer == 99)
					{
						System.out.println("The number is present");
					}
					
				}
			}
			
		}
		
		/*System.out.println(map);
		System.out.println(map.get("name") instanceof String);
		System.out.println(map.get("age") instanceof Integer);
		System.out.println(map.get("marks") instanceof ArrayList);
		*/
		/*for (Map.Entry<String, Object> string : map.entrySet()) {
			
		}*/
	}

}
