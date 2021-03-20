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

    public void bbcInOtherLanguagesFooterTest(){
        homepage.bbcInOtherLanguagesFooter();
        String expectedText = "Chill";
        String actualText = getTextByXpath(chillPageTextXp);
        Assert.assertEquals(actualText, expectedText, "Text not matched");
    }

    public void workLifeNavTest() throws InterruptedException {
        homepage.workLifeNav();
        String expectedText="How we work - BBC Worklife";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "test failed");
    }

    public void searchBoxNavTest() throws InterruptedException {
        homepage.searchBoxNav();
        String expectedText="BBC - Search results for tornado";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Test failed");

    }

    public void whatisWorkLifeNavTest() throws InterruptedException {
        homepage.whatisWorkLifeNav();
        String expectedText="What is BBC Worklife?";
        String actualText= getTextByXpath(whatIsWorkLifeTextXp);
        Assert.assertEquals(actualText, expectedText, "Test failed");

    }

    public void howWeLiveNavTest() throws InterruptedException {
        homepage.howWeLiveNav();
        String expectedText="How We Live - BBC Worklife";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Test failed");

    }

    public void howWeWorkNavTest() throws InterruptedException {
        homepage.howWeWorkNav();
        String expectedText="How we work - BBC Worklife";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Test failed");

    }
    @Test
    public void howWeThinkNav() throws InterruptedException {
        homepage.howWeThinkNav();
        String expectedText="HOW WE THINK";
        String actualText= getTextByXpath(howWeThinkTextXp);
        Assert.assertEquals(actualText, expectedText, "Test failed");

    }


}
