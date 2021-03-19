package autoinsurancetest;

import autoinsurance.AutoInsurance;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static autoinsurance.AutoInsuranceWebElements.*;

public class AutoInsuranceTest extends WebAPI {
AutoInsurance insurance;

    @BeforeMethod
    public void getinit(){
        insurance = PageFactory.initElements(driver,AutoInsurance.class);
    }

//    @Test//passed
//    public void autoInsuranceTabTest(){
//        insurance.autoInsuranceTab();
//        String expectedText = "What would you like to protect?";
//        String actualText = getTextByXpath(firstStepVerification);
//        Assert.assertEquals(actualText,expectedText,"Current text does not match");
//    }

    @Test//passed
    public void geicoQuoteRegistrationStepOneTest(){
        insurance.geicoQuoteRegistrationStepOne();
        String expectedText = "Have you moved in the last 2 months?";
        String actualText = getTextByXpath(secondStepVerification);
        Assert.assertEquals(actualText,expectedText,"Current text does not match");
    }

//    @Test//passed
//    public void autoInsuranceTabTest(){
//        insurance.autoInsuranceTab();
//        String expectedText = "What would you like to protect?";
//        String actualText = getTextByXpath(firstStep);
//        Assert.assertEquals(actualText,expectedText,"Current text does not match");
//    }

}
