package com.testing.test.api;

import com.testing.apiBin.MyAirtelDsl;
import com.testing.constants.constants;
import com.testing.constants.urlconstants;
import com.testing.framework.BaseClass;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.testing.testClients.myPlanClient;

public class myPlanApiTest extends myPlanClient {

    @Test(groups = "myPlan")
    public void currentPlanFetchApi() {

        //set request specifications
        RequestSpecification requestSpecification = new BaseClass().getRequestSpecifications("Selfcare");
        addBodyToApi(requestSpecification, constants.currentPlanFetchBody);

        //get response
        Response response = getApiResponse(requestSpecification, "post",urlconstants.currentPlanFetch, constants.apiSuccessResponseCode);

        //Map the response to GSON response
        MyAirtelDsl abc = response.as(MyAirtelDsl.class, ObjectMapperType.GSON);

        //validate response
        SoftAssert softassert = new SoftAssert();

    }

    @Test(groups = "myPlan")
    public void currentPlanFetchGetApi() {

        //set request specifications
        RequestSpecification requestSpecification = new BaseClass().getRequestSpecifications("Selfcare");
        addQueryParam(requestSpecification,constants.myPlanParamPlanBusiness,constants.myPlanParamPlanBusinessValue);
        addQueryParam(requestSpecification,constants.myPlanParamSiNumber,constants.myPlanParamSiNumberValue);
        addQueryParam(requestSpecification,constants.myPlanParamListView,constants.myPlanParamListViewValue);

        //get response
        Response response = getApiResponse(requestSpecification,"get", urlconstants.currentPlanFetchGet, constants.apiSuccessResponseCode);

        //Map the response to GSON response
        MyAirtelDsl abc = response.as(MyAirtelDsl.class, ObjectMapperType.GSON);

        //validate response
        SoftAssert softassert = new SoftAssert();

    }
}
