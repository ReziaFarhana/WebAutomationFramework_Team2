package testSignInPage;

import signInPage.SignInPage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSignInPage extends WebAPI{

    SignInPage signInPage;
    @BeforeMethod
    private void pageFactorySetup(){
        signInPage= PageFactory.initElements(driver, SignInPage.class);
    }

    @Test
    private void validateUserAndPasswordField(){
        signInPage.verifyUserAndPasswordField();
    }

    @Test(dataProviderClass = DataProviders.class,dataProvider = "searchData")
    private void validateUserAndPasswordFieldUsingDataprovider(String name, String password) throws InterruptedException {
        signInPage.verifyUserAndPasswordFieldUsingDataProvider(name,password);
    }

    @Test
    private void validateSignInBtnIsDisabledWhenUserAndPasswordFieldEmpty(){
        signInPage.verifySignInBtnIsDisabledWhenUserAndPasswordFieldEmpty();
    }

    @Test
    private void validateForgotBtnIsEnabled(){
        signInPage.verifyForgotBtnIsEnabled();
    }

    @Test
    private void validateRememberMeBtnIsCheckAble(){
        signInPage.verifyRememberMeBtnIsCheckAble();
    }

    @Test
    private void validateRegistrationBtnIsEnabled(){
        signInPage.verifyRegistrationBtn();
    }

    @Test
    private void validateDropDownIsShownWhenMouseHoverOnSignIn() throws InterruptedException {
        signInPage.verifyDropDownIsShownWhenMouseHoverOnSignIn();
    }

    @Test
    private void validateElementCanBeSelectedFromDropDown() throws InterruptedException {
        signInPage.verifyprepaidInstantPayCanBeClickedFromDropDown();
    }

    @Test
    private void validateWishListCanBeClickedFromDropDown() throws InterruptedException {
        signInPage.verifyWishListCanBeClickedFromDropDown();
    }

    @Test
    private void validateBusinessSignInBtnIsEnabled(){
        signInPage.verifyBusinessSignInBtnIsEnabled();
    }

    @Test
    private void validateBusinessSignInTextIsMatched(){
        signInPage.verifyBusinessSignInPageText();
    }

}
