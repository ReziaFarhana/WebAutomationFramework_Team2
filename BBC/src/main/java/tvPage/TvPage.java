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
    public void selectAfrica() throws InterruptedException {
        clickTvNav();
        sleepFor(3);
        scrollByXPATH(africaXp);
    }
    public void selectMiddleEast() throws InterruptedException {
        clickTvNav();
        sleepFor(3);
        scrollByXPATH(middleEastXp);
    }
    public void selectEurope() throws InterruptedException {
        clickTvNav();
        sleepFor(3);
        scrollByXPATH(europeXp);
    }
    public void selectLatinAmerica() throws InterruptedException {
        clickTvNav();
        sleepFor(3);
        scrollByXPATH(latinAmericaXp);
    }
    public void selectAsiaPacific() throws InterruptedException {
        clickTvNav();
        sleepFor(3);
        scrollByXPATH(asiaPacificXp);
    }
}
