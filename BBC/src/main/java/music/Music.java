package music;

import common.WebAPI;

import static music.MusicWebElement.*;

public class Music extends WebAPI {

    public void musicPage(){
    clickByXpath(dropDown);
    clickByXpath(musicTab);

    }

    public void openDropDown(){
        clickByXpath(dropDown);



    }





}
