package music;

import common.WebAPI;

import static music.MusicWebElement.*;

public class Music extends WebAPI {

    public void musicPage() {
        waitTimeExplicit(dropDown);
        clickByXpath(dropDown);
        waitTimeExplicit(musicTab);
        clickByXpath(musicTab);

    }

    public void openDropDown() {
        waitTimeExplicit(dropDown);
        clickByXpath(dropDown);


    }


}
