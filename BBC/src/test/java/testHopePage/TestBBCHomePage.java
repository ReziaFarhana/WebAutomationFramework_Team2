package testHopePage;
import bbcHomePage.BBCHomePage;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestBBCHomePage extends WebAPI{

    BBCHomePage mainSportPage;

    @Test(enabled = true)
    public void validateTheUrl(){
        mainSportPage = PageFactory.initElements(driver, BBCHomePage.class);
        mainSportPage.verifyUrlOfSportPage();
    }

    @Test(enabled = true)
    public void validateBBCLogo() {
        mainSportPage = PageFactory.initElements(driver, BBCHomePage.class);
        mainSportPage.checkBBCLogo();
    }

    @Test(enabled = true)
    public void validateSportLogoIsDisplayed() {
        mainSportPage = PageFactory.initElements(driver, BBCHomePage.class);
        mainSportPage.checkSportLogoIsDisplayed();
    }

    @Test(enabled = true)
    public void validateMoreFromSportVisibility() {
        mainSportPage = PageFactory.initElements(driver, BBCHomePage.class);
        mainSportPage.checkIfMoreFromSportIsDisplayed();
    }


    @Test(enabled = true)
    public void validateCustomerCanClickOnHomeBtn() {
        mainSportPage = PageFactory.initElements(driver, BBCHomePage.class);
        mainSportPage.checkHomeBtnIsClickable();
    }

    @Test(enabled = true)
    public void validateFootballBtnIsClickable() {
        mainSportPage = PageFactory.initElements(driver, BBCHomePage.class);
        mainSportPage.checkFootballBtnIsClickable();
    }

    @Test(enabled = false)
    public void validateSportAppLogoIsProperlyDisplayed() {
        mainSportPage = PageFactory.initElements(driver, BBCHomePage.class);
        mainSportPage.verifyLogoForSportApp();
    }

    @Test(enabled = true)
    public void validateTextforBBCAppDownloading(){
        mainSportPage = PageFactory.initElements(driver, BBCHomePage.class);
        mainSportPage.verifyTextAboutTheBBCSportApp();
    }

    @Test(enabled = true)
    public void vaidateBBCSportAppLinkFunctionality(){
        mainSportPage = PageFactory.initElements(driver, BBCHomePage.class);
        mainSportPage.verifyBBCSportAppLinkIsClickable();
    }
    @Test(enabled = true)
    public void validateFootballScoreBtnWorkingAsExpected(){
        mainSportPage = PageFactory.initElements(driver, BBCHomePage.class);
        mainSportPage.verifyFootballScoreBtnIsNonFunctional();
    }

    @Test(enabled = true)
    public void validateFindUsOnSociaMediaIsAdded(){
        mainSportPage = PageFactory.initElements(driver, BBCHomePage.class);
        mainSportPage.verifyFindOnSocialMediaIsEnabled();
    }
    @Test(enabled = true)
    public void validateFindUsOnSociaMediaIsDisplayed(){
        mainSportPage = PageFactory.initElements(driver, BBCHomePage.class);
        mainSportPage.verifyFindOnSocialMediaIsDisplayed();
    }
    @Test(enabled = true)
    public void validateFindOnSociaMediaAttributeAreMathced(){
        mainSportPage = PageFactory.initElements(driver, BBCHomePage.class);
        mainSportPage.VerifyFindOnSocialMediaAttribute();
    }
    @Test(enabled = true)
    public void validateAtoZBtnIsEnabled(){
        mainSportPage = PageFactory.initElements(driver, BBCHomePage.class);
        mainSportPage.checkFullSportAtoZIsEnabled();
    }
    @Test(enabled = true)
    public void validateAtoZisDisplayedUnderFullSportsAtoZ(){
        mainSportPage = PageFactory.initElements(driver, BBCHomePage.class);
        mainSportPage.checkAtoZisDisplayed();
    }
    @Test(enabled = true)
    public void validateFAQBtnIsEnabled(){
        mainSportPage = PageFactory.initElements(driver, BBCHomePage.class);
        mainSportPage.checkFAQisEnabled();
    }

    @Test(enabled = true)
    public void validateExploreBBCIsDisplayedAndGetTextIsMatched(){
        mainSportPage = PageFactory.initElements(driver, BBCHomePage.class);
        mainSportPage.verifyExploreBBC();
    }

    @Test(enabled = true)
    public void validateCustomerIsAbleToCancelAdd(){
        mainSportPage = PageFactory.initElements(driver, BBCHomePage.class);
        mainSportPage.checkIfCustomerIsAbleToCancelAdd();
    }

    @Test(enabled =false)
    public void validateTwitterIsDisplayed(){
        mainSportPage = PageFactory.initElements(driver, BBCHomePage.class);
        mainSportPage.checkTwitterLogo();
    }

    @Test(enabled = true)
    public void validateFacebookIsDisplayed(){
        mainSportPage = PageFactory.initElements(driver, BBCHomePage.class);
        mainSportPage.checkFacebookLogoIsDisplayed();
    }
    @Test(enabled = false)
    public void validateYouTubeIsDisplayed(){
        mainSportPage = PageFactory.initElements(driver, BBCHomePage.class);
        mainSportPage.verifyYouTubeLogoIsDisplayed();
    }

    @Test(enabled = false)
    public void validateInstagramIsDisplayed(){
        mainSportPage = PageFactory.initElements(driver, BBCHomePage.class);
        mainSportPage.verifyInstagramLogoIsDisplyed();
    }
}
