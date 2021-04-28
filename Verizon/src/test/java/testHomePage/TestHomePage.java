package testHomePage;

import common.WebAPI;
import homePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends WebAPI {

    HomePage homePage;
    @BeforeMethod
    public void driverSetup() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(enabled = false)
    public void pagelinks(){
        homePage.findLinkElements();
    }

    @Test(enabled = true)
    public void validateDropDownList(){
        homePage.dropDownList();
    }
    @Test(enabled = false)
    public void validateLogo(){
        homePage.verizonLogo();
    }
    @Test(enabled = false)
    public void setValidateLogo(){
        homePage.setVerizonLogo();
    }



}
