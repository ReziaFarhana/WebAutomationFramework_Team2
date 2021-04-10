package support_home_test;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import support_home.SupportHome;

public class SupportHomeTest extends WebAPI {


    SupportHome sh;

    @BeforeMethod
    public void getInIt() {
        sh = PageFactory.initElements(driver, SupportHome.class);
    }


    @Test//1
    public void validateMouseHoverOnSupport() throws InterruptedException {
        sh.verifyShopLink();
    }

    @Test//2
    public void validateVerizonLogo() {
        sh.verifyVerizonLogo();
    }

    @Test//3
    public void validateVerizonEntertainment() {
        sh.verifyVerizonEntertainmentIsClickable();

    }

    @Test//4
    public void validateEntertainmentVideoPlaying() {
        sh.verifyBackGroundVideoIsRunning();
    }

    @Test//5
    public void validateTopDeviceWithVerizonGetText() {
        sh.verifyTopDeviceBrandText();
    }

    @Test//6
    public void validateTopAccessoriesDeviceWithVerizonGetText() {
        sh.verifyTopAccessoriesBrandText();
    }

    @Test//7
    public void validateAppleIsClickable() {
        sh.verifyAppleBrand();
    }

    @Test//8
    public void validateAppleiPhoneColorIsSelected() {
        sh.verifySelectColor();
    }

    public void verifyRegistration() {
        sh.Register();
        String expected = "Register";
        String actual = "clickByXpath(homeSignIn)";
        Assert.assertEquals(actual, expected, "test failed");

    }
}


