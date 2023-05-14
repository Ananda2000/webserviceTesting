package objectMapper_usingStrings;

import java.io.IOException;
import java.util.Iterator;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjMapper_Program1 
{
	public static void main(String [] args) throws IOException
	{
		ObjectMapper objmapper = new ObjectMapper();
		String srt1 ="{\r\n" + 
				"\"Name\":\"ananda K R\",\r\n" + 
				"\"age\":99,\r\n" + 
				"\"score in subjects\":[99,84,67]\r\n" + 
				"}";
		
		JsonNode rootnode = objmapper.readTree(srt1);
		JsonNode nameNode = rootnode.path("Name");
		System.out.println(nameNode.asText());
		
		JsonNode jsnodarray = rootnode.path("score in subjects");
		Iterator<JsonNode> itr = jsnodarray.elements();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
