package de_Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import Pojoclass_ForSerializationAndDeserialization.pojoclass_for_one_1json;

public class DeserializedClass 
{
	@Test
	public void deserialexample() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper objmap = new ObjectMapper();
		
		File fil= new File("C:\\Users\\ANANDA K R\\eclipse-workspace\\WebServiceTesting\\Resources\\one_1.json");
		//serialization..
		FileInputStream filinpstr = new FileInputStream(fil);
		
		pojoclass_for_one_1json str = objmap.readValue(filinpstr, pojoclass_for_one_1json.class);
		System.out.println(str.getAge());
		System.out.println(str.getName());
		
		// deserialization...
		
		String jsonformat = objmap.writeValueAsString(str);
		System.out.println("This is json format....");
		System.out.println(jsonformat);
	
		
		JsonNode rootnode = objmap.readTree(jsonformat);
		
		System.out.println("reading from root node ---NAME"+rootnode.path("name"));
		System.out.println("Reading from node format ---AGE"+rootnode.path("age"));
	}

}
