package testSignInPage;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider
    public Object [][] searchData(){
        return new Object[][]{
                {"Arafat", "1234"},
                {"Alex","1234"}
        };
    }
}
