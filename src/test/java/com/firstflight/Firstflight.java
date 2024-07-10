package com.firstflight;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Firstflight {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader fileReader=new FileReader("C:\\Users\\Tawfiq\\eclipse-workspace\\Apiproject\\src\\test\\resources\\firstflight.json");
		JSONParser jsonParser=new JSONParser();
		Object parse = jsonParser.parse(fileReader);
		JSONObject jsonobject = (JSONObject)parse;
		Object object = jsonobject.get("data");
		
	    JSONObject jsonObject2=(JSONObject)object;
	    Object object2 = jsonObject2.get("flightName");
	    System.out.println(object2);
	    
	    Object object3 = jsonObject2.get("Country");
	    System.out.println(object3);
	    
	    Object object4 = jsonObject2.get("Destinations");
	    System.out.println(object4);
	    
	    Object object5 = jsonObject2.get("URL");
	    System.out.println(object5);
	    
	    Object object6 = jsonObject2.get("Created_Date");
	    System.out.println(object6);
	    
	    Object object7 = jsonObject2.get("Updated_Date");
	    System.out.println(object7);
	    
	    System.out.println();
	    
	    Object object8 = jsonobject.get("support");
	    JSONObject jsonObject3=(JSONObject)object8;
	    
	    Object object9 = jsonObject3.get("url");
	    System.out.println(object9);
	    
	    Object object10 = jsonObject3.get("text");
	    System.out.println(object10);
	    
		
	}

}
