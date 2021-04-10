package testWalmartHomePage;


import common.WebAPI;
import homePage.WalmartHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testWalmart extends WebAPI {

WalmartHomePage walmartHomePage;


@BeforeMethod

public void runBeforeEachTest(){

    walmartHomePage= PageFactory.initElements(driver,WalmartHomePage.class);
}

@Test
private void validateElectronicsAndOfficeIsClickable(){

    walmartHomePage.verifyElectronicsAndOfficeIsClickable();
    }

@Test(enabled = true)
private void validateTvAndVideoIsEnabled(){

    walmartHomePage.verifyTvAndVideoIsEnabled();
}

@Test(enabled = true)

private void validateIpadAndTabletIsDisplayed(){

    walmartHomePage.verifyIpadAndTabletIsDisplayed();
    }

@Test(enabled = true)

private void validateComputersIsEnable(){

    walmartHomePage.verifyIsComputersEnable();
}

@Test(enabled = true)

    private void validatedLaptopsIsClickable(){

    walmartHomePage.verifyIsLaptopsClickable();
}

// ..
// @Ignore
    @Test (enabled = true)

    private void validatedVerifyGetToKnowIsEnable(){
    walmartHomePage.verifyGetToKnow();
    }


 //@Ignore
    @Test (enabled = true)
    private void validateGetToText(){
        walmartHomePage.verifyGetToText();
    }
//@Ignore
    @Test (enabled = true)
    private void validateWalmartServicesIsEnabled(){
        walmartHomePage.verifyWalmartServicesIsEnabled();
    }
//@Ignore
    @Test (enabled = true)
    private void validateTextForWalmartServices(){
        walmartHomePage.verifyTextForWalmartServices();
    }
//@Ignore
    @Test (enabled = true)
    private void validateCustomerServiceIsEnabled(){
        walmartHomePage.verifyIfCustomerServiceIsEnabled();
    }
//@Ignore
    @Test (enabled = true)
    private void validateCustomerServiceText(){
        walmartHomePage.verifyCustomerServiceText();
    }
//@Ignore
    @Test (enabled = true)
    private void validateWalmartComIsEnable(){
        walmartHomePage.verifyWalmartComIsEnable();
    }
//@Ignore
    @Test (enabled = true)
    private void validateWalmartComText(){
      walmartHomePage.verifyWalmartComText();
    }
//@Ignore
    @Test  (enabled = true)
    private void validateSpotLightBtn(){
       walmartHomePage.verifySpotLightBtn();
    }
//@Ignore
    @Test (enabled = true)
    private void validateSpotLightBtnText(){
      walmartHomePage.verifySpotLightBtnText();
    }
//@Ignore
    @Test (enabled = true)
    private void validateShopOurBrandIsDisplayedInFooter(){
        walmartHomePage.verifyShopOurBrandIsDisplayed();
    }
//@Ignore
    @Test (enabled = true)
    private void validateTermsOfUseLink(){
        walmartHomePage.verifyShopOurBrandIsDisplayed();
    }
//@Ignore
    @Test (enabled = true)
    private void validateWhereIsMyOrderIsDisplayed(){
       walmartHomePage.verifyShopOurBrandIsDisplayed();
    }
//@Ignore
    @Test (enabled = true)
    private void validateEditOrCancelOrderIsDisplayed(){
       walmartHomePage.verifyShopOurBrandIsDisplayed();
    }
//@Ignore
    @Test (enabled = true)
    private void validateReturnsAndRefundImageIsDisplayed(){
        walmartHomePage.verifyShopOurBrandIsDisplayed();
    }


}
