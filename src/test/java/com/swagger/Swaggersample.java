package com.swagger;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class Swaggersample extends BaseClass {

	String logtoken;
	@Test(priority = 9)
	
public void changeprofilepic() {
	

		
		List<Header> lstheader = new ArrayList<>();
		
		Header h1 = new Header("Authorization", "Bearer "+logtoken);
		Header h2 = new Header("Content-Type", "multipart/form-data");
		Header h3 = new Header("accept", "application/json");
		
		lstheader.add(h1);
		lstheader.add(h2);
		lstheader.add(h3);
		
		
		
		Headers headers = new Headers(lstheader);
		addHeaders(headers);
		addMultipartFormData("profile_picture", new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshot 2021-04-07 101210.png"));
		
		
		
		Response response = addReqType("POST", "https://omrbranch.com/api/changeProfilePic");
		
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200, "Verify status code");
		
		
		
//		SearchProduct_Output_Pojo searchProduct_Output_Pojo = response.as(SearchProduct_Output_Pojo.class);
//		DatumSearch datumSearch = searchProduct_Output_Pojo.getData().get(0);
//		String type = datumSearch.getType();
//		Assert.assertEquals(type, "product", "Verify search product");
		
}
	
	//@Test(priority = 8)
	public void cityList() {
		
		List<Header> lstheader = new ArrayList<>();
		
		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Content-Type", "application/json");
		
		lstheader.add(h1);
		lstheader.add(h2);
			
		Headers headers = new Headers(lstheader);
		addHeaders(headers);
		
		CityList_Input_Pojo cityList_Input_Pojo = new CityList_Input_Pojo("35");
		addReqBody(cityList_Input_Pojo);
		
		Response response = addReqType("POST", "https://omrbranch.com/api/cityList");
		
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200, "Verify status code");
		
		CityList_Output_Pojo cityList_Output_Pojo = response.as(CityList_Output_Pojo.class);
		DatumCityList datumCityList = cityList_Output_Pojo.getData().get(632);
		String name = datumCityList.getName();
		Assert.assertEquals(name, "Salem", "Verify city Salem");
		
					
	}
	
	//@Test(priority = 7)
	public void stateList() {
		
	List<Header> lstheader = new ArrayList<>();
		
		Header h1 = new Header("accept", "application/json");
		
		lstheader.add(h1);
		
		Headers headers = new Headers(lstheader);
		addHeaders(headers);
		
		Response response = addReqType("GET", "https://omrbranch.com/api/stateList");
		
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200, "Verify status code");
		
		StateList_Output_Pojo stateList_output_Pojo = response.as(StateList_Output_Pojo.class);
		DatumStateList datumStateList = stateList_output_Pojo.getData().get(34);
		String name = datumStateList.getName();
		Assert.assertEquals(name, "Tamil Nadu", "Verify state TamilNadu");
	}
		
	
	//@Test(priority = 6)
	public void searchProduct() {
		
		List<Header> lstheader = new ArrayList<>();
		
		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Content-Type", "application/json");
		
		lstheader.add(h1);
		lstheader.add(h2);
		
		
		Headers headers = new Headers(lstheader);
		addHeaders(headers);
		
		SearchProduct_Input_Pojo searchProduct_Input_Pojo = new SearchProduct_Input_Pojo("nuts");
		addReqBody(searchProduct_Input_Pojo);
		
		Response response = addReqType("POST", "https://omrbranch.com/api/searchProduct");
		
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200, "Verify status code");
		
		SearchProduct_Output_Pojo searchProduct_Output_Pojo = response.as(SearchProduct_Output_Pojo.class);
		DatumSearch datumSearch = searchProduct_Output_Pojo.getData().get(0);
		String type = datumSearch.getType();
		Assert.assertEquals(type, "product", "Verify search product");
		
		
		
	}

	// @Test(priority = 5)
	private void delete() {
		List<Header> lstHeader = new ArrayList<>();

		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Authorization", "Bearer " + logtoken);
		Header h3 = new Header("Content-Type", "application/json");

		lstHeader.add(h1);
		lstHeader.add(h2);
		lstHeader.add(h3);

		Headers headers = new Headers(lstHeader);

		addHeaders(headers);

		UserDeleteAddress_Input_Pojo userDeleteAddress_Input_Pojo = new UserDeleteAddress_Input_Pojo("87543");
		addReqBody(userDeleteAddress_Input_Pojo);

		Response response = addReqType("DELETE", "https://omrbranch.com/api/deleteAddress");
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200, "Verify status code");

		UserDeleteAddress_Output_pojo userDeleteAddress_Output_pojo = response.as(UserDeleteAddress_Output_pojo.class);
		String message = userDeleteAddress_Output_pojo.getMessage();
	
		Assert.assertEquals(message,"Address deleted successfully","verify Address deleted successfully");

//		UserDeleteAddress_Input_Pojo userDeleteAddress_Output_pojo= response.as(UserDeleteAddress_Input_Pojo.class);
//		
//		String message = userDeleteAddress_Output_pojo.getMessage();
//		Assert.assertEquals(message, "Address deleted successfully");
//
//		String resBodyAsPreettyString = getResBodyAsPreettyString(response);
//		System.out.println(resBodyAsPreettyString);

	}

	//@Test(priority = 4)

	private void getAddress() {
		List<Header> lstHeader = new ArrayList<>();

		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Authorization", "Bearer " + logtoken);
		// Header h3 = new Header("Content-Type", "application/json");

		lstHeader.add(h1);
		lstHeader.add(h2);
		// lstHeader.add(h3);

		Headers headers = new Headers(lstHeader);

		addHeaders(headers);
		Response response = addReqType("GET", "https://omrbranch.com/api/getUserAddress");

		// Datum getUserAddress_Output_Pojo = response.as(Datum.class);

		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200, "Verify status code");

		GetUserAddress_Output_Pojo getUserAddress_Output_Pojo = response.as(GetUserAddress_Output_Pojo.class);
		Datum datum = getUserAddress_Output_Pojo.getData().get(0);
		String first_name = datum.getFirst_name();
		Assert.assertEquals(first_name, "Raj", "Verify first name");

		String resBodyAsPreettyString = getResBodyAsPreettyString(response);
		System.out.println(resBodyAsPreettyString);
	}

	//@Test(priority = 3)

	private void updateAddress() {
		List<Header> lstHeader = new ArrayList<>();

		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Authorization", "Bearer " + logtoken);
		Header h3 = new Header("Content-Type", "application/json");

		lstHeader.add(h1);
		lstHeader.add(h2);
		lstHeader.add(h3);

		Headers headers = new Headers(lstHeader);

		addHeaders(headers);

		UpdateUserAddress_Input updateUserAddress_Input = new UpdateUserAddress_Input("2755", "aaa", "bb", "9944010757",
				"super", 101, 333, 106, "611002", "aaa nagar", "Home");
		addReqBody(updateUserAddress_Input);

		Response response = addReqType("PUT", "https://omrbranch.com/api/updateUserAddress");

		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200, "Verify status code");

		UpdateUserAddress_Output updateUserAddress_Output = response.as(UpdateUserAddress_Output.class);

		String message = updateUserAddress_Output.getMessage();
		Assert.assertEquals(message, "Address updated successfully", "Verify Address updated successfully");

	}

	//@Test(priority = 2)
	private void addAddress() {

		List<Header> lstHeader = new ArrayList<>();

		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Authorization", "Bearer " + logtoken);
		Header h3 = new Header("Content-Type", "application/json");

		lstHeader.add(h1);
		lstHeader.add(h2);
		lstHeader.add(h3);

		Headers headers = new Headers(lstHeader);

		addHeaders(headers);

		AddUserAddress_Input_Pojo addUserAddress_Input_Pojo = new AddUserAddress_Input_Pojo("Darul Aslam", "MR",
				"6381016523", "mrd", 101, 333, 106, "611001", "rethinasamy nagar", "Home");
		addReqBody(addUserAddress_Input_Pojo);

		Response response = addReqType("POST", "https://omrbranch.com/api/addUserAddress");

		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200, "Verify status code");

		AddAddress_Output_Pojo addUserAddress_Output_Pojo = response.as(AddAddress_Output_Pojo.class);

		String message = addUserAddress_Output_Pojo.getMessage();
		Assert.assertEquals(message, "Address added successfully", "Verify Address added successfully");

		String resBodyAsPreettyString = getResBodyAsPreettyString(response);
		System.out.println(resBodyAsPreettyString);
	}

	@Test(priority = 1)
	public void login() {

		// 1. Header

		addHeader("accept", "application/json");

		// 2. Basic auth

		addBasicAuth("darul87@gmail.com", "Darul@1987");

		// 3.req type

		Response response = addReqType("POST", "https://omrbranch.com/api/postmanBasicAuthLogin");

		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200, "verify status code");
		Login_Output_pojo login_Output_pojo = response.as(Login_Output_pojo.class);
		String first_name = login_Output_pojo.getData().getFirst_name();
		Assert.assertEquals(first_name, "Darul Aslam", "verify first name");
		logtoken = login_Output_pojo.getData().getLogtoken();

		String resBodyAsString = getResBodyAsString(response);
		System.out.println(resBodyAsString);

		// String resBodyAsPreettyString = getResBodyAsPreettyString(response);
		// System.out.println(resBodyAsPreettyString);

	}

}
