package test_page;


import common.WebAPI;
import home_page.BBCHome;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static home_page.BBCWebElement.*;

public class BBCTest extends WebAPI {

    BBCHome home;

    //Initialize BBC action home page to run tests
    @BeforeMethod
    public void getInIt(){
        home = PageFactory.initElements(driver,BBCHome.class);
    }

    /**
     * This test is to verify we have navigated to the BBC home page
     */
    @Test
    public void verifyWeLandedOnBBCHomePage(){
        String expectedTitle = "BBC - Homepage";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "BBC Home page is missing - Test failed");
    }
    @Test
    public void verifyCulturePageIsDisplayed() throws InterruptedException {
        home.clickOnCultureOption();
        boolean displayed = driver.findElement(By.cssSelector(cultureText)).isDisplayed();
        Assert.assertEquals(true,displayed, "Test failed - Culture page is not found");
    }

    @Test
    public void verifyAFilmLinkIsOpened() throws InterruptedException {
        home.useFilmLinkInCultureHomePage();
        assertEqualByXpath(findTextOfFilm,"FILM");
    }

    @Test
    public void verifyFilmBrokeSeveralTaboosIsOpened() throws InterruptedException {
        home.openFilmBrokeSeveralTaboos();
        assertEqualBycssLocator(brokenSeveralTaboosFilmText,"Harold and Maude: The film that broke several taboos");
    }

    public void verifyPageLoadedMoreElements() throws InterruptedException {
        home.reloadMoreButton();

    }

    @Test
    public void verifyArtLinkIsPerformed() throws InterruptedException {
        home.clickOnArtLink();
        assertEqualByXpath(artLinkText,"ART");
    }

    @Test
    public void verifyToOpenDetailMasterpiece() throws InterruptedException {
        home.openDetailMasterpiece();
        String expected = "The School of Athens: A detail hidden in a masterpiece";
        String actual = driver.findElement(By.cssSelector(textOfdetailMasterpiece)).getText();
        Assert.assertEquals(actual, expected, "Test failed ");
    }

    @Test
    public void verifyWhatDoYourDreamMeans() throws InterruptedException {
        home.openWhatDoOurDreamsMeansLink();
        sleepFor(2);
        String expected = "What do our dreams mean? - BBC Culture";
        String actual  = driver.getTitle();
        Assert.assertEquals(actual,expected,"Test failed");
    }

    @Test
    public void verifyLookingForBooks() throws InterruptedException {
        home.usingBooksLinkInCulturePage();
        String expected = "Books - BBC Culture";
        String actual = driver.getTitle();
        Assert.assertEquals(actual,expected, "Test failed ");
    }

    @Test
    public void verifyClickOnLiteratureLink() throws InterruptedException {
        home.clickOnLiteratureLink();
        String expected = "Literature - BBC Culture";
        String actual = driver.getTitle();
        Assert.assertEquals(actual,expected, "Test failed ");
    }

    @Test
    public void verifyOpenMoreTab() throws InterruptedException {
        home.openMoreTabOption();
        String expected = "Music - BBC Culture";
        String actual = driver.getTitle();
        Assert.assertEquals(actual,expected, "Test failed ");
    }

    @Test
    public void verifyMusicTab() throws InterruptedException {
        home.openMusicTab();
        String expected = "Music - BBC Culture";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Test failed ");
    }


    @Test
    public void verifyTVTab() throws InterruptedException {
        home.openTVTab();
        String expected = "Television - BBC Culture";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Test failed ");
    }

    @Test
    public void verifyPhotographyTab() throws InterruptedException {
        home.openPhotohraphyTab();
        String expected = "Photography - BBC Culture";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Test failed ");
    }

    @Test
    public void verifyStyleTab() throws InterruptedException {
        home.openStyleTab();
        String expected = "Style - BBC Culture";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Test failed ");
    }

    @Test
    public void verifyIdentitiesTab() throws InterruptedException {
        home.openIdentitiesTab();
        String expected = "Identities - BBC Culture";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Test failed ");
    }

    @Test
    public void verifyCollectionTab() throws InterruptedException {
        home.openCollectionTab();
        String expected = "The Collection - BBC Culture";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Test failed ");
    }

    @Test
    public void verifyCollectionPageWithText() throws InterruptedException {
        home.openCollectionTab();
        assertEqualByXpath(collectionDisplayed, "The Collection");
    }

    @Test
    public void verifyWhatYouDidnotKnowAboutColour() throws InterruptedException {
        home.openWhatYouDidnotKnowAboutColour();
        String expected = "What you didn’t know about colour - BBC Culture";
        String actual = driver.getTitle();
        Assert.assertEquals(actual,expected, "Test failed ");
    }

    @Test @Ignore
    public void verifylookingForDisnePageFound() throws InterruptedException {
        home.lookingForDisnePage();
        String expected = "Design - BBC Culture";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Test failed ");
    }






}
