package tvPage;

import common.WebAPI;

import static tvPage.TvPageWebElement.*;

public class TvPage extends WebAPI {

    public void clickTvNav(){
        clickByClass(moreOptionClass);
        clickByXpath(tvOptionXp);
    }
    public void selectDate(){
        clickTvNav();
        clickByXpath(march21stXp);
        clickByXpath(women100NewsXp);
    }
    public void selectSouthAsia() throws InterruptedException {
        clickTvNav();
        sleepFor(3);
        scrollByXPATH(southAsiaXp);
    }
}
