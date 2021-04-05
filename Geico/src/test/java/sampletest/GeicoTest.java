package sampletest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sample.GeicoHome;

import java.io.IOException;

import static sample.GeicoWebElement.*;

public class GeicoTest extends WebAPI {

    GeicoHome geico;

    @BeforeMethod
    public void getInit() throws IOException {
        geico = PageFactory.initElements(driver, GeicoHome.class);
    }

    @Test(enabled = true)
    public void geicoInsuranceChecking() throws InterruptedException {
        geico.geicoInsuranceChecking();
        String expectedTitle = "An Insurance Company For Your Car And More | GEICO";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(enabled = true)
    public void geicoVehicleInsuranceCheckingTesting() throws InterruptedException {
        geico.geicoVehicleInsuranceChecking();
        String expectedText = "Types of Vehicle Insurance Policies | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title is matching");
    }

    @Test(enabled = true) //false
    public void geicoAutoVehicleCheckingTest() throws InterruptedException {
        geico.geicoAutoVehicleChecking();
        String expectedText = "Types of Vehicle Insurance Policies | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title is matching");
    }

    @Test(enabled = true)
    public void SelectPropertyInsuranceTesting() throws InterruptedException {
        geico.SelectPropertyInsurance();
        String expectedText = "Types Of Property Insurance For Your Home | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title is matching");
    }

    @Test(enabled = true)
    public void checkingBusinessInsuranceTesting() throws InterruptedException {
        geico.checkingBusinessInsurance();
        String expectedText = "Business Insurance Calculator | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title is matching");
    }

    @Test(enabled = true)
    public void additionalInsuranceSectionTesting() {
        geico.additionalInsuranceSection();
        String expectedTitle = "An Insurance Company For Your Car And More | GEICO";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(enabled = true)//false
    public void selectUmbrellaOptionTesting() throws InterruptedException {
        geico.selectUmbrellaOption();
        String expectedText = "Business Insurance Calculator | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title is matching");
    }

    @Test(enabled = true)
    public void informationSectionTesting() throws InterruptedException {
        geico.informationSection();
        String expectedTitle = "An Insurance Company For Your Car And More | GEICO";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(enabled = true)
    public void selectMyAccountTesting() {
        geico.selectMyAccount();
        String expectedText = "My Account | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title is matching");
    }

    @Test(enabled = true)
    public void ClaimsAndRoadsideHelpSectionTesting() throws InterruptedException {
        geico.ClaimsAndRoadsideHelpSection();
        String expectedText = "Claims and Roadside Help";
        String actualText = getTextByXpath(claimsAndRoadsideHelp);
        Assert.assertEquals(actualText, expectedText, "Title is matching");
    }

    @Test(enabled = true)
    public void selectToolsAndResourcesTesting() throws InterruptedException {
        geico.selectToolsAndResources();
        String expectedText = "Browse the GEICO Insurance Information Center | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title is matching");
    }

    @Test(enabled = true)
    public void aboutGEICOSectionTesting() throws InterruptedException {
        geico.aboutGEICOSection();
        String expectedText = "Claims and Roadside Help";
        String actualText = getTextByXpath(claimsAndRoadsideHelp);
        Assert.assertEquals(actualText, expectedText, "Title is matching");
    }

    @Test(enabled = true)
    public void selectWebAndMobileTesting() {
        geico.selectWebAndMobile();
        String expectedText = "Claims and Roadside Help";
        String actualText = getTextByXpath(claimsAndRoadsideHelp);
        Assert.assertEquals(actualText, expectedText, "Title is matching");
    }

    @Test(enabled = true)
    public void contactUsSectionTesting() {
        geico.contactUsSection();
        String expectedTitle = "How To Contact Us ~ Customer Service Information | GEICO";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(enabled = true)
    public void gEICOHomepageTesting() throws InterruptedException {
        geico.gEICOHomepage();
        String expectedTitle = "An Insurance Company For Your Car And More | GEICO";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(enabled = true)
    public void covid19UpdatesSectionTesting() throws InterruptedException {
        geico.covid19UpdatesSection();
        String expectedText = "COVID-19: GEICO is Here to Help | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title is matching");
    }

    @Test(enabled = true)
    public void startQuoteSectionTesting() throws InterruptedException {
        geico.startQuoteSection();
        String expectedText = "An Insurance Company For Your Car And More | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title is matching");
    }

    @Test(enabled = true)
    public void moreProductsSection() {
        geico.moreProductsSection();
        String expectedTitle = "An Insurance Company For Your Car And More | GEICO";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(enabled = true)
    public void requestRoadsideAssistanceTesting() throws InterruptedException {
        geico.requestRoadsideAssistance();
        String expectedTitle = "An Insurance Company For Your Car And More | GEICO";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(enabled = true)
    public void SelectReportGlassOnlyDamageTesting() throws InterruptedException {
        geico.SelectReportGlassOnlyDamage();
        String expectedText = "An Insurance Company For Your Car And More | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title is matching");
    }

    @Test(enabled = true)
    public void findAnAgentNearYouSectionTesting() throws InterruptedException {
        geico.findAnAgentNearYouSection();
        String expectedTitle = "Find a GEICO Insurance Agent | GEICO";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(enabled = true)
    public void continueYourSavedQuoteSectionTesting() throws InterruptedException {
        geico.continueYourSavedQuoteSection();
        String expectedText = "An Insurance Company For Your Car And More | GEICO";
        String actualText = driver.getTitle();//getTextByXpath(reportGlassOnlyDamage);
        Assert.assertEquals(actualText, expectedText, "Title is matching");
    }

    @Test(enabled = true)
    public void trackAClaimSectionTesting() throws InterruptedException {
        geico.trackAClaimSection();
        String expectedTitle = "An Insurance Company For Your Car And More | GEICO";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(enabled = true)
    public void selectClaimCenterTesting() throws InterruptedException {
        geico.selectClaimCenter();
        String expectedText = "An Insurance Company For Your Car And More | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title is matching");
    }
    @Test(enabled = true)
    public void reportAnIncidentSectionTesting() throws InterruptedException {
     geico.reportAnIncidentSection();
        String expectedText = " An Insurance Company For Your Car And More | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title is matching");
    }

    @Test(enabled = true)
    public void gEICOLivingSectionTesting(){
        geico.gEICOLivingSection();
        String expectedTitle = " GEICO";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }
    }
























