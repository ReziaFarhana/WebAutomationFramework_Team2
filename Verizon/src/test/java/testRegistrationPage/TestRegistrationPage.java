package testRegistrationPage;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import registraionPage.RegistrationPage;

public class TestRegistrationPage extends WebAPI {

    RegistrationPage registrationPage;

    @BeforeMethod
    public void driverSetup() {
        registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
    }


    @Test(enabled = false)
    public void ValidateRegistrationPage(){
        registrationPage.registrationPageValidate();
    }

    @Test
    public void validateCreateAccountPage(){
        registrationPage.createAccountPage();
    }

}
