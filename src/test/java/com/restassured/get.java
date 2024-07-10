package com.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class get {
	public static void main(String[] args) {
		
		RequestSpecification reqspec;
		
		reqspec=RestAssured.given();
		
		//reqspec=reqspec.header("Content-Type","application/json");
		

		
		Response response = reqspec.get("https://www.omrbranch.com/api/flight/29220");
		
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		
		String asString = response.asString();
		System.out.println(asString);
		
		String asPrettyString = response.asPrettyString();
		System.out.println(asPrettyString);
		
	}
	}



