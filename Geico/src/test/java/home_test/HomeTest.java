package home_test;

import common.WebAPI;
import home_page.GeicoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest extends WebAPI {
    GeicoHome gm;

    @BeforeMethod
    public void getInIt() {
        gm = PageFactory.initElements(driver, GeicoHome.class);
    }

    @Test
    public void ValidateZipCode() {
        gm.verifyEnterZipCode();
    }


    @Test//1
    public void validateAutoButton() throws InterruptedException {
        gm.verifyAutoButtonClickable();
    }

    @Test//2
    public void validateCheckButton() throws InterruptedException {
        gm.verifyCheckButton();
    }

    @Test//3
    public void validateStartQuote() {
        gm.verifyStartQuote();

    }

    @Test//4
    public void validateContactUsText() {
        gm.verifyContactUsText();

    }

    @Test//5
    public void validateSearchIconCheck() throws InterruptedException {
        gm.verifySearchIconCheck();
    }

    @Test//6
    public void validateISearchBoxCheck() throws InterruptedException {
        gm.verifySearchBoxCheck();
    }

    @Test//7
    public void validateSearchButtonCheck() {
        gm.verifySearchButtonCheck();
    }

    @Test//8

    public void verifyAutoSearchSite() throws InterruptedException {
        gm.verifyAutoSearchSite();
    }


    @Test//9

    public void validateClickSearchLogo() {
        gm.verifyClickSearchLogo();
    }

    @Test//10

    public void validateTypeOnSearchBox() {
        gm.verifyTypeOnSearchBox();
    }


    @Test//11

    public void validateSiteSearchText() {
        gm.verifySiteSearchText();
    }

    @Test//12

    public void validateClickLoginToEnterUSerNameAndPassword() {
        gm.verifyClickLoginToEnterUSerNameAndPassword();
    }

    @Test//13

    public void validateEnterUserNameAndPassword() {
        gm.verifyEnterUserNameAndPassword();
    }

    @Test//14

    public void validateEnterUserNameAndPasswordPerformed() {
        gm.verifyEnterUserNameAndPasswordPerformed("Farhana", "30294");
    }

    @Test//15

    public void validateSubmitLogin() {
        gm.verifySubmitLogin();
    }

    @Test//16

    public void validateTitle() {
        gm.verifyTitle();
    }

    @Test//17

    public void validateStartHere() {
        gm.verifyStartHere();
    }

    @Test//18

    public void validateClickContinue() {
        gm.verifyClickContinue();
    }

    @Test//19

    public void validateEnterPolicyNumberAndDateOfBirthAndZipCode() {
        gm.verifyEnterPolicyNumberAndDateOfBirthAndZipCode("10432", "December 1", "40369");
    }

    @Test//20

    public void validateErrorText() {
        gm.verifyErrorText();
    }

    @Test//21

    public void validatePolicyNumberErrorText() {
        gm.verifyPolicyNumberErrorText();
    }

    @Test//22

    public void validateClickCareerBtn() throws InterruptedException {
        gm.verifyClickCareerBtn();
    }

    @Test//23

    public void validateClickCustomerServiceBtn() throws InterruptedException {
        gm.verifyClickCustomerServiceBtn();
    }

    @Test//24

    public void validateText() throws InterruptedException {
        gm.verifyText();
    }

}
