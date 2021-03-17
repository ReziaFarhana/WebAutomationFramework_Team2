package pickanddelivery;

import common.WebAPI;

import static pickanddelivery.PickupAndDeliveryWebElement.*;

public class PickupAndDelivery extends WebAPI {

    public void pickupAndDeliveryTab(){
        clickByXpath(pickupAndDeliveryTab);
        clickByXpath(popUp);
        //handling new tab
        handleNewTab(driver);
    }

    public void quickIntro(){
        pickupAndDeliveryTab();
        windowHalfPageScroll();
        clickByXpath(startShoppingBanner);
    }

    public void pickupFrom(){
        quickIntro();
        clickByXpath(pickupAddress);
        clearField1(zipCodeSearchBox);
        typeByXpathNEnter(zipCodeSearchBox,zipcode);
        clickByXpath(selectAddress);
        clickByXpath(continueButton);
        clickByXpath(changeButton);

    }

    public void learnMoreLink(){
        quickIntro();
        handleNewTab(driver);
        clickByXpath(learnMore);


    }




}
