package com.testWalmart;

import com.walmart.MainSportPage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestMainSportPage extends WebAPI {
    MainSportPage mainSportPage;

    @Test(enabled = true)
    public void validateTheUrl(){
        mainSportPage = PageFactory.initElements(driver, MainSportPage.class);
        mainSportPage.verifyUrlOfSportPage();
    }

    @Test(enabled = true)
    public void validateBBCLogo() {
        mainSportPage = PageFactory.initElements(driver, MainSportPage.class);
        mainSportPage.checkBBCLogo();
    }

    @Test(enabled = true)
    public void validateSportLogoIsDisplayed() {
        mainSportPage = PageFactory.initElements(driver, MainSportPage.class);
        mainSportPage.checkSportLogoIsDisplayed();
    }

    @Test(enabled = true)
    public void validateMoreFromSportVisibility() {
        mainSportPage = PageFactory.initElements(driver, MainSportPage.class);
        mainSportPage.checkIfMoreFromSportIsDisplayed();
    }


    @Test(enabled = true)
    public void validateCustomerCanClickOnHomeBtn() {
        mainSportPage = PageFactory.initElements(driver, MainSportPage.class);
        mainSportPage.checkHomeBtnIsClickable();
    }

    @Test(enabled = true)
    public void validateFootballBtnIsClickable() {
        mainSportPage = PageFactory.initElements(driver, MainSportPage.class);
        mainSportPage.checkFootballBtnIsClickable();
    }

    @Test(enabled = false)
    public void validateSportAppLogoIsProperlyDisplayed() {
        mainSportPage = PageFactory.initElements(driver, MainSportPage.class);
        mainSportPage.verifyLogoForSportApp();
    }

    @Test(enabled = true)
    public void validateTextforBBCAppDownloading(){
        mainSportPage = PageFactory.initElements(driver, MainSportPage.class);
        mainSportPage.verifyTextAboutTheBBCSportApp();
    }

    @Test(enabled = true)
    public void vaidateBBCSportAppLinkFunctionality(){
        mainSportPage = PageFactory.initElements(driver, MainSportPage.class);
        mainSportPage.verifyBBCSportAppLinkIsClickable();
    }
    @Test(enabled = true)
    public void validateFootballScoreBtnWorkingAsExpected(){
        mainSportPage = PageFactory.initElements(driver, MainSportPage.class);
        mainSportPage.verifyFootballScoreBtnIsNonFunctional();
    }

    @Test(enabled = true)
    public void validateFindUsOnSociaMediaIsAdded(){
        mainSportPage = PageFactory.initElements(driver, MainSportPage.class);
        mainSportPage.verifyFindOnSocialMediaIsEnabled();
    }
    @Test(enabled = true)
    public void validateFindUsOnSociaMediaIsDisplayed(){
        mainSportPage = PageFactory.initElements(driver, MainSportPage.class);
        mainSportPage.verifyFindOnSocialMediaIsDisplayed();
    }
    @Test(enabled = true)
    public void validateFindOnSociaMediaAttributeAreMathced(){
        mainSportPage = PageFactory.initElements(driver, MainSportPage.class);
        mainSportPage.VerifyFindOnSocialMediaAttribute();
    }
    @Test(enabled = true)
    public void validateAtoZBtnIsEnabled(){
        mainSportPage = PageFactory.initElements(driver, MainSportPage.class);
        mainSportPage.checkFullSportAtoZIsEnabled();
    }
    @Test(enabled = true)
    public void validateAtoZisDisplayedUnderFullSportsAtoZ(){
        mainSportPage = PageFactory.initElements(driver, MainSportPage.class);
        mainSportPage.checkAtoZisDisplayed();
    }
    @Test(enabled = true)
    public void validateFAQBtnIsEnabled(){
        mainSportPage = PageFactory.initElements(driver, MainSportPage.class);
        mainSportPage.checkFAQisEnabled();
    }

    @Test(enabled = true)
    public void validateExploreBBCIsDisplayedAndGetTextIsMatched(){
        mainSportPage = PageFactory.initElements(driver, MainSportPage.class);
        mainSportPage.veryfyExploreBBC();
    }

    @Test(enabled = true)
    public void validateCustomerIsAbleToCancelAdd(){
        mainSportPage = PageFactory.initElements(driver, MainSportPage.class);
        mainSportPage.checkIfCustomerIsAbleToCancelAdd();
    }

    @Test(enabled =false)
    public void validateTwitterIsDisplayed(){
        mainSportPage = PageFactory.initElements(driver, MainSportPage.class);
        mainSportPage.checkTwitterLogo();
    }

    @Test(enabled = true)
    public void validateFacebookIsDisplayed(){
        mainSportPage = PageFactory.initElements(driver, MainSportPage.class);
        mainSportPage.checkFacebookLogoIsDisplayed();
    }
    @Test(enabled = false)
    public void validateYouTubeIsDisplayed(){
        mainSportPage = PageFactory.initElements(driver, MainSportPage.class);
        mainSportPage.verifyYouTubeLogoIsDisplayed();
    }

    @Test(enabled = false)
    public void validateInstagramIsDisplayed(){
        mainSportPage = PageFactory.initElements(driver, MainSportPage.class);
        mainSportPage.verifyInstagramLogoIsDisplyed();
    }
}

