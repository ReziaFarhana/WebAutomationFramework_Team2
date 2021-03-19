package homepagetest;

import common.WebAPI;
import homepage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static homepage.HomePageWebElements.*;

public class HomePageTest extends WebAPI {

    HomePage homepage;

    @BeforeMethod
    public void init(){
        homepage = PageFactory.initElements(driver,HomePage.class);
    }


    public void helpCenterOptionTest(){
        homepage.helpCenterOption();
        String expectedText = "Help - Walmart.com";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Test failed");
    }

    public void productRecallsTest() throws InterruptedException {
        homepage.productRecallsOption();
        String expectedText = "Walmart Careers | Submit a Walmart Job Application Online";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text did not match");
    }

    public void accessibilityOptionTest(){
        homepage.accessibilityOption();
        String expectedText = "Responsible Disclosure and Accessibility Policies - Walmart.com";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");
    }

    public void trampolineOptionTest(){
        homepage.trampolineOption();
        String expectedText = "Trampolines - Walmart.com";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text did not match");
    }

    public void trampolinePageGiftElibileCheckBoxTest(){
        homepage.trampolinePageGiftElibileCheckBox();
        String expectedText ="Gift eligible";
        WebElement actualText = driver.findElement(By.xpath(giftEligibleResXp));
        Assert.assertEquals(actualText, expectedText, "Text does not match");
    }

    public void contactUSOptionTest(){
        homepage.contactUsOption();
        String expectedText ="https://www.walmart.com/help";
        String actualText =getCurrentPageUrl();
        Assert.assertEquals(actualText, expectedText, "Text not passed");
    }

    public void walmartEBooksLogoTest(){
        homepage.walmartEBooksLogo();
        String expectedText ="Kobo has millions of eBooks. Sign up today and get a $5 acco";
        String actualText = getTextByClass(walmartEBookPagetitleClass);
        Assert.assertEquals(actualText, expectedText, "Text not match");
    }

    public void allswellLogoTest(){
        homepage.allsWellLogo();
        String expectedText="https://allswellhome.com/";
        String actualText = getCurrentUrl();
        Assert.assertEquals(actualText, expectedText, "Text not match");

    }

    public void feedBackButtonTest() throws InterruptedException {
        homepage.feedBackButton();
        String expectedText="Walmart.com | Save Money. Live Better.";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text does not match");
    }

    public void ps4OptionTest(){
        homepage.ps4Option();
        String expectedText="Sign in to your Walmart account";
        String actualText= getTextByXpath(loginInPageTextXp);
        Assert.assertEquals(actualText, expectedText,"Text doesnt match");
    }

    public void hamburgerMenuTest() throws InterruptedException {
        homepage.hamburgermenu();
        String expectedText ="Build beautiful baskets";
        String actualText=getTextByXpath(easterpageTextXp);
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");
    }

    public void navigateToDecorPageTest() throws InterruptedException {
        homepage.navigateToDecorPage();
        String expectedText="Easter Indoor Decor - Walmart.com";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");
    }

    public void storePickupOptionTest() throws InterruptedException {
        homepage.storePickupOption();
        String expectedText ="Download the app";
        String actualText=getTextByXpath(storePickupPageTitleXp);
        Assert.assertEquals(actualText, expectedText, "Text does not match");
    }

    public void skateboardOptionTest(){
        homepage.skateboardOption();
        String expectedText="Skateboards - Walmart.com";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");
    }
    @Test
    public void searchBoxTest(){
        homepage.searchBox();
        String expectedText="mac laptop - Walmart.com";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Test failed");
    }
    public void newsletterSignUp(){
        homepage.newsletterSignUp();
        String expectedText="Thank you for signing up!";
        String actualText=getTextById(signupThankYouPgTitleId);
        Assert.assertEquals(actualText,expectedText,"Test failed");
    }
    public void myItemsBtnTest(){
        homepage.myItemsBtn();
        String expectedText = "Login";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Test failed");

    }
    public void babyOptionTest() throws InterruptedException {
        homepage.babyOption();
        String expectedText = "Strollers - Walmart.com";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "test failed");

    }
    public void electronicsAndOfficeOption() throws InterruptedException {
        homepage.electronicsAndOfficeOption();
        String expectedText="Wearable Technology - Walmart.com - Walmart.com";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");
    }
    public void toyGamesVideoGamesTest() throws InterruptedException {
        homepage.toyGamesVideoGames();
        String expectedText="Outdoor Play - Walmart.com - Walmart.com";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"text doesnt match");
    }





}
