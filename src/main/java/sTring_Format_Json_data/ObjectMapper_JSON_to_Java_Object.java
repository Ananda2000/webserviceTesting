//ObjectMapper JSON to Java Object  -- https://www.javaguides.net/2019/07/objectmapper-json-to-java-object.html

package sTring_Format_Json_data;

import java.io.IOException;
import java.util.Map;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class ObjectMapper_JSON_to_Java_Object 
{
	@Test
	public void JsonToJavaObject() throws JsonParseException, JsonMappingException, IOException
	{
		String s1 ="{\"Name\":\"anandaKR1\",\"age\":\"100\"}";
		System.out.println("The length is ----"+s1.length());
		 	ObjectMapper objmap = new ObjectMapper();
		 	objmap.enable(SerializationFeature.INDENT_OUTPUT);
		 	
		 	Map<String, String> aaa =objmap.readValue(s1,Map.class);
		 	
		 	for(Map.Entry<String,String> ela : aaa.entrySet()) 
		 	{
		 	
				System.out.println(ela.getKey() +" : "+ela.getValue());
			}
		 	
		 	
		 	
		 	
	}

}
