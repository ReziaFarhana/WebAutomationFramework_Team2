package topdevicebrands;

import common.WebAPI;

import static topdevicebrands.TopDeviceBrandsWebElements.*;

public class Amazon extends WebAPI {

    public void amazonLocator(){
        clickByLinkText(amazonLocator);
        clickByXpath(nextButton);
    }

    public void checkAvailability(){
       windowHalfPageScroll();
       clickByXpath(checkAvailabilityButton);
       //finish code

    }



}
