package com.firstflight;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JacksonInject.Value;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Mapper {
public static void main(String[] args) throws StreamReadException, DatabindException, IOException  {
	File file=new File("C:\\Users\\Tawfiq\\eclipse-workspace\\Apiproject\\src\\test\\resources\\listflightspogo.json");
	ObjectMapper mapper=new ObjectMapper();
	Employeepojo1 employeepojo1=mapper.readValue(file,Employeepojo1.class);
	int page = employeepojo1.getPage();  
	int per_page = employeepojo1.getPer_page();
	int total = employeepojo1.getTotal();  
	int total_pages = employeepojo1.getTotal_pages();
	
	System.out.println(page); 
	System.out.println(per_page); 
	System.out.println(total); 
	System.out.println(total_pages);      
	
	ArrayList<Employeepojo> data = employeepojo1.getData(); 
	for (Employeepojo d : data) {
		System.out.println(d.getId());
    	System.out.println(d.getFlightName());
    	System.out.println(d.getCountry());
    	System.out.println(d.getDestinations());
    	System.out.println(d.getURL());
    }
    	
    	Employeepojo2 employeepojo2=employeepojo1.getSupport();
    	String text = employeepojo2.getText();
    	System.out.println(text);
    	String url = employeepojo2.getUrl();
    	System.out.println(url);
 	
}



	
	
	
	
	
}

