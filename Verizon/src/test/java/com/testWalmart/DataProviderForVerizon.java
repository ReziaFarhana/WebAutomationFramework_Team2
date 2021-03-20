package com.testWalmart;

import org.testng.annotations.DataProvider;

public class DataProviderForVerizon {
    @DataProvider
    public Object [][] searchData(){
        return new Object[][]{
                {"Mr_Mahmud","1234"},
                {"Saif", "1234"},
                {"James","1234"}
        };
    }

}
