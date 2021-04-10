package topdevicebrands;

import common.WebAPI;
import org.testng.annotations.DataProvider;

public class SearchBoxDataProvider extends WebAPI {

    @DataProvider(name = "SearchItems")
    public static Object[] searchBoxData(){
        return new Object[]{
                ("Samsung"),
                ("LG"),
                ("Motorola"),
                ("Apple"),
                ("Amazon"),
                ("Google")
        };
    }
}
