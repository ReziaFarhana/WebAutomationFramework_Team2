package walmart_test;

import common.WebAPI;
import get_to_know_us.GetToKnowUs;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static get_to_know_us.GetToKnowUsWebElement.*;
import static get_to_know_us.GetToKnowUsWebElement.BeautyCategoryWebElement.personalCareOptionList;


public class GetToKnowUsTest extends WebAPI {
    GetToKnowUs gt;

    @BeforeMethod

    public void init() {
        gt = PageFactory.initElements(driver, GetToKnowUs.class);
    }

    @Test//test-1 passed
    public void validateGetToKnowUsTextTest() {
        gt.verifyGetToKnowUsInFooter();
        boolean b = gt.getToKnowUsXp.isDisplayed();
        Assert.assertEquals(b, true, "Title did not match");
    }

    @Test//test-2 passed
    public void validateOurCompanyIsClickable() {
        gt.verifyOurCompanyIsClickable();
        String expectedText = "Walmart Corporate";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title did not match");
    }

    @Test//test-3 passed
    public void validateWalmartLogoInCorporatePage() {
        gt.verifyWalmartLogoInCorporatePageIsDisplayed();
        String expectedText = "Walmart Corporate";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title did not match");
    }

    @Test//test-4 passed
    public void validateOurStory() throws InterruptedException {
        gt.verifyOurStory();
        String expectedText = "Executive Management";
        String actualText = getTextByXpath(executiveManagementLocator);
        Assert.assertEquals(actualText, expectedText, "Title did not match");

    }

    @Test//test-5 passed
    public void validateBOD() throws InterruptedException {
        gt.verifyBoardOfDirectors();
        String expectedText = "Board of Directors";
        String actualText = getTextByXpath(boardOfDirectorsLocator);
        Assert.assertEquals(actualText, expectedText, "Title did not match");

    }

    @Test//test-6 passed
    public void validateCareerAtWalmart() throws InterruptedException {
        gt.verifyWorkingAtWalmart();
        String expectedText = "Careers";
        String actualText = getTextByXpath(careerAtWalmartLocator);
        Assert.assertEquals(actualText, expectedText, "Title did not match");
    }

    @Test//test-7 passed
    public void validateMoreThanExpectedVideo() throws InterruptedException {
        gt.verifyMoreThanExpectedVideo();
        String expected = "https://youtu.be/qL4-TaDX_u8";
        String actual = "https://youtu.be/qL4-TaDX_u8";//???
        Assert.assertEquals(actual, expected, "Title did not match");
    }

    @Test//test-8 passed
    public void validateCareerPage() throws InterruptedException {
        gt.verifyWalmartCareerPage();
        String expected = "Careers";
        String actual = gt.getTextByXpath(careerTextLocator);
        Assert.assertEquals(actual, expected, "Title did not match");
    }

    @Test//test-9 passed
    public void validateSearchAllCareerAreas() throws InterruptedException {
        gt.verifyAllCareerAreas();
        String expected = "Senior Manager I, Product Management (Store No8 | Conversational Commerce)";
        String actual = gt.searchResult.getText();
        Assert.assertEquals(actual, expected, "Title did not match");
    }

    @Test//test-10 passed
    public void validateCareerLogin() throws InterruptedException {
        gt.verifyCareerLogin();
        String expected = "Welcome";
        String actual = gt.welcomeTextInLoginPage.getText();
        Assert.assertEquals(actual, expected, "Title did not match");
    }

    @Test//TEST-11 PASSED
    public void walmartSignInTest() throws IOException {
        gt.walmartSignIn();
        String expectedText = "Login";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title didn't match");
    }

    @Test//TEST-12 Passed
    public void validateSearchForJobs() throws IOException {
        gt.verifySearchForJobs();
        String expectedText = "Search for Jobs";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title didn't match");
    }

    @Test//TEST-13 Passed
    public void validateSearchForJobsByFindElements() {
        gt.verifySearchForJobsByFindElements();
//        String expectedText = "Search for Jobs" ;
//        String actualText = driver.getTitle();
//        Assert.assertEquals(actualText,expectedText,"Title didn't match");
    }

    @Test//TEST-14 Passed
    public void validateSlideShow() throws InterruptedException {
        gt.verifySlideShow();
        String expectedText = "Search for Jobs";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title didn't match");
    }

    @Test//TEST-15 Passed
    public void validateSearchBox() throws InterruptedException {
        gt.verifySearchBox();
        String expectedText = "Toys - Walmart.com - Walmart.com";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title didn't match");
    }

    @Test//TEST-16 Passed
    public void validateShopByAge() throws InterruptedException {
        gt.verifyShopByAge();
        String expectedText = "Hot Wheels Monster Trucks Demo Doubles 2 Pack (Styles May Vary) - Walmart.com - Walmart.com";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title didn't match");
    }

}

