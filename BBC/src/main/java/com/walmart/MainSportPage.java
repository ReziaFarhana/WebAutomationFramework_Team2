package com.walmart;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MainSportPage extends WebAPI{

    @FindBy(xpath = "(//a[contains(text(),'Sport')])[1]")
    WebElement sportbtn;
    @FindBy(xpath = "//a[contains(text(),'Homepage')]")
    WebElement BBClogo;
    @FindBy(xpath = "//a[@class='sp-c-global-header__logo']")
    WebElement sportLogo;
    @FindBy(xpath = "//*[@id='sp-nav-all-sport-button']")
    WebElement allSportBtn;
    @FindBy(xpath = "//span[@class='sp-c-sport-flyout__heading']")
    WebElement moreFromSport;
    @FindBy(xpath = "(//a[@class='sp-c-sport-navigation__link qa-primary-item sp-nav-click-stat'])[1]")
    WebElement homeBtn;
    @FindBy(xpath = "(//a[@class='sp-c-sport-navigation__link qa-primary-item sp-nav-click-stat'])[2]")
    WebElement footballBtn;
    @FindBy(css = "#u45223736091649265 > div > div:nth-child(2) > div:nth-child(2) > div > div > div > div > div:nth-child(2) > a > div > div.gs-o-flag__img.gs-u-pr\\+\\@m > img")
    WebElement sportAppImage;
    @FindBy(xpath = "//*[contains(text(),'Find out more about our BBC Sport App')]")
    WebElement BBCSportAppLink;
    @FindBy(xpath = "//*[@id=\"orb-nav-links\"]/ul/li[3]/a")
    WebElement cancelBtn;
    @FindBy(xpath = "(//h2[contains(text(),'Football Scores')])[2]")
    WebElement footbalScore;
    @FindBy(xpath = "//h2[contains(text(),'Find us here')]")
    private WebElement findOnSocialMedia;
    @FindBy(xpath = "//a[contains(text(),'Full Sports A-Z')]")
    private WebElement fullSportsBtn;
    @FindBy(xpath = "//h1[contains(text(),'A-Z Sport')]")
    private WebElement AtoZ;
    @FindBy(xpath = "(//*[contains(text(),'Help & FAQs')])[2]")
    private WebElement FAQBtn;
    @FindBy(xpath = "//h2[contains(text(),'Explore the BBC')]")
    private WebElement exploreBBC;
    @FindBy(xpath = "//body/div[@id='orb-modules']/div[@id='u45223736091649265']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/*[1]")
    private WebElement twitter;
    @FindBy(css="#u972644193649938 > div > div:nth-child(2) > div:nth-child(2) > div > div > div > div > div.gel-layout__item.gel-1\\/2\\@m.gs-u-display-flex > a.sp-c-fuh-social.sp-c-fuh-social--facebook > svg > path")
    private WebElement facebook;
    @FindBy(xpath = "//body/div[@id='orb-modules']/div[@id='u45223736091649265']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[3]/*[1]")
    private WebElement instagram;
    @FindBy(xpath = "//body/div[@id='orb-modules']/div[@id='u45223736091649265']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[3]/*[1]")
    private WebElement youtube;

    public void verifyUrlOfSportPage(){
        sportbtn.click();
        String u=driver.getCurrentUrl();
        System.out.println(u);
        boolean b=u.contains("www.bbc.com/sport");
        Assert.assertTrue(b);
    }

    public void checkBBCLogo() {
        sportbtn.click();
        String s = BBClogo.getText();
        Assert.assertEquals(s, "Homepage", "Test Failed");
    }


    public void checkSportLogoIsDisplayed() {
        sportbtn.click();
        boolean b = sportLogo.isDisplayed();
        Assert.assertTrue(b, "Test Failed");
    }

    public void checkIfMoreFromSportIsDisplayed() {
        sportbtn.click();
        allSportBtn.click();
        String actual = moreFromSport.getText();
        Assert.assertEquals(actual, "More from Sport", "Test Failed");
    }

    public void checkHomeBtnIsClickable() {
        sportbtn.click();
        homeBtn.click();
    }

    public void checkFootballBtnIsClickable() {
        sportbtn.click();
        footballBtn.click();
    }

    public void verifyLogoForSportApp() {
        sportbtn.click();
        boolean b = sportAppImage.isDisplayed();
        Assert.assertTrue(b);

    }

    public void verifyBBCSportAppLinkIsClickable() {
        sportbtn.click();
        boolean b = BBCSportAppLink.isEnabled();
        Assert.assertTrue(b);
        BBCSportAppLink.click();
    }

    public void verifyTextAboutTheBBCSportApp() {
        sportbtn.click();
        String s = BBCSportAppLink.getText();
        boolean b = s.contains("Find out more about our BBC Sport App");
        Assert.assertTrue(b);

    }


    public void verifyFootballScoreBtnIsNonFunctional() {
        sportbtn.click();
        boolean b = footbalScore.isEnabled();
        Assert.assertTrue(b);
        String s = footbalScore.getAttribute("class");
        System.out.println(s);
    }

    public void verifyFindOnSocialMediaIsEnabled() {
        sportbtn.click();
        boolean b = findOnSocialMedia.isEnabled();
        Assert.assertTrue(b);

    }

    public void verifyFindOnSocialMediaIsDisplayed() {
        sportbtn.click();
        boolean b = findOnSocialMedia.isDisplayed();
        Assert.assertTrue(b);
    }

    public void VerifyFindOnSocialMediaAttribute() {
        sportbtn.click();
        String s = findOnSocialMedia.getAttribute("class");
        Assert.assertEquals(s.contains("header"), true);
    }

    public void checkFullSportAtoZIsEnabled() {
        sportbtn.click();
        allSportBtn.click();
        boolean b = fullSportsBtn.isEnabled();
        Assert.assertTrue(b);
    }

    public void checkAtoZisDisplayed() {
        sportbtn.click();
        allSportBtn.click();
        boolean b1 = fullSportsBtn.isDisplayed();
        String s = fullSportsBtn.getText();
        boolean b2 = s.contains("A-Z");
        Assert.assertTrue(b1);
        Assert.assertTrue(b2);

    }

    public void checkFAQisEnabled() {
        sportbtn.click();
        boolean b = allSportBtn.isEnabled();
        Assert.assertTrue(b);
    }

    public void veryfyExploreBBC() {
        sportbtn.click();
        String s = exploreBBC.getText();
        Assert.assertTrue(s.contains("Explore"));
    }

    public void checkIfCustomerIsAbleToCancelAdd(){
        sportbtn.click();
        cancelBtn.isEnabled();
        cancelBtn.click();
    }

    public void checkTwitterLogo(){
        sportbtn.click();
        twitter.isEnabled();
       boolean b= twitter.isDisplayed();
       Assert.assertEquals(b,"true");

    }

    public void checkFacebookLogoIsDisplayed(){
        sportbtn.click();
        boolean b1=facebook.isEnabled();
        boolean b2=facebook.isDisplayed();
        Assert.assertTrue(b1);
        Assert.assertTrue(b2);

    }

    public void verifyInstagramLogoIsDisplyed(){
        sportbtn.click();
        boolean b1=instagram.isEnabled();
        boolean b2=instagram.isDisplayed();
        Assert.assertTrue(b1);
        Assert.assertTrue(b2);

    }

    public void verifyYouTubeLogoIsDisplayed(){
        sportbtn.click();
        boolean b=youtube.isDisplayed();
        Assert.assertTrue(b);
    }
}