package homepage;

import common.WebAPI;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

    public void weatherOptionnNavBar(){
        clickOnElement(moreOptionClass);
//        clickByXpath(cultureXp);
        clickByXpath(weatherxP);

    }
}
