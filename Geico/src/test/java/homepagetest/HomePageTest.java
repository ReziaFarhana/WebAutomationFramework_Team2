package homepagetest;

import common.WebAPI;
import homepage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static homepage.HomePageWebElement.*;

public class HomePageTest extends WebAPI {

    HomePage homepage;

    @BeforeMethod
    public void init(){ homepage= PageFactory.initElements(driver, HomePage.class); }

    @Test
    public void informationNavTest(){
        homepage.informationNav();
        String expectedText = "An Insurance Company For Your Car And More | GEICO";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text does not match");
    }
    @Test
    public void claimsAndRoadsideHelpNav() throws InterruptedException {
        homepage.claimsAndRoadsideHelpNav();
        String expectedText="Claims and Roadside Help";
        String actualText=getTextByXpath(claimsAndRoadsideXp);
        Assert.assertEquals(actualText, expectedText, "Text does not match");
    }

    @Test
    public void selectReportAClaimTest() throws InterruptedException {
        homepage.selectReportAClaim();
        String expectedText ="Report a Claim";
        String actualText =driver.getTitle();
        Assert.assertEquals(actualText,expectedText, "Text doesnt match");
    }

    @Test
    public void selectViewAClaimTest() throws InterruptedException {
        homepage.selectViewAClaim();
        String expectedText="To locate your claim, please provide the following information.";
        String actualText=getTextByXpath(viewAClaimPageTextXp);
        Assert.assertEquals(actualText,expectedText, "Text fail");

    }
    @Test
    public void selectgetRoadSideHelpTest() throws InterruptedException {
        homepage.selectgetRoadSideHelp();
        String expectedText="Report a Claim";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText, "Text fail");

    }
    @Test
    public void selectReportGlassDamageTest() throws InterruptedException {
        homepage.selectReportGlassDamage();
        String expectedText="Report a Claim";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText, "Text fail");

    }
    @Test
    public void selectCatastropheClaimsTest() throws InterruptedException {
        homepage.selectCatastropheClaims();
        String expectedText="GEICO Catastrophe Claims | GEICO";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText, "Text fail");

    }
    @Test
    public void selectEstimateandRepairTest() throws InterruptedException {
        homepage.selectEstimateandRepair();
        String expectedText="Find Estimate and Repair Locations Near You";
        String actualText=driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(actualText,expectedText, "Text fail");

    }
    @Test
    public void selectToolsAndResourcesTest() throws InterruptedException {
        homepage.selectToolsAndResources();
        String expectedText = "Tools and Resources";
        String actualText = getTextByXpath(toolsAndResXp);
        Assert.assertEquals(actualText, expectedText, "Text not matched");
    }
    @Test
    public void selectCoverageCalculatorTest() throws InterruptedException {
        homepage.selectCoverageCalculator();
        String expectedText = "Car Insurance Coverage Calculator";
        String actualText = getTextByXpath(coverageCalcPageTextXp);
        Assert.assertEquals(actualText, expectedText, "Text not matched");
    }
    @Test
    public void doCoverageCalcTest() throws InterruptedException {
        homepage.doCoverageCalc();
        String expectedText ="Car Insurance Estimator - Coverage Calculator | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Test failed");
    }
    @Test
    public void  selectMilitaryProgramTest() throws InterruptedException {
        homepage.selectMilitaryProgram();
        String expectedText="What would you like to protect?";
        String actualText=getTextByXpath(whatToProtectTitleText);
        Assert.assertEquals(actualText,expectedText, "Text doesnt match");
    }
    @Test
    public void selectFederalEmployees() throws InterruptedException {
        homepage.clickFederalEmployee();
        String expectedText="GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");
    }
    @Test
    public void clickRentersTest() throws InterruptedException {
        homepage.clickRenters();
        String expectedText="GEICO About You";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");
    }
    @Test
    public void selectInsuranceDiscountTest() throws InterruptedException {
        homepage.selectInsuranceDiscount();
        String expectedText="Learn More About Available Insurance Discounts | GEICO";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");
    }
    @Test
    public void selectCommercialAutoFaqTest() throws InterruptedException {
        homepage.selectCommercialAutoFaq();
        String expectedText="When do you need commercial vehicle insurance? | GEICO";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");
    }
    @Test
    public void selectCarBuyingResourcesTest() throws InterruptedException {
        homepage.selectCarBuyingResources();
        String expectedText="Car Buying Resources | GEICO";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");
    }
    @Test
    public void selectLocalGasPricesTest() throws InterruptedException {
        homepage.selectLocalGasPrices();
        String expectedText="Find Cheap Gas Prices & Stations Near You | GEICO";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");
    }

    @Test
    public void selectStateSpecificInfoTest() throws InterruptedException {
        homepage.selectStateSpecificInfo();
        String expectedText="Car Insurance Requirements And Laws By State | GEICO";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");
    }
    @Test
    public void selectSafetyInfoTest() throws InterruptedException {
        homepage.selectSafetyInfo();
        String expectedText="Safety Information | GEICO";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");
    }
    @Test
    public void selectLifeEventPlanningTest() throws InterruptedException {
        homepage.selectLifeEventPlanning();
        String expectedText="Life Stages | GEICO";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");
    }
    @Test
    public void selectParkingLocatorTest() throws InterruptedException {
        homepage.selectParkingLocator();
        String expectedText="Finding Parking Has Never Been So Easy | GEICO";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");
    }
    @Test
    public void selectInsuranceTermsTest() throws InterruptedException {
        homepage.selectInsuranceTerms();
        String expectedText="Glossary Of Insurance Terms And Definitions | GEICO";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");
    }
    @Test
    public void selectMakePaymentTest() throws InterruptedException {
        homepage.selectMakePayment();
        String expectedText="Make An Insurance Payment Online, By Phone & More | GEICO";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");
    }
    @Test
    public void selectGoPaperlessTest() throws InterruptedException {
        homepage.selectGoPaperless();
        String expectedText="Online Service Center | GEICO";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");
    }
    @Test
    public void selectGetIdCardsTest() throws InterruptedException {
        homepage.selectGetIdCards();
        String expectedText="Get ID Card";
        String actualText=getTextByXpath(getIDCardsPageTextXp);
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");
    }
    //completed 25 of 25
    }
