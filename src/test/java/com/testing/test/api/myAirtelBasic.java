package com.testing.test.api;

import org.testng.Assert;
import com.testing.constants.constants;
import com.testing.constants.urlconstants;
import com.testing.testClients.myAirtelBasicClient;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class myAirtelBasic extends myAirtelBasicClient {

    @Test()
    public void getUID(){
        verifyApiResponseCode(urlconstants.getUID,constants.apiSuccessResponseCode);
    }

    @Test(groups = "basic")
    public void getUID2() {
        verifyApiResponseCodeWithQueryParameter(urlconstants.getUID, constants.getUidParam, constants.getUidParamValue, constants.apiSuccessResponseCode);
        Response response = getApiResponseOld(urlconstants.getUID, constants.getUidParam, constants.getUidParamValue);

        //response.xthen().body("uid",equals("h0uZ7FYyIBSlFhU010"), "msisdn", equals("9711665996"));

        Assert.assertEquals(response.path("uid"),"h0uZ7FYyIBSlFhU010","uid is verified");

        //java object validation

    }
}
