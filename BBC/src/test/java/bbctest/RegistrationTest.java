package bbctest;

import bbc.Registration;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static bbc.bbcWebelements.*;

public class RegistrationTest extends WebAPI {
    Registration registration;

    @BeforeMethod
    public void initialization() {
        registration = PageFactory.initElements(driver, Registration.class);
    }

    @Test //read and write excel
    public void registerNowTest() throws InterruptedException {
        registration.firstStepOfRegistration();
        String expectedText = "Register with the BBC";
        String actualText = getTextByXpath(registrationText);
        Assert.assertEquals(actualText,expectedText,"Text did not match");
    }
}
