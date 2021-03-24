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
    @Test
    public void doCoverageCalcTest() throws InterruptedException {
        homepage.doCoverageCalc();
        String expectedText ="Car Insurance Estimator - Coverage Calculator | GEICO";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Test failed");
    }
}
