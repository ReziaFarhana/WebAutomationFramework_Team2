package testHomePage;

import common.WebAPI;
import homePage.GeicoHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.ExtentTestManager;

public class TestGeicoHomePage extends WebAPI {

    GeicoHomePage geicoHomePage;

    @BeforeMethod
    public void driverSetup() {
        geicoHomePage = PageFactory.initElements(driver, GeicoHomePage.class);
    }

    @Test(enabled = false)
    public void validateDropDownInsurance(){
        geicoHomePage.validateInsueranceLink();
    }

    @Test(enabled = false)
    public void validateHomePage(){
        geicoHomePage.validateHomePage();
        ExtentTestManager.log("Home Page landed properly");
    }

    @Test(enabled = false)
    public void searchWithZip() throws InterruptedException{
        geicoHomePage.searchWithZip();
    }

    @Test(enabled = false)
    public void validateWindowScrollDownJS(){
        geicoHomePage.scrollDownJS();
    }

    @Test(enabled = false)
    public void validateScrollDownToElement(){
        geicoHomePage.scrolldownToElement();
        ExtentTestManager.log("Payment Page landed Properly");
    }

    @Test(enabled = false)
    public void validateFormFillUp(){
        validateScrollDownToElement();
        geicoHomePage.formFillUp();
    }

    @Test(enabled = false)
    public void validateCheckBox(){
        geicoHomePage.checkBox();
    }


    @Test(enabled = false)
    public void validateSearchFieldFunctionality(){
        geicoHomePage.searchFieldFunctionality();
    }

    @Test
    public void validateLoginDropDown(){
        geicoHomePage.loginDropDown();
    }







    @AfterMethod
    public void driverClose(){
        driver.quit();
    }






}
