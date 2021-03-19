package homepagetest;

import common.WebAPI;
import homepage.HomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static homepage.HomePageWebElement.*;

public class HomePageTest extends WebAPI {

    HomePage homepage;

    @BeforeMethod
    public void init(){ homepage= PageFactory.initElements(driver, HomePage.class); }

    @Test
    public void weatherOptionnNavBarTest() throws InterruptedException {
        homepage.weatherOptionnNavBar();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000);");
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        sleepFor(5);
        String expectedText="More Weather";
        String actualText=getTextByXpath(weatherPageLogoTitleXp);
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");
    }
}
