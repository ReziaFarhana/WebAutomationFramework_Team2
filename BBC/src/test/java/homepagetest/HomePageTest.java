package homepagetest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import homepage.HomePage;

public class HomePageTest extends WebAPI {
    //Test class

    HomePage homePage;
    @BeforeMethod
    public void getInit(){
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
    @Test
    public void homePageTest(){
        homePage.searchBoxFunc();
        String expectedText="BBC - Search results for COVID-19";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Actual result doesn't match expected");
    }
}
