package sampletest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import sample.GeicoHomePage;

import static sample.GeicoWebElement.claimsAndRoadsideHelp;

public class GeicoHomePageTest extends WebAPI {

    GeicoHomePage geico;

    @BeforeMethod
    public void getInit() {
        geico = PageFactory.initElements(driver, GeicoHomePage.class);

    }

    @Test(priority = 1)
    @Ignore
    public void testGeicoTitle() throws InterruptedException {
        geico.Geicozipcode();
        String exR = "What would you like to protect?";
        String acR = geico.autoinsurancegettext.getText();
        Assert.assertEquals(exR, acR, "text  is not available");
    }


    @Test(priority = 2)
    @Ignore
    public void testWebandMobile() throws InterruptedException {
        String exR = "INFORMATION";
        String acR = geico.information1.getText();
        Assert.assertEquals(exR, acR, "tab is not available");
    }

    @Test(priority = 3)
    @Ignore
    public void testinfoTabMobileapp() throws InterruptedException {
        geico.infoTabMobileapp();
        String exR = "Web and Mobile";
        String acR = geico.webandMobileTitle1.getText();
        Assert.assertEquals(exR, acR, "tab is not available");

    }

    @Test(priority = 4)
    @Ignore
    public void testMobileApp() throws InterruptedException {
        geico.mobileApp();
        String exR = "Wherever you go we'll be there checking your blind spot.";
        String acR = geico.MobileAppText1.getText();
        Assert.assertEquals(exR, acR, "tab is not available");


    }

    @Test(priority = 5)
    @Ignore
    public void testExpressServices() throws InterruptedException {
        geico.ExpressServices();
        String exR = "Express Services";
        String acR = geico.expressServicesText1.getText();
        Assert.assertEquals(exR, acR, "  text does not match ");
    }


    @Test(priority = 6)
    @Ignore
    public void testAmazonAlexa() throws InterruptedException {
        geico.amazonAlexa();
        String exR = "The GEICO Skill for Amazon Alexa";
        String acR = geico.amazonAlexaText1.getText();
        Assert.assertEquals(exR, acR, " text does not match");
    }


    @Test(priority = 7)
    @Ignore
    public void testgeicoLiving() throws InterruptedException {
        geico.geicoLiving();
        String exR = "FEATURED ARTICLES";
        String acR = geico.geicoLivingtext1.getText();
        Assert.assertEquals(exR, acR, " text does not match");
    }

    @Test(priority = 8)
    @Ignore
    public void testSocialMedia() throws InterruptedException {
        geico.SocialMedia();
        String exR = "Connect With GEICO on Social Media";
        String acR = geico.socialMediaText1.getText();
        Assert.assertEquals(exR, acR, " text does not match");
    }

    @Test(priority = 9)
    @Ignore
    public void testGeicoFacebook() throws InterruptedException {
        geico.geicoFacebook();
        String exR = "There's even more to like about GEICO on Facebook. See how you could save on car insurance and more.";
        String acR = geico.geicoFacebookText1.getText();
        Assert.assertEquals(exR, acR, " text does not match");
    }


    @Test(priority = 10)
    public void testGeicoTweeter() throws InterruptedException {
        geico.geicoContactUs();
        String exR = "How To Contact Us ~ Customer Service Information | GEICO";
        String acR = driver.getTitle();
        Assert.assertEquals(exR, acR, " text does not match");

    }


    @Test(priority = 11)
    public void geicoInsuranceChecking() throws InterruptedException {
        geico.geicoInsuranceChecking();
        String expectedTitle = "An Insurance Company For Your Car And More | GEICO";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(priority = 11)
    public void geicoVehicleInsuranceCheckingTesting() throws InterruptedException {
        geico.geicoVehicleInsuranceChecking();
        String expectedText = "Types of Vehicle Insurance Policies | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title is matching");
    }

    @Test(priority = 11)
    public void geicoAutoVehicleCheckingTest() throws InterruptedException {
        geico.geicoAutoVehicleChecking();
        String expectedText = "Types of Vehicle Insurance Policies | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title is matching");
    }

    @Test(priority = 11)
    public void SelectPropertyInsuranceTesting() throws InterruptedException {
        geico.SelectPropertyInsurance();
        String expectedText = "Types Of Property Insurance For Your Home | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title is matching");
    }

    @Test(priority = 12)
    public void checkingBusinessInsuranceTesting() throws InterruptedException {
        geico.checkingBusinessInsurance();
        String expectedText = "Business Insurance Calculator | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title is matching");
    }

    @Test(priority = 13)
    public void additionalInsuranceSectionTesting() {
        geico.additionalInsuranceSection();
        String expectedTitle = "An Insurance Company For Your Car And More | GEICO";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(priority = 14)
    public void selectUmbrellaOptionTesting() throws InterruptedException {
        geico.selectUmbrellaOption();
        String expectedText = "Business Insurance Calculator | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title is matching");
    }

    @Test(priority = 15)
    public void informationSectionTesting() throws InterruptedException {
        geico.informationSection();
        String expectedTitle = "An Insurance Company For Your Car And More | GEICO";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(priority = 16)
    public void selectMyAccountTesting() {
        geico.selectMyAccount();
        String expectedText = "My Account | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title is matching");
    }

    @Test(priority = 17)
    public void ClaimsAndRoadsideHelpSectionTesting() throws InterruptedException {
        geico.ClaimsAndRoadsideHelpSection();
        String expectedText = "Claims and Roadside Help";
        String actualText = getTextByXpath(claimsAndRoadsideHelp);
        Assert.assertEquals(actualText, expectedText, "Title is matching");
    }

    @Test(priority = 18)
    public void selectToolsAndResourcesTesting() throws InterruptedException {
        geico.selectToolsAndResources();
        String expectedText = "Browse the GEICO Insurance Information Center | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title is matching");
    }

    @Test(priority = 19)
    public void aboutGEICOSectionTesting() throws InterruptedException {
        geico.aboutGEICOSection();
        String expectedText = "Claims and Roadside Help";
        String actualText = getTextByXpath(claimsAndRoadsideHelp);
        Assert.assertEquals(actualText, expectedText, "Title is matching");
    }

    @Test(priority = 20)
    public void selectWebAndMobileTesting() {
        geico.selectWebAndMobile();
        String expectedText = "Claims and Roadside Help";
        String actualText = getTextByXpath(claimsAndRoadsideHelp);
        Assert.assertEquals(actualText, expectedText, "Title is matching");
    }

    @Test(priority = 21)
    public void contactUsSectionTesting() {
        geico.contactUsSection();
        String expectedTitle = "How To Contact Us ~ Customer Service Information | GEICO";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(priority = 22)
    public void gEICOHomepageTesting() throws InterruptedException {
        geico.gEICOHomepage();
        String expectedTitle = "An Insurance Company For Your Car And More | GEICO";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(priority = 23)
    public void covid19UpdatesSectionTesting() throws InterruptedException {
        geico.covid19UpdatesSection();
        String expectedText = "COVID-19: GEICO is Here to Help | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title is matching");
    }

    @Test(priority = 24)
    public void startQuoteSectionTesting() throws InterruptedException {
        geico.startQuoteSection();
        String expectedText = "An Insurance Company For Your Car And More | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title is matching");
    }

    @Test(priority = 25)
    public void moreProductsSection() {
        geico.moreProductsSection();
        String expectedTitle = "An Insurance Company For Your Car And More | GEICO";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(priority = 26)
    public void requestRoadsideAssistanceTesting() throws InterruptedException {
        geico.requestRoadsideAssistance();
        String expectedTitle = "An Insurance Company For Your Car And More | GEICO";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(priority = 27)
    public void SelectReportGlassOnlyDamageTesting() throws InterruptedException {
        geico.SelectReportGlassOnlyDamage();
        String expectedText = "An Insurance Company For Your Car And More | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title is matching");
    }

    @Test(priority = 28)
    public void findAnAgentNearYouSectionTesting() throws InterruptedException {
        geico.findAnAgentNearYouSection();
        String expectedTitle = "Find a GEICO Insurance Agent | GEICO";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(priority = 29)
    public void continueYourSavedQuoteSectionTesting() throws InterruptedException {
        geico.continueYourSavedQuoteSection();
        String expectedText = "An Insurance Company For Your Car And More | GEICO";
        String actualText = driver.getTitle();//getTextByXpath(reportGlassOnlyDamage);
        Assert.assertEquals(actualText, expectedText, "Title is matching");
    }

    @Test(priority = 30)
    public void trackAClaimSectionTesting() throws InterruptedException {
        geico.trackAClaimSection();
        String expectedTitle = "An Insurance Company For Your Car And More | GEICO";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(priority = 31)
    public void selectClaimCenterTesting() throws InterruptedException {
        geico.selectClaimCenter();
        String expectedText = "An Insurance Company For Your Car And More | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title is matching");
    }
    @Test(priority = 32)
    public void reportAnIncidentSectionTesting() throws InterruptedException {
        geico.reportAnIncidentSection();
        String expectedText = " An Insurance Company For Your Car And More | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title is matching");
    }

    @Test(priority = 33)
    public void gEICOLivingSectionTesting(){
        geico.gEICOLivingSection();
        String expectedTitle = " GEICO";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }


}
