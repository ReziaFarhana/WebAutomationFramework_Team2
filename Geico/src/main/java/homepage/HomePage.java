package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

    @FindBy(how= How.XPATH, using=claimsAndRoadsideXp) public WebElement claimsAndRoadside;
    @FindBy(how= How.XPATH, using=toolsAndResXp) public WebElement toolsAndResources;


    public void informationNav()  {
        clickByXpath(informationXp);
    }
    public void claimsAndRoadsideHelpNav() throws InterruptedException {
        informationNav();
        hoverOver(driver, claimsAndRoadside);
        sleepFor(4);
    }
    public void selectReportAClaim() throws InterruptedException {
        claimsAndRoadsideHelpNav();
        clickByXpath(reportAClaimXp);
    }
    public void selectViewAClaim() throws InterruptedException {
        claimsAndRoadsideHelpNav();
        clickByXpath(viewAClaimXp);

    } public void selectgetRoadSideHelp() throws InterruptedException {
        claimsAndRoadsideHelpNav();
        clickByXpath(getRoadSideHelpXp);
    }
    public void selectReportGlassDamage() throws InterruptedException {
        claimsAndRoadsideHelpNav();
        clickByXpath(reportGlassDamageXp);
    }
    public void selectCatastropheClaims() throws InterruptedException {
        claimsAndRoadsideHelpNav();
        clickByXpath(catastropheClaimsXp);
    }
    public void selectEstimateandRepair() throws InterruptedException {
        claimsAndRoadsideHelpNav();
        clickByXpath(estimateAndRepairXp);
    }
    public void selectToolsAndResources() throws InterruptedException {
        informationNav();
        hoverOver(driver, toolsAndResources);
        sleepFor(4);
    }
    public void selectCoverageCalculator() throws InterruptedException {
        selectToolsAndResources();
        clickByXpath(coverageCalcXp);
    }
    public void doCoverageCalc() throws InterruptedException {
        selectCoverageCalculator();
        tryRadioBtn(singleRadiobtnXp);
        sleepFor(3);
        clickByCss(nxtBtnCss);
        tryRadioBtn(ageRadioXp);
        sleepFor(3);
        clickByCss(nxtBtnCss);
        tryRadioBtn(insuranceCovRadioXp);
        clickByCss(nxtBtnCss);
        sleepFor(3);
        tryRadioBtn(noRadiobtnxP);
        clickByCss(nxtBtnCss);
        sleepFor(3);
        tryRadioBtn(carOwnershipRadiobtnXp);
        clickByCss(nxtBtnCss);
        sleepFor(3);
        tryRadioBtn(vehicleValueRadioXp);
        clickByCss(nxtBtnCss);
        sleepFor(3);
        tryRadioBtn(timeSpentRadioXp);
        clickByCss(nxtBtnCss);
        sleepFor(3);
    }



}
