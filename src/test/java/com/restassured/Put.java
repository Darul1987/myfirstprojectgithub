package com.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put {
	public static void main(String[] args) {
		
		RequestSpecification reqspec;
		
		reqspec=RestAssured.given();
		
		reqspec=reqspec.header("Content-Type","application/json");
		
		reqspec=reqspec.body("{\r\n"
				+ "    \"flightName\": \"AirIndia\",\r\n"
				+ "    \"Country\": \"India\",\r\n"
				+ "    \"Destinations\": 68,\r\n"
				+ "    \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India\"\r\n"
				+ "}");
		
		Response response = reqspec.put("https://www.omrbranch.com/api/flight/29220");
		
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		
		String asString = response.asString();
		System.out.println(asString);
		
		String asPrettyString = response.asPrettyString();
		System.out.println(asPrettyString);
		
	}
	}