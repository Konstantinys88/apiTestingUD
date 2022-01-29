package config;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;

import static constants.Constants.RunVeriable.*;
import static constants.Constants.Servers.REQUSTBIN_URL;

public class TestConfig {

    protected RequestSpecification requestSpecificationXml = new RequestSpecBuilder()
            .addHeader("Content-Type", "application/xml")
            .addCookie("testCookieXML")
            .setBaseUri(REQUSTBIN_URL)
            .build();

    protected RequestSpecification requestSpecificationJson = new RequestSpecBuilder()
            .addHeader("Content-Type", "application/json")
            .addCookie("testCookieJSON")
            .build();

    protected ResponseSpecification responseSpecificationForGet = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .build();

    protected ResponseSpecification responseSpecificationForPost = new ResponseSpecBuilder()
            .expectStatusCode(201)
            .build();

    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = server;
        RestAssured.basePath = path;

//        RequestSpecification requestSpecificationJson = new RequestSpecBuilder()
//                .addHeader("Content-Type","application/json")
//                .addCookie("testCookieJSON")
//                .build();
//
//        RestAssured.requestSpecification = requestSpecificationJson;


    }
}
