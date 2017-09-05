package com.testing.framework;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.given;

public class BaseClass {

    //-------------------TEST NG COMMON METHODS--------------
    @BeforeSuite(alwaysRun = true)
    public void beforeSuite(){
        readApiConfigirations("Selfcare");
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite(){}

    //--------------------API COMMON METHODS-----------------

    //get api configurations
    public void readApiConfigirations(String myAirtelOrSelfcare) {

        if (myAirtelOrSelfcare == "myAirtel") {
            RestAssured.baseURI = "http://apitestmycloud.bsbportal.com";
            //RestAssured.port = 8080;
            RestAssured.basePath = "/myairtelapp";
        }
        else if (myAirtelOrSelfcare == "Selfcare") {
            RestAssured.baseURI = "http://125.16.74.78";
            //RestAssured.port = 8080;
            RestAssured.basePath = "/app/wl-service";
        }
    }

    //get request specifications
    public RequestSpecification getRequestSpecifications(String myAirtelOrSelfcare){

        RequestSpecification RequestSpecification;

        if (myAirtelOrSelfcare == "myAirtel") {
            RequestSpecification = RestAssured.given().
                    header("x-bsy-dt", "0a91pvez").
                    header("x-bsy-did", "cdc0b23408b7654e").
                    header("x-bsy-utkn", "h0uZ7FYyIBSlFhU010:35R+m5m8Pj/hOody/KAJGSFxxG4=").
                    contentType(ContentType.JSON);
        }
        else if (myAirtelOrSelfcare == "Selfcare") {
            RequestSpecification = RestAssured.given().
                    header("Content-Type", "application/json").
                    header("appAuth", "apiPass").
                    header("requestSrc", "myAirtelApp").
                    contentType(ContentType.JSON);
        }
        else {
            RequestSpecification = RestAssured.given().
                contentType(ContentType.JSON);
        }

        return RequestSpecification;
    }

    //add query param to request specifications
    public void addQueryParam(RequestSpecification requestSpecification, String queryParam, String queryParamValue) {
        requestSpecification.queryParam(queryParam, queryParamValue);
    }

    //add headers to request specifications
    public void addHeaderToRequest(RequestSpecification requestSpecification, String header, String headerValue) {
        requestSpecification.header(header, headerValue);
    }

    //add body to request specifications
    public void addBodyToApi(RequestSpecification requestSpecification, String body) {
        requestSpecification.body(body);
}

    //get api response OLD
    public Response getApiResponseOld(String apiEndPoint,String queryParam, String paramValue){
        RequestSpecification requestSpecification = new BaseClass().getRequestSpecifications("Selcare");

        requestSpecification.queryParam(queryParam,paramValue);

        Response response = given().spec(requestSpecification).get(apiEndPoint);
        return response;
    }

    //get Api Response
    public Response getApiResponse(RequestSpecification requestSpecification, String getOrPost, String apiEndPoint, int status){

        Response response;

        if (getOrPost == "get") { response = requestSpecification.get(apiEndPoint);}
        else if (getOrPost == "post") { response = requestSpecification.post(apiEndPoint);}
        else { response = null; }

        Assert.assertEquals(response.getStatusCode(),status);
        response.then().log().all();
        return response;
    }

    //get api response
    public Response getGetApiResponse(RequestSpecification requestSpecification,String apiEndPoint, int status){
        Response response = requestSpecification.get(apiEndPoint);

        Assert.assertEquals(response.getStatusCode(),status);
        response.then().log().all();
        return response;
    }

    //get api response
    public Response getPostApiResponse(RequestSpecification requestSpecification,String apiEndPoint, int status){
        Response response = requestSpecification.post(apiEndPoint);

        Assert.assertEquals(response.getStatusCode(),status);
        response.then().log().all();
        return response;
    }

    //verify response code of api
    public void verifyApiResponseCode(String apiEndPoint, int statusCodeToVerify) {
        given().get(apiEndPoint).then().statusCode(statusCodeToVerify).log().all();
    }

    //verify response code of api having query param
    public void verifyApiResponseCodeWithQueryParameter(String apiEndPoint,String queryParam, String paramValue, int statusCodeToVerify) {

        RequestSpecification requestSpecification = new BaseClass().getRequestSpecifications("Selfcare");
        requestSpecification.queryParam(queryParam,paramValue);
        given().spec(requestSpecification).get(apiEndPoint).then().statusCode(statusCodeToVerify).log().all();
    }

    //verify response code of api having path parameter
    public void verifyApiResponseCodeWithPathParameter(String apiEndPoint,String queryParam, String paramValue, int statusCodeToVerify) {

        RequestSpecification requestSpecification = new BaseClass().getRequestSpecifications("Selfcare");
        requestSpecification.pathParam(queryParam,paramValue);
        given().spec(requestSpecification).get(apiEndPoint).then().statusCode(statusCodeToVerify).log().all();
    }

    //-------------------APP COMMON METHODS-------------------
}
