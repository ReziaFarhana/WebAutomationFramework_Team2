package homepage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

    @FindBy(how= How.XPATH, using=claimsAndRoadsideXp) public WebElement claimsAndRoadside;
    @FindBy(how= How.XPATH, using=toolsAndResXp) public WebElement toolsAndResources;
    @FindBy(how= How.CSS, using=zipcodeBoxCss) public WebElement zipcodeBox;
    @FindBy(how= How.XPATH, using=rentersXp) public WebElement renters;


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
    public void selectMilitaryProgram() throws InterruptedException {
        selectToolsAndResources();

        clickByXpath(militaryProgXp);
//        waitTimeExplicit(zipcodeBoxClass);
//        inputValueInTextBoxByWebElement(zipcodeBox,zipcodeValue);
         driver.findElement(By.cssSelector(zipcodeBoxCss)).sendKeys(zipcodeValue, Keys.ENTER);
         sleepFor(3);

    }
    public void selectFederalEmployees() throws InterruptedException {
        selectMilitaryProgram();
        clickByXpath(fedEmpXp);
        driver.findElement(By.cssSelector(zipcodeBoxCss)).sendKeys(zipcodeValue, Keys.ENTER);
        sleepFor(3);
    }
    public void clickFederalEmployee() throws InterruptedException {
        selectToolsAndResources();
        sleepFor(4);
        clickByXpath(fedEmpXp);
        driver.findElement(By.cssSelector(zipcodeBoxCss)).sendKeys(zipcodeValue, Keys.ENTER);
        sleepFor(3);
    }
    public void clickRenters () throws InterruptedException {
        clickFederalEmployee();
        hoverOver(driver,renters);
        clickByXpath(rentersXp);
        clickByCss(nextQuoteCss);
        WebElement dateBox = driver.findElement(By.xpath(dateInputXp));
        dateBox.sendKeys("09221995");
//        clickByXpath(dobNxtXp);
//        driver.findElement(By.name(firstNameName)).sendKeys("Easha", Keys.TAB);
//        sleepFor(3);
//        driver.findElement(By.name(lastNameName)).sendKeys("Khanam", Keys.ENTER);
//        clickByXpath(dobNxtXp);

    }

    public void selectInsuranceDiscount() throws InterruptedException {
        selectToolsAndResources();
        scrollByXPATH(insuranceDiscount);
    }
    public void selectCommercialAutoFaq() throws InterruptedException {
        selectToolsAndResources();
        scrollByXPATH(commAutoFaqXp);
    }
    public void selectCarBuyingResources() throws InterruptedException {
        selectToolsAndResources();
        scrollByXPATH(carBuyingResXp);
    }
    public void selectLocalGasPrices() throws InterruptedException {
        selectToolsAndResources();
        scrollByXPATH(localGasPrices);
    }


}
