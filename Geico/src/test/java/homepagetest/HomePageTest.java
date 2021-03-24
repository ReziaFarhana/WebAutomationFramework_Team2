package homepagetest;

import common.WebAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static homepage.HomePageWebElement.*;

public class HomePageTest extends WebAPI {

    HomePage homepage;

    @BeforeMethod
    public void init(){ homepage= PageFactory.initElements(driver, HomePage.class); }


    public void informationNavTest(){
        homepage.informationNav();
        String expectedText = "An Insurance Company For Your Car And More | GEICO";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text does not match");
    }
    @Test
    public void claimsAndRoadsideHelpNav() throws InterruptedException {
        homepage.claimsAndRoadsideHelpNav();
        String expectedText="Claims and Roadside Help";
        String actualText=getTextByXpath(claimsAndRoadsideXp);
        Assert.assertEquals(actualText, expectedText, "Text does not match");
    }


    public void selectGetRoadsideHelpTest() throws InterruptedException {
        homepage.selectGetRoadSideHelp();
        String expectedText ="Report a Claim";
        String actualText =driver.getTitle();
        Assert.assertEquals(actualText,expectedText, "Text doesnt match");
    }

}
