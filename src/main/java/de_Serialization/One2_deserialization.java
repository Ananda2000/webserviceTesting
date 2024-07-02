package de_Serialization;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Pojoclass_ForSerializationAndDeserialization.One2_pojoclass;
import io.restassured.parsing.Parser;

public class One2_deserialization 
{
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objmapper = new ObjectMapper();
		
		
		File fil1 = new File("C:\\Users\\ANANDA K R\\eclipse-workspace\\WebServiceTesting\\Resources\\One2.json");

		//One2_pojoclass one2_obj = new One2_pojoclass();
		
		One2_pojoclass lll = objmapper.readValue(fil1, One2_pojoclass.class);
		
		System.out.println(lll.getAge());
		System.out.println(lll.getName());
		System.out.println(lll.getScore_in_subjects().length);
		
		for (String aaa : lll.getScore_in_subjects()) {
			//System.out.println(aaa);
			int aaaa=Integer.parseInt(aaa);
			
			System.out.println(aaaa +"---------------");
			
		}
		
	}

}
