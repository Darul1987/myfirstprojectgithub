package com.firstflight;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Listflight {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader fileReader=new FileReader("C:\\Users\\Tawfiq\\eclipse-workspace\\Apiproject\\src\\test\\resources\\listflights.json");
		JSONParser jsonparser = new JSONParser();
		Object parse = jsonparser.parse(fileReader);
		JSONObject jsonobject = (JSONObject)parse;
		Object object12 = jsonobject.get("page");
		System.out.println(object12);
		
		Object object13 = jsonobject.get("per_page");
		System.out.println(object13);
		
		Object object14 = jsonobject.get("total");
		System.out.println(object14);
		
		Object object15 = jsonobject.get("total_pages");
		System.out.println(object15);
		
		System.out.println();
		
		Object object = jsonobject.get("data");
		JSONArray array = (JSONArray) object;
		
		for (int i = 0; i < array.size(); i++) {
			Object object2 = array.get(i);
			JSONObject jsonObject2=(JSONObject) object2;
			
			Object object3 = jsonObject2.get("id");
			System.out.println(object3);
			
			Object object4 = jsonObject2.get("flightName");
			System.out.println(object4);
			
			Object object5 = jsonObject2.get("Country");
			System.out.println(object5);
			
			Object object6 = jsonObject2.get("Destinations");
			System.out.println(object6);
			
			Object object7 = jsonObject2.get("URL");
			System.out.println(object7);
			
			System.out.println();
			
		   Object support = jsonobject.get("support");
	       JSONObject jsonObject3=(JSONObject)support;
			    
		   Object url = jsonObject3.get("url");
		    System.out.println(url);
			    
		    Object text = jsonObject3.get("text");
		    System.out.println(text);
			
		
	}

	}
	}
