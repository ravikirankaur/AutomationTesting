package com.testing.constants;

public interface constants {

    //COMMON
    int apiSuccessResponseCode = 200;

    String getUidParam = "msisdn";
    String getUidParamValue = "7840034456";

    //DSL
    String dslParamSiNumber = "siNumber";
    String dslParamSiNumberValue = "012434272642_dsl";
    String dslParamDensity = "density";
    String dslParamDensityValue = "xxhdpi";

    //current plan fetch post api
    String myPlanSiNumber ="7028926727";
    String currentPlanFetchBody = "{" +
            "\"request\":[" +
            "{" +
            "\"siNumber\":\""+ constants.myPlanSiNumber +"\"," +
            "\"listView\":true," +
            "\"fetchChildInfo\":true," +
            "\"fetchVirtualChild\" : true" +
            "}" +
            "]" +
            "}";

    //current plan fetch get api
    String myPlanParamPlanBusiness= "planBusiness";
    String myPlanParamPlanBusinessValue ="ChangePlan";
    String myPlanParamSiNumber = "siNumber";
    String myPlanParamSiNumberValue ="7028926727";
    String myPlanParamListView = "listView";
    String myPlanParamListViewValue = "true";

}
