//Creating Java Map From JSON String
package jackson_libraryPractcing;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class A1_Program {
	
	@Test
	public void jsonTomapconversion() throws JsonParseException, JsonMappingException, IOException
	{
		String s1="{\r\n" + 
				"\"Names\":[\r\n" + 
				"{\r\n" + 
				"\"Name\":\"ananda K R\",\r\n" + 
				"\"age\":99\r\n" + 
				"},\r\n" + 
				"{\r\n" + 
				"\"Name\":\"ananda K R_111\",\r\n" + 
				"\"age\":99\r\n" + 
				"}]\r\n" + 
				"}";
		ObjectMapper objmper = new ObjectMapper();
		Map<String, Object> objemap = objmper.readValue(s1, HashMap.class);
		
		
		
		System.out.println("---------Creating Java Map From JSON String --------This is testing map");
		for(Map.Entry<String, Object> e: objemap.entrySet())
		{
			System.out.println("this is setting");
			System.out.println(e.getKey()+"----"+e.getValue());
		}
		
	}
	

}
