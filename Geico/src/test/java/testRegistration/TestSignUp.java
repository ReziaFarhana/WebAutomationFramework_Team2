package testRegistration;

import common.WebAPI;
import homePage.GeicoHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import registration.SignUp;
import reporting.ExtentTestManager;

public class TestSignUp extends WebAPI {

    SignUp signUp;

    @BeforeMethod
    public void driverSetup() {
        signUp = PageFactory.initElements(driver, SignUp.class);
    }



    @Test(enabled = false)
    public void signUpPageValidation(){
        signUp.signUpPageValidation();
        ExtentTestManager.log("Page link validated");
    }

    @Test
    public void validateRegistration(){
        signUp.validateRegistration();
    }















    @AfterMethod
    public void driverClose(){
        driver.quit();
    }

}
