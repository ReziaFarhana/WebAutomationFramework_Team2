package news_world;


//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;


import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static news_world.NewsWorldWebElement.*;

public class NewsWorld extends WebAPI {


    @FindBy(xpath = bbcNews) WebElement bbcNewsLink;
    @FindBy(xpath = bbcExplore) WebElement bbcExploreText;
    @FindBy(css = bbcSocial) WebElement bbcSocialText;
    @FindBy(xpath = twitter) WebElement twitterLogo;
    @FindBy(xpath = facebook) WebElement facebookLogo;
    @FindBy(xpath = newsWorld) WebElement newsWorldLink;
    @FindBy(xpath = newsWorldAsia) WebElement newsWorldAsiaLink;
    @FindBy(xpath = facebookBBC) WebElement faceBookBBCPage;
    @FindBy(xpath = instagram) WebElement instagramLogo;
    @FindBy(css = contactBBC) WebElement contactBBCLink;
    @FindBy(xpath = bBCPrograms) WebElement bBCProgramLink;
    @FindBy(css = sportImg) WebElement sportImage;
    @FindBy(xpath = findAProgram) WebElement findAProgramWebsite;
    @FindBy(linkText = programsAToZ) WebElement programsAtoZBtn;
//    @FindBy(xpath = newsAsiaChina) WebElement newsAsiaChinaIsClickable;
//    @FindBy(xpath = newsChinaEconomy) WebElement newsChinaEconomyIsClickable;
//    @FindBy(xpath = ChinaEconomyNews) WebElement ChinaEconomyNewsIsDisplayed;
    @FindBy (xpath = "//a[normalize-space()='More']") WebElement more;
    @FindBy (xpath = "//li[@class='orb-nav-music orb-first-visible']//a[normalize-space()='Music']")
    WebElement music;
    @FindBy (xpath = "//h2[contains(text(),'The ’90s master of the remix')]") WebElement remix;

    public void verifyBBCExploreText() {
        bbcNewsLink.click();
        String s = bbcExploreText.getText();//isDisplayed, getAttribute, isEnabled
        boolean b = s.contains("Explore the BBC");
        // Assert.assertEquals(b,true,"Test failed");
        Assert.assertTrue(b);
    }
    //Method to verify Current URL-2

    public void verifyCurrentUrl() {
        bbcNewsLink.click();
        String s = driver.getCurrentUrl();
        // boolean b=s.contains("bbc.com/news");
        // Assert.assertTrue(b);
        Assert.assertEquals(s, "https://www.bbc.com/news", "Test Failed");
    }

    // helper method to scroll down-3

    public void scrollDown() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,4000);");
    }

    //Method to verify Social Title-4
    public void verifyBBCSocialTitle() {
        bbcNewsLink.click();
        scrollDown();
        String s = bbcSocialText.getText();//isDisplayed, getAttribute, isEnabled
        boolean b = s.contains("Find us here");
        Assert.assertEquals(b, true, "Test failed");

    }

    //Method to verify Twitter logo-5
    public void verifyTwitterLogo() {
        bbcNewsLink.click();
        scrollDown();
        boolean b = twitterLogo.isDisplayed();
        Assert.assertEquals(b, true, "Test failed");
    }

    //Method to verify FaceBook Logo-6
    public void verifyFacebookLogo() {
        bbcNewsLink.click();
        newsWorldLink.click();
        scrollDown();
        boolean b = facebookLogo.isDisplayed();
        Assert.assertEquals(b, true, "Test failed");
    }

    //Method to verify AsiaNewsInstagram bt take me to Facebook BBC-7
    public void verifyInstagramLogo() {
        bbcNewsLink.click();
        scrollDown();
        boolean b1 = instagramLogo.isEnabled();
        boolean b2 = instagramLogo.isDisplayed();
        Assert.assertTrue(b1);
        Assert.assertTrue(b2);
    }


    //Method to verify Contact the BBC-8
    public void verifyContactBBC() {
        bbcNewsLink.click();
        scrollDown();
        contactBBCLink.click();

    }

    //Method to verify BBC Programs-9
    public void verifyBBCPrograms() {
        bbcNewsLink.click();
        scrollDown();
        contactBBCLink.click();
        bBCProgramLink.click();
    }

    //Method to verify BBC sportImage
    public void verifySportImageIsNonFunctional() {
        boolean b = sportImage.isDisplayed();
        Assert.assertTrue(b);
    }

    //Method to verify BBC Programs
    public void verifyFindAProgram() {
        bbcNewsLink.click();
        scrollDown();
        contactBBCLink.click();
        findAProgramWebsite.click();
    }
    public void checkAtoZisDisplayed() {
        bbcNewsLink.click();
        scrollDown();
        contactBBCLink.click();
        findAProgramWebsite.click();
        programsAtoZBtn.click();
        boolean b1 = programsAtoZBtn.isDisplayed();
        String s = programsAtoZBtn.getText();
        boolean b2 = s.contains("A-Z");
        Assert.assertTrue(b1);
        Assert.assertTrue(b2);
    }
      public void moreOption (){
        more.click();
    }

    public void textRemix (){
        more.click();
        music.click();
        String b= remix.getText();
        Assert.assertEquals(b,"The ’90s master of the remix","Test failed");
    }
}

















