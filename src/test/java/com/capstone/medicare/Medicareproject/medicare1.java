package com.capstone.medicare.Medicareproject;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class medicare1 {
	public static void main(String[] args) {
		RequestSpecification req=new RequestSpecBuilder().setBaseUri(constants.url).build();
		RequestSpecification res=given().spec(req);
		ResponseSpecification response=new ResponseSpecBuilder().expectStatusCode(200).build();
		System.out.println("Status code sucessfully validated ");
		 Response response1=res.when().get().then().statusCode(200).extract().response();
		 String ResponseString = response1.asString();
		 System.out.println("------------------------");
		 System.out.println("Output of the get request : ");
		System.out.println(ResponseString);
		System.out.println("------------------------");

	}
}
