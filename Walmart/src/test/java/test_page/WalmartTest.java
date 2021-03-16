package test_page;

import common.WebAPI;
import home_page.WalmartHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static home_page.WalmartWebElement.*;

public class WalmartTest extends WebAPI {

    WalmartHome home;

    @BeforeMethod
    public void getInIt(){
        home = PageFactory.initElements(driver,WalmartHome.class);
    }

        // this method is to verify I am on walmart home page
    @Test()
    public void verifyWalmartHomePage(){
        String expected = "https://www.walmart.com/";
        String actual = getCurrentPageUrl();
        Assert.assertEquals(actual,expected,"Result failed to match expected outcome ");
    }

    @Test
    public void verifyWalmartPlusIsClicked(){
        home.clickOnWalmartPlusLink();
        assertEqualBycssLocator(walmartPlusText,"Meet Walmart+");
    }
    @Test
    public void verifyAllBenefitsIsSelected(){
        home.workingOnBenefitsSelection();
        assertEqualByXpath(allBenefitsText,"Explore all benefits");
    }
}
