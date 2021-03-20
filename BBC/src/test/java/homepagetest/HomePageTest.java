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


    public void weatherOptionNavBarTest() throws InterruptedException {
        homepage.weatherOptionnNavBar();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000);");
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        sleepFor(5);
        String expectedText="More Weather";
        String actualText=getTextByXpath(weatherPageLogoTitleXp);
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");
    }

    public void musicOptionNavBarTest() throws InterruptedException {
        homepage.musicOptionNavBar();
        String expectedText=culturePageTitle;
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText, expectedText,"Text doesnt match");

    }

    public void identitiesOptionCultureNavTest() throws InterruptedException {
        homepage.identitiesOptionCultureNav();
        String expectedText="The gender-fluid look that fans love";
        String actualText= getTextByCss(gettyPgTitleCss);
        Assert.assertEquals(expectedText, actualText, "Text does not match");
    }

    public void newsNavBar() throws InterruptedException {
        homepage.newsNavBar();
        String expectedText ="Science & Environment - BBC News";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");
    }
    @Test
    public void bbcInOtherLanguagesFooterTest(){
        homepage.bbcInOtherLanguagesFooter();
        String expectedText = "Chill";
        String actualText = getTextByXpath(chillPageTextXp);
        Assert.assertEquals(actualText, expectedText, "Text not matched");
    }

}
