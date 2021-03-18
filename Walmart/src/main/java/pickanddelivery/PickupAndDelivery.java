package pickanddelivery;

import common.WebAPI;
import org.testng.annotations.Test;

import static pickanddelivery.PickupAndDeliveryWebElement.*;

public class PickupAndDelivery extends WebAPI {
@Test
    public void pickupAndDeliveryTab(){
        clickByXpath(pickupAndDeliveryTab);
        clickByXpath(popUp);
        //handling new tab
        //handleNewTab(driver);
    }
@Test
    public void quickIntro(){
        pickupAndDeliveryTab();
        windowHalfPageScroll();
        clickByClass(startShoppingBanner);
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
//doesnt work--> check all methods
    public void learnMoreLink() throws InterruptedException {
        quickIntro();
        //handleNewTab(driver);
        clickByXpath(learnMore);


    }




}
