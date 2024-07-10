package com.restassured;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Samplecreate extends BaseClass {
	String flightnum="";
	@Test(priority = 1)

	public void createFlight() {
		
		// 1. Header
		addHeader("Content-Type", "application/json");
		// 2. payload
		addReqBody("{\r\n" + "    \"flightName\": \"AirIndia\",\r\n" + "    \"Country\": \"India\",\r\n"
				+ "    \"Destinations\": \"87\",\r\n"
				+ "    \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India\"\r\n" + "}");
		// 3. req type and end point
		Response response = addReqType("POST", "https://omrbranch.com/api/flights");
		// 4. Status code

		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		//Assert.assertEquals(201, statusCode, "Verify staus code");
		JsonPath path = response.jsonPath();
		Object object = path.get("data.id");
		//System.out.println(object);
		Integer dest=(Integer)object;
		String string = dest.toString();
		flightnum=string;
		System.out.println(string);
		
		// 5. get res body
		String resBodyAsString = getResBodyAsString(response);
		System.out.println(resBodyAsString);
		
		String resBodyAsPreettyString = getResBodyAsPreettyString(response);
		System.out.println(resBodyAsPreettyString);
	}

	@Test(priority = 2)

	public void updateFlight() {

		addHeader("Content-Type", "application/json");

		addReqBody("{\r\n" + "    \"flightName\": \"AirIndia\",\r\n" + "    \"Country\": \"India\",\r\n"
				+ "    \"Destinations\": 28,\r\n"
				+ "    \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India\"\r\n" + "}");

		Response response = addReqType("PUT", "https://omrbranch.com/api/flight/"+flightnum);

		int statusCode = getStatusCode(response);
		System.out.println(statusCode);

		String resBodyAsPreettyString = getResBodyAsPreettyString(response);
		System.out.println(resBodyAsPreettyString);
	}

	@Test(priority = 3)

	public void patchFLight() {

		addHeader("Content-Type", "application/json");

		addReqBody("{\r\n" + "    \"Destinations\": 35\r\n" + "}");

		Response response = addReqType("PATCH", "https://omrbranch.com/api/flight/"+flightnum);

		int statusCode = getStatusCode(response);
		System.out.println(statusCode);

		String resBodyAsPreettyString = getResBodyAsPreettyString(response);
		System.out.println(resBodyAsPreettyString);

	}

	@Test(priority=4)

	public void deleteFlight() {

//		addHeader("Content-Type", "application/json");
//
//		addReqBody("{\r\n"
//				+ "    \"Destinations\": 35\r\n"
//				+ "}");

		Response response = addReqType("DELETE", "https://omrbranch.com/api/flight/"+flightnum);

		int statusCode = getStatusCode(response);
		System.out.println(statusCode);

		String resBodyAsPreettyString = getResBodyAsPreettyString(response);
		System.out.println(resBodyAsPreettyString);
	}

	@Test(priority = 5)

	public void getFlight() {

//		addHeader("Content-Type", "application/json");
//
//		addReqBody("{\r\n"
//				+ "    \"Destinations\": 35\r\n"
//				+ "}");

		Response response = addReqType("get", "https://omrbranch.com/api/flight/"+flightnum);

		int statusCode = getStatusCode(response);
		System.out.println(statusCode);

		String resBodyAsPreettyString = getResBodyAsPreettyString(response);
		System.out.println(resBodyAsPreettyString);
	}
}
