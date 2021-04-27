package testHomePage;

import common.WebAPI;
import homePage.HomePage;
import homePage.HomePageWebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends WebAPI {
    HomePage homepage;

    @BeforeMethod
    public void driverSetup() {
        homepage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(enabled = false)
    public void weatherOptionNavBarTest() throws InterruptedException {
        homepage.weatherOptionnNavBar();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000);");
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        sleepFor(5);

    }

    @Test(enabled = false)
    public void musicOptionNavBarTest() throws InterruptedException {
        homepage.musicOptionNavBar();
        String expectedText = "culturePageTitle";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");

    }

    @Test(enabled = false)
    public void identitiesOptionCultureNavTest() throws InterruptedException {
        homepage.identitiesOptionCultureNav();
        String expectedText = "The gender-fluid look that fans love";
        String actualText = getTextByCss(HomePageWebElement.gettyPgTitle);
        Assert.assertEquals(expectedText, actualText, "Text does not match");
    }

    @Test(enabled = false)
    public void newsNavBar() throws InterruptedException {
        homepage.newsNavBar();
        String expectedText = "Science & Environment - BBC News";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");
    }

    @Test(enabled = false)
    public void bbcInOtherLanguagesFooterTest() {
        homepage.bbcInOtherLanguagesFooter();
        String expectedText = "Chill";
        String actualText = getTextByXpath(HomePageWebElement.chillPageTextXp);
        Assert.assertEquals(actualText, expectedText, "Text not matched");
    }

    @Test(enabled = false)
    public void workLifeNavTest() throws InterruptedException {
        homepage.workLifeNav();
        String expectedText = "How we work - BBC Worklife";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "test failed");
    }

    @Test(enabled = false)
    public void searchBoxNavTest() throws InterruptedException {
        homepage.searchBoxNav();
        String expectedText = "BBC - Search results for tornado";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Test failed");

    }

    @Test(enabled = false)
    public void whatisWorkLifeNavTest() throws InterruptedException {
        homepage.whatisWorkLifeNav();
        String expectedText = "What is BBC Worklife?";
        String actualText = getTextByXpath(HomePageWebElement.whatIsWorkLifeTextXp);
        Assert.assertEquals(actualText, expectedText, "Test failed");

    }

    @Test(enabled = false)
    public void howWeLiveNavTest() throws InterruptedException {
        homepage.howWeLiveNav();
        String expectedText = "How We Live - BBC Worklife";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Test failed");

    }

    @Test(enabled = false)
    public void howWeWorkNavTest() throws InterruptedException {
        homepage.howWeWorkNav();
        String expectedText = "How we work - BBC Worklife";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Test failed");

    }

    @Test(enabled = false)
    public void howWeThinkNav() throws InterruptedException {
        homepage.howWeThinkNav();
        String expectedText = "HOW WE THINK";
        String actualText = getTextByXpath(HomePageWebElement.howWeThinkTextXp);
        Assert.assertEquals(actualText, expectedText, "Test failed");

    }

    @Test(enabled = false)
    public void equalityMattersNavTest() throws InterruptedException {
        homepage.equalityMattersNav();
        String expectedText = "Equality Matters - BBC Worklife";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Test failed");

    }

    @Test(enabled = false)
    public void remoteControlNavTest() throws InterruptedException {
        homepage.remoteControlNav();
        String expectedText = "Remote Control";
        String actualText = getTextByXpath(HomePageWebElement.remoteControlTextXp);
        Assert.assertEquals(actualText, expectedText, "Test failed");

    }

    @Test(enabled = false)
    public void clickMoreandCloseTest() throws InterruptedException {
        homepage.clickMoreandClose();
        String expectedText = "Home - BBC Worklife";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Test failed");

    }

    @Test(enabled = false)
    public void futureNavTest() throws InterruptedException {
        homepage.futureNav();
        String expectedText = "Home - BBC Future";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Test failed");

    }

    @Test(enabled = false)
    public void wheresBBCFutureTest() throws InterruptedException {
        homepage.wheresBBCFutureNav();
        String expectedText = "Home - BBC Future";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Test failed");
    }

    @AfterMethod
    public void driverClose(){
        driver.quit();
    }


}
