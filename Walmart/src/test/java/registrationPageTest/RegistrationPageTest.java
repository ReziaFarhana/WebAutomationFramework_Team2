package registrationPageTest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import registration.RegistrationPageWithExcel;

import java.io.IOException;

import static registration.RegistrationPageWebElements.*;

public class RegistrationPageTest extends WebAPI {
    RegistrationPageWithExcel regpage;

    @BeforeMethod
    public void initialization() {
        regpage = PageFactory.initElements(driver, RegistrationPageWithExcel.class);
    }

//@Test(priority = 2)
    public void signInPageVerifyTest() throws InterruptedException {
        regpage.createAccountPage();
        String expectedText = "Sign in to your Walmart account";
        String actualText = getTextByXpath(signInPageText);
        Assert.assertEquals(actualText,expectedText,"Text did not match");
    }

    @Test(priority = 1)
    public void registrationTest() throws InterruptedException, IOException {
        regpage.registerWithExcel();
        String expectedText = "Login";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Text did not match");
    }
}
