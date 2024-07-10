package com.firstflight;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Writefiles {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		File file=new File("C:\\Users\\Tawfiq\\eclipse-workspace\\Apiproject\\src\\test\\resources\\listflightspogowrite.json");
		ObjectMapper mapper=new ObjectMapper();
		ArrayList<Employeepojo>data= new ArrayList<>();
	    Employeepojo e1=new Employeepojo(3,"AirIndia","India","28","http:\\/\\/en.wikipedia.org/wiki/Air_India");
	    Employeepojo e2=new Employeepojo(33,"AirIndia","India","28","http:\\/\\/en.wikipedia.org/wiki/Air_India");
	    Employeepojo e3=new Employeepojo(36,"Srilankan AriLines","srilanka","28","http:\\/\\/en.wikipedia.org/wiki/Air_India");
	    Employeepojo e4=new Employeepojo(42,"AirIndia.Raj","India","28","http:\\/\\/en.wikipedia.org/wiki/Air_India");
	    Employeepojo e5=new Employeepojo(49,"AirIndia","India","28","http:\\/\\/en.wikipedia.org/wiki/Air_India");
	    Employeepojo e6=new Employeepojo(59,"AirIndia","India","28","http:\\/\\/en.wikipedia.org/wiki/Air_India");
	    
	   data.add(e1);
	   data.add(e2);
	   data.add(e3);
	   data.add(e4);
	   data.add(e5);
	   data.add(e6);
	   Employeepojo2 employeepojo2=new Employeepojo2("https:\\/\\/www.omrbranch.com", "For Joining Automation Course Please Contact-Velmurugan 9944152058");
	    
	   Employeepojo1 employeepojo1=new Employeepojo1(1,6,7544,1288,data,employeepojo2);
	   mapper.writeValue(file, employeepojo1);
	   
	    
	    
		
	}

}
