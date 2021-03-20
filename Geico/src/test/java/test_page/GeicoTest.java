package test_page;

import common.WebAPI;
import home_page.GeicoHome;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
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
    public void verifyProfessionalLibilityLink() throws InterruptedException {
        action.openProfessionalLibilityLink();
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
        assertEqualBycssLocator(generalLiabilityText, "General Liability Insurance");
    }

    @Test
    public void verifyStartQuoteGeneralLiabilityInsurance() throws InterruptedException {
        action.openStartQuoteGeneralLiabilityInsurance();
        windoSwitchHandler(2);
        assertEqualBycssLocator(newGeneralInsuranceNewPage, "A trusted partnership");

    }


}
