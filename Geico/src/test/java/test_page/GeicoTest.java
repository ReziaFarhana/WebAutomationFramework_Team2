package test_page;

import common.WebAPI;
import home_page.GeicoHome;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static home_page.GeicoWebElement.*;

public class GeicoTest extends WebAPI {

    GeicoHome action;  // Object of action class

    // Insurance(Business Insurance)
    @BeforeMethod
    public void intializeGeicoActionClass() {
        action = PageFactory.initElements(driver, GeicoHome.class);
    }

    @Test
    public void VerifyGeicoHomeIsLoaded() {
        boolean logoIsDisplayed = driver.findElement(By.cssSelector(geicoLogo)).isDisplayed();
        Assert.assertEquals(logoIsDisplayed, true);
    }

    @Test
    public void verifyBusinessOwner() throws InterruptedException {
        action.clickOnInsuranceLink();
//        assertEqualBycssLocator(textOfBusinessOwner,"Business Owners Insurance");
        String expected = "Business Owners Policy - Get a BOP Insurance Quote | GEICO";
        String actual = driver.getTitle();
    }

    @Test
    public void verifyGeneralLiabilityIns() throws InterruptedException {
        action.generalLiabilityIns();
        assertEqualByXpath(getQuateInfo, "This insurance covers your business operations, for things like:");
    }

    @Test
    public void verifyProfessionalLiabilityLink() throws InterruptedException {
        action.openProfessionalLiabilityLink();
        boolean isFound = driver.findElement(By.xpath(professionallLiabilitText)).isDisplayed();
        Assert.assertEquals(isFound, true);
    }

    @Test
    public void verifyWorkersConpensatinInsLink() throws InterruptedException {
        action.openworkersConpensatinInsLink();
        boolean isFound = driver.findElement(By.xpath(workersCompensationText)).isDisplayed();
        Assert.assertEquals(isFound, true);
    }

    @Test
    public void verifyCyberLiabilityInsLink() throws InterruptedException {
        action.opencyberLiabilityInsLink();
        boolean isFound = driver.findElement(By.xpath(cyberText)).isDisplayed();
        Assert.assertEquals(isFound, true);
    }

    @Test
    public void verifyGetQuoteGeneral() throws InterruptedException {
        action.openGetQuoteGeneral();
        assertEqualBycssLocator(generalLiabilityText, "General Liability Insurance");
    }

    @Test
    public void verifyStartYourQuoteNowInGeneralIns() throws InterruptedException {
        action.openStartYourQuoteNowInGeneralIns();
        sleepFor(2);
//        windoSwitchHandler(1);
        String expectedTitel = "GEICO and Hiscox";
        String actualTitel = driver.getTitle();
        Assert.assertEquals(actualTitel, expectedTitel, "Test failed ");

    }

    @Test
    @Ignore
    public void verifyGEICOAndHiscoxPage() throws InterruptedException {
        action.workingOnGEICOAndHiscoxPage();
        boolean found = driver.findElement(By.cssSelector(textVirginia)).isDisplayed();
        Assert.assertEquals(found, true, "Test failed");
        System.out.println(found);
    }

    @Test
    public void verifyAutoInsuranceInVehicle() throws InterruptedException {
        action.workOnVehicleInsuranceAuto();
        assertEqualByXpath(locatorForAutoInsuranceValidation, "Get the affordable car insurance coverage you deserve.");
    }

    @Test
    public void verifyQuoteWithZIP() throws InterruptedException {
        action.reviewQuoteWithZIP();
        assertEqualBycssLocator(locatorOfVerifyText, "What would you like to protect?");
    }

    @Test
    public void verifyOnNextLink() throws InterruptedException {
        action.clickOnNextLinkAfterZIPPageLoaded();
        assertEqualBycssLocator(locatorRequiredInfoPage, "Required Information:");
    }

    @Test
    public void verifyUpdateDateOfBirth() throws InterruptedException {
        action.updateDateOfBirth();
        assertEqualBycssLocator(locatorToVerifyAfterDOB, "We need your name.");

    }

    @Test
    public void verifyUpdateNameInformation() throws InterruptedException {
        action.updateNameInformation();
        Assert.assertEquals(isItemDisplayed(locatorToVerifyNameAdded), true, "Test failed");
    }

    @Test
    public void verifyMotorcycleInsuranceSelected() throws InterruptedException {
        action.workOnVehicleInsuranceMotorcycle();
        assertEqualBycssLocator(locatorToVerifyMotorcycleInsuranceSelection, "Motorcycle Insurance");

    }

    @Test
    public void verifyMotorInsurance() throws InterruptedException {
        action.reviewMotorInsuranceQuoteWithZIP();
        String expected = "Let's make getting a motorcycle quote even easier!";
        String actual = driver.findElement(By.id(locatorToVerifyText)).getText();
        Assert.assertEquals(actual, expected, " Test failed");
    }

    @Test
    public void verifyNoForAutoInsurance() throws InterruptedException {
        action.selectNoForAutoInsurance();
        assertEqualBycssLocator(locatorOfRequiredInformation, "Required Information:");
    }


    @Test
    public void verifyPropertyInsurance() throws InterruptedException {
        action.workOnPropertyInsuranceMenue();
        assertEqualBycssLocator(locatorOfHomeownerInsurance, "Homeowners Insurance");
    }

    @Test
    public void verifyHowToProtectMyHome() throws InterruptedException {
        action.clickOnHowToProtectMyHome();
        String expected = "The Ultimate Guide to Home Protection | GEICO Living";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Test failed");
    }

    @Test
    public void verifyOnHowMuchCoverage() throws InterruptedException {
        action.clickOnHowMuchCoverage();
        assertEqualBycssLocator(howMuchCoverageTextlocator, "Additional Coverage For A Home Insurance Policy");
    }

    @Test
    public void verifyContinueQuoteButton() throws InterruptedException {
        action.clickOnContinueQuoteButtonOfHomeInsurance();
        assertEqualBycssLocator(locatorContinueQuoteText, "Insurance Quote");
    }

    // @Test  page is changed no more available
    public void verifynsuraceQuoteInfo() throws InterruptedException {
        action.enterInsuraceQuoteInfo();
        assertEqualBycssLocator(locatorContinueQuoteText, "Manage Your Policies");
    }

    @Test
    public void verifyUmbrellaIsSelected() throws InterruptedException {
        action.workingOnAdditionalInsuranceOption();
        String expected = "Umbrella Insurance - Get an Umbrella Insurance Quote | GEICO";
        String actuel = driver.getTitle();
        Assert.assertEquals(actuel, expected, "Test failed");
    }

    @Test
    public void verifyLifeInsuranceIsSelected() throws InterruptedException {
        action.workingOnAdditionalInsuranceLife();
        String expected = "Life Insurance Quotes";
        String actual = driver.findElement(By.cssSelector(lifeInsuranceQuote)).getText();
        Assert.assertEquals(actual, expected, "Test failed");
    }

    @Test
    public void verifyTravelInsuranceIsSelected() throws InterruptedException {
        action.workingOnTravelInsuranceOption();
        String expected = "Travel Insurance";
        String actual = driver.findElement(By.cssSelector(travelInsuranceVerifyText)).getText();
        Assert.assertEquals(actual, expected, "Test failed");
    }

    @Test
    public void verifyPetInsuranceIsSelected() throws InterruptedException {
        action.selectingPetInsurance();
        String expected = "Pet Insurance";
        String actual = driver.findElement(By.cssSelector(verifyPetInsurance)).getText();
        Assert.assertEquals(actual, expected,"Test failed");
    }

     @Test
    public void verifyJewelryInsuranceIsSelected() throws InterruptedException {
        action.selectJewleryInsurance();
        String expected = "Jewelry Insurance";
        String actual = driver.findElement(By.cssSelector(verifyPetInsurance)).getText();
        Assert.assertEquals(actual, expected,"Test failed");
    }



}
