package home_page;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static home_page.GeicoWebElement.*;

public class GeicoHome extends WebAPI {

    @FindBy(xpath = geicoCanHelpText)
    public WebElement locateGeneralLiabilityInsurance;

    @FindBy(xpath = locateNearestToGetQoute)
    public WebElement getLlocateNearestToGetQoute;



    /**
     * Method to open Insurance drop down link in Geico home page
     * First click on INSURANCE drop down and look for Business Insurance
     * and hover on to find the next Business Owners link
     * @throws InterruptedException
     */
    public void clickOnInsuranceLink() throws InterruptedException {
        clickByXpath(insuranceLink);
        sleepFor(3);
        mouseHoverByXpath(weyttat);
        sleepFor(3);
        clickByCss(businessOwners);
        sleepFor(3);
        boolean found = driver.findElement(By.cssSelector(questionWindows)).isDisplayed();
        if(found == true){
            clickByCss(closeQuestionWindows);
        }

    }

    /**
     * Method to open the General Liability Link once the Business Owner
     * page is displayed
     * @throws InterruptedException
     */
    public void generalLiabilityIns() throws InterruptedException {
        clickOnInsuranceLink();
        scrollTo(locateGeneralLiabilityInsurance);
        sleepFor(2);
        clickByXpath(generalLiabilityInsurance);
    }

    /**
     * Method to open Professional Liability Insurance inside Business Owner page
     * @throws InterruptedException
     */
    public void openProfessionalLibilityLink() throws InterruptedException {
        clickOnInsuranceLink();
        scrollTo(locateGeneralLiabilityInsurance);
        sleepFor(2);
        clickByXpath(professionalLiabilityIns);
    }
    /**
     * Method to open Workers' Compensation Insurance inside Business Owner page
     * @throws InterruptedException
     */
     public void openworkersConpensatinInsLink() throws InterruptedException {
        clickOnInsuranceLink();
        scrollTo(locateGeneralLiabilityInsurance);
        sleepFor(2);
        clickByXpath(workersConpensatinIns);
    }

    /**
     * Method to open Cyber Liability Insurance inside Business Owner page
     * @throws InterruptedException
     */
     public void opencyberLiabilityInsLink() throws InterruptedException {
        clickOnInsuranceLink();
        scrollTo(locateGeneralLiabilityInsurance);
        sleepFor(2);
        clickByXpath(cyberLiabilityIns);
    }

    /**
     * Method to open Get Quote button in General Liability insurance
     * @throws InterruptedException
     */
    public void openGetQuoteGeneral() throws InterruptedException {
        generalLiabilityIns();
        clickByXpath(getGeneralQoute);
        sleepFor(2);
    }

    /**
     * Method to open Start Your Quote button which is found
     * General Liability Insurance (GL)
     * @throws InterruptedException
     */
    public void openStartYourQuoteNowInGeneralIns() throws InterruptedException {
        openGetQuoteGeneral();
        clickByXpath(startGeneralQoute);
        sleepFor(2);
    }

    /**
     * Method to open START QUOTE in General Liability Insurance page
     * the link open a new page with a title GEICO and Hiscox (A trusted partnership)
     * @throws InterruptedException
     */
    public void openStartQuoteGeneralLiabilityInsurance() throws InterruptedException {
        openStartYourQuoteNowInGeneralIns();
        clickByCss(startQuoteGeneralLiabilityInsurance);
        sleepFor(3);
    }

        @FindBy(css = lookingForVirginia)
        public WebElement selectViginia;

    public void workingOnGEICOAndHiscoxPage() throws InterruptedException {
        openStartQuoteGeneralLiabilityInsurance();
        windoSwitchHandler2(1);
        sleepFor(2);
        // clickByCss(stateSelection);
        clickByCss(stateSelection);
        sleepFor(2);
        selectOptionByVisibleText(selectViginia, "Virginia");

    }


}
