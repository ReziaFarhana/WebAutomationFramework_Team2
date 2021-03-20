package home_page.MoreMenuTab;

import common.WebAPI;

import static home_page.MoreMenuTab.MenuBarMoreWEbElement.*;

public class MenuBarMore extends WebAPI {

    /**
     * Method to open More Menu Bar option from BBC home page
     */
    public void clikOnMoreMenuTab(){
        clickByXpath(menuTabMore);
    }

    public void openWeatherLink() throws InterruptedException {
        clikOnMoreMenuTab();
        clickByCss(weatherLink);
        sleepFor(2);
    }

    public void weatherSearchByCity(){
        clikOnMoreMenuTab();
//        typeOnElementNEnter(weatherSearchByCity,"Washington DC, United States");
        typeByCss(weatherSearchByCity,"Washington DC, United States");

    }

}
