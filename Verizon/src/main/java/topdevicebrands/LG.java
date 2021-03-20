package topdevicebrands;

import common.WebAPI;

import static topdevicebrands.TopDeviceBrandsWebElements.*;


public class LG extends WebAPI {

    public void lGTab(){
        clickByLinkText(lG);
    }

    public void lGvalueAndPerformance() {
        lGTab();
        clickByXpath(lGVauleAndPerformanceLocator);
        clickByLinkText(buyNowButton);
    }

    public void addToCart(){
        lGvalueAndPerformance();
        clickByXpath(fullRetailOption);
        clickByXpath(continueButton);
        typeByXpath(zipCodeInputBox,zipCode);
        clickByXpath(confrimLocationButton);
        clickByXpath(newCustomerButton);
    }

    //do feedback , chat box, contact us, log in
    public void feedback(){
        lGvalueAndPerformance();
        clickByXpath(feedbackButton);
        //clickByXpath("//iframe[@title='Feedback Survey']");

    }
}
