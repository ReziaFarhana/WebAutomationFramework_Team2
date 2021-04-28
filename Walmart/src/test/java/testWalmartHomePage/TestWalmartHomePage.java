package testWalmartHomePage;

import common.WebAPI;
import walmartHomePage.HomePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestWalmartHomePage extends WebAPI {
    HomePage homePage;
    @BeforeMethod
    private void pageFactorySetup(){
        homePage= PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    private void validateGetToText(){
        homePage.verifyGetToText();
    }

    @Test
    private void validateWalmartServicesIsEnabled(){
        homePage.verifyWalmartServicesIsEnabled();
    }

    @Test
    private void validateTextForWalmartServices(){
        homePage.verifyTextForWalmartServices();
    }

    @Test
    private void validateCustomerServiceIsEnabled(){
        homePage.verifyIfCustomerServiceIsEnabled();
    }

    @Test
    private void validateCustomerServiceText(){
        homePage.verifyCustomerServiceText();
    }

    @Test
    private void validateWalmartComIsEnable(){
        homePage.verifyWalmartComIsEnable();
    }

    @Test
    private void validateWalmartComText(){
        homePage.verifyWalmartComText();
    }

    @Test
    private void validateSpotLightBtn(){
        homePage.verifySpotLightBtn();
    }

    @Test
    private void validateSpotLightBtnText(){
        homePage.verifySpotLightBtnText();
    }

    @Test
    private void validateShopOurBrandIsDisplayedInFooter(){
        homePage.verifyShopOurBrandIsDisplayed();
    }

    @Test
    private void validateTermsOfUseLink(){
        homePage.verifyShopOurBrandIsDisplayed();
    }

    @Test
    private void validateWhereIsMyOrderIsDisplayed(){
        homePage.verifyShopOurBrandIsDisplayed();
    }

    @Test
    private void validateEditOrCancelOrderIsDisplayed(){
        homePage.verifyShopOurBrandIsDisplayed();
    }

    @Test
    private void validateReturnsAndRefundImageIsDisplayed(){
        homePage.verifyShopOurBrandIsDisplayed();
    }

}
