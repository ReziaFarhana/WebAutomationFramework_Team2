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


    public void informationNavTest(){
        homepage.informationNav();
        String expectedText = "An Insurance Company For Your Car And More | GEICO";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text does not match");
    }

    public void claimsAndRoadsideHelpNav() throws InterruptedException {
        homepage.claimsAndRoadsideHelpNav();
        String expectedText="Claims and Roadside Help";
        String actualText=getTextByXpath(claimsAndRoadsideXp);
        Assert.assertEquals(actualText, expectedText, "Text does not match");
    }


    public void selectReportAClaimTest() throws InterruptedException {
        homepage.selectReportAClaim();
        String expectedText ="Report a Claim";
        String actualText =driver.getTitle();
        Assert.assertEquals(actualText,expectedText, "Text doesnt match");
    }


    public void selectViewAClaimTest() throws InterruptedException {
        homepage.selectViewAClaim();
        String expectedText="To locate your claim, please provide the following information.";
        String actualText=getTextByXpath(viewAClaimPageTextXp);
        Assert.assertEquals(actualText,expectedText, "Text fail");

    }

    public void selectgetRoadSideHelpTest() throws InterruptedException {
        homepage.selectgetRoadSideHelp();
        String expectedText="Report a Claim";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText, "Text fail");

    }

    public void selectReportGlassDamageTest() throws InterruptedException {
        homepage.selectReportGlassDamage();
        String expectedText="Report a Claim";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText, "Text fail");

    }

    public void selectCatastropheClaimsTest() throws InterruptedException {
        homepage.selectCatastropheClaims();
        String expectedText="GEICO Catastrophe Claims | GEICO";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText, "Text fail");

    }

    public void selectEstimateandRepairTest() throws InterruptedException {
        homepage.selectEstimateandRepair();
        String expectedText="Find Estimate and Repair Locations Near You";
        String actualText=driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(actualText,expectedText, "Text fail");

    }

    public void selectToolsAndResourcesTest() throws InterruptedException {
        homepage.selectToolsAndResources();
        String expectedText = "Tools and Resources";
        String actualText = getTextByXpath(toolsAndResXp);
        Assert.assertEquals(actualText, expectedText, "Text not matched");
    }

    public void selectCoverageCalculatorTest() throws InterruptedException {
        homepage.selectCoverageCalculator();
        String expectedText = "Car Insurance Coverage Calculator";
        String actualText = getTextByXpath(coverageCalcPageTextXp);
        Assert.assertEquals(actualText, expectedText, "Text not matched");
    }

    public void doCoverageCalcTest() throws InterruptedException {
        homepage.doCoverageCalc();
        String expectedText ="Car Insurance Estimator - Coverage Calculator | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Test failed");
    }

    public void  selectMilitaryProgramTest() throws InterruptedException {
        homepage.selectMilitaryProgram();
        String expectedText="What would you like to protect?";
        String actualText=getTextByXpath(whatToProtectTitleText);
        Assert.assertEquals(actualText,expectedText, "Text doesnt match");
    }

    public void selectFederalEmployees() throws InterruptedException {
        homepage.clickFederalEmployee();
        String expectedText="GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");
    }

    public void clickRentersTest() throws InterruptedException {
        homepage.clickRenters();
        String expectedText="GEICO About You";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");
    }

    public void selectInsuranceDiscountTest() throws InterruptedException {
        homepage.selectInsuranceDiscount();
        String expectedText="Learn More About Available Insurance Discounts | GEICO";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");
    }

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

    }
