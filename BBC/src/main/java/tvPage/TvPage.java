package tvPage;

import common.WebAPI;

import static tvPage.TvPageWebElement.*;

public class TvPage extends WebAPI {

    public void clickTvNav(){
        clickByClass(moreOptionClass);
        clickByXpath(tvOptionXp);
    }
}
