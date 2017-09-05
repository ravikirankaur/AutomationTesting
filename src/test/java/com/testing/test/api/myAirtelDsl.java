package com.testing.test.api;

import com.testing.constants.constants;
import com.testing.constants.urlconstants;
import com.testing.framework.BaseClass;
import com.testing.testClients.myAirtelDslClient;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.testing.apiBin.MyAirtelDsl;
import io.restassured.mapper.ObjectMapperType;

public class myAirtelDsl extends myAirtelDslClient {
    @Test
    public void verifyDslDataRollOverOld() {
        verifyApiResponseCodeWithQueryParameter(urlconstants.profileInfoDsl,
        constants.dslParamSiNumber, constants.dslParamSiNumberValue, constants.apiSuccessResponseCode);

        Response response = getApiResponseOld(urlconstants.profileInfoDsl, constants.dslParamSiNumber,
                constants.dslParamSiNumberValue);
    }

    @Test(groups = "dsl")
    public void verifyDslDataRollOver() {

        //set request specifications
        RequestSpecification requestSpecification = new BaseClass().getRequestSpecifications("myAirtel");
        addQueryParam(requestSpecification,constants.dslParamDensity,constants.dslParamDensityValue);
        addQueryParam(requestSpecification,constants.dslParamSiNumber,constants.dslParamSiNumberValue);

        //get response
        Response response = getGetApiResponse(requestSpecification, urlconstants.profileInfoDsl, constants.apiSuccessResponseCode);

        //Map the response to GSON response
        MyAirtelDsl abc = response.as(MyAirtelDsl.class, ObjectMapperType.GSON);

        //validate response
        SoftAssert softassert = new SoftAssert();

        if(response.body().toString().contains("usgMap"))
            System.out.println(constants.dslParamSiNumberValue + " has rolled over data.");

        else
            System.out.println(constants.dslParamSiNumberValue + " does not have rolled over data.");

    }
}