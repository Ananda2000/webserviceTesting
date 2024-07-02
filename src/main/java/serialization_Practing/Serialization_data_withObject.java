package serialization_Practing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.io.FileReader;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Serialization_data_withObject 
{
	public static void main(String [] args) throws IOException
	{
	ObjectMapper objmapper = new ObjectMapper();
	//File fl = new File("");
	
	Map<String, String>  map11 = new HashMap<String, String>();
	map11.put("Name", "Kumar");
	map11.put("age", "55");
	
	System.out.println(map11);
	
	String str123 = objmapper.writerWithDefaultPrettyPrinter().writeValueAsString(map11);
	System.out.println(str123);
	
	FileWriter flwr = new FileWriter("C:\\Users\\ANANDA K R\\eclipse-workspace\\SimpleJson_WebServiceTesting\\JsonFiles\\one9.json");
	flwr.write(str123);
	flwr.flush();
	flwr.close();
	
	
	///Deserialization of json file..
	
	
	File fln = new File("C:\\Users\\ANANDA K R\\eclipse-workspace\\SimpleJson_WebServiceTesting\\JsonFiles\\one9.json");
	FileReader flread = new FileReader(fln);
	
	Map<String, String> fln1 = objmapper.readValue(flread, Map.class);
	
	System.out.println(fln1.get("age"));
	System.out.println(fln1.get("Name"));
	
	Set<String> sgr = fln1.keySet();
	System.out.println(sgr);
	System.out.println(sgr.size());
	
	if(fln1.containsKey("age") )
			{
		System.out.println(fln1.put("age", fln1.get("age")+1));
	}
	System.out.println(fln1);
	
	}

}
