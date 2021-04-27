package newsPage;

import org.testng.annotations.DataProvider;

public class DataProviderNewsPage {

    @DataProvider (name = "credentials")
    public Object[] getsearchData(){
        return new Object[]{"news","weather","corona virus"};
    }


}
