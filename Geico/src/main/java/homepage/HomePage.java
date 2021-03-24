package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

    @FindBy(how= How.XPATH, using=claimsAndRoadsideXp) public WebElement claimsAndRoadside;


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



}
