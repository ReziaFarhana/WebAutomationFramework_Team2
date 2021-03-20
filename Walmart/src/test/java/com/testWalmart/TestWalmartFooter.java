package com.testWalmart;


import com.walmart.FooterWalmart;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestWalmartFooter extends WebAPI {

    FooterWalmart footerWalmart;
    @BeforeMethod
    private void pageFactorySetup(){
        footerWalmart= PageFactory.initElements(driver, FooterWalmart.class);
    }

    @Test
    private void validateGetToText(){
        footerWalmart.verifyGetToText();
    }

    @Test
    private void validateWalmartServicesIsEnabled(){
        footerWalmart.verifyWalmartServicesIsEnabled();
    }

    @Test
    private void validateTextForWalmartServices(){
        footerWalmart.verifyTextForWalmartServices();
    }

    @Test
    private void validateCustomerServiceIsEnabled(){
        footerWalmart.verifyIfCustomerServiceIsEnabled();
    }

    @Test
    private void validateCustomerServiceText(){
        footerWalmart.verifyCustomerServiceText();
    }

    @Test
    private void validateWalmartComIsEnable(){
        footerWalmart.verifyWalmartComIsEnable();
    }

    @Test
    private void validateWalmartComText(){
        footerWalmart.verifyWalmartComText();
    }

    @Test
    private void validateSpotLightBtn(){
        footerWalmart.verifySpotLightBtn();
    }

    @Test
    private void validateSpotLightBtnText(){
        footerWalmart.verifySpotLightBtnText();
    }

    @Test
    private void validateShopOurBrandIsDisplayedInFooter(){
        footerWalmart.verifyShopOurBrandIsDisplayed();
    }

    @Test
    private void validateTermsOfUseLink(){
        footerWalmart.verifyShopOurBrandIsDisplayed();
    }

    @Test
    private void validateWhereIsMyOrderIsDisplayed(){
        footerWalmart.verifyShopOurBrandIsDisplayed();
    }

    @Test
    private void validateEditOrCancelOrderIsDisplayed(){
        footerWalmart.verifyShopOurBrandIsDisplayed();
    }

    @Test
    private void validateReturnsAndRefundImageIsDisplayed(){
        footerWalmart.verifyShopOurBrandIsDisplayed();
    }


}
