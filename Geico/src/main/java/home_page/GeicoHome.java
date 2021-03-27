package home_page;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Ignore;

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
    public void openProfessionalLiabilityLink() throws InterruptedException {
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
        windoSwitchHandler(1);
        sleepFor(2);
    }


        @FindBy(css = lookingForVirginia)
        public WebElement selectViginia;

    public void workingOnGEICOAndHiscoxPage() throws InterruptedException {
        openStartYourQuoteNowInGeneralIns();
//        windoSwitchHandler2(1);
//        sleepFor(2);
        // clickByCss(stateSelection);
        clickByCss(stateSelection);
        sleepFor(2);
        selectOptionByVisibleText(selectViginia, "Virginia");

    }


    /**
     * Method to open Auto insurance from the Insurance dropdown menue
     * @throws InterruptedException
     */
    public void workOnVehicleInsuranceAuto() throws InterruptedException {
        clickByXpath(insuranceLink);
        sleepFor(3);
        mouseHoverByXpath(vehicleInsuranceLocator);
        sleepFor(3);
        clickByCss(autoInVehicleLocator);
        sleepFor(3);
//        boolean found = driver.findElement(By.cssSelector(questionWindows)).isDisplayed();
//        if(found == true){
//            clickByCss(closeQuestionWindows);
//        }
    }

    public void reviewQuoteWithZIP() throws InterruptedException {
        workOnVehicleInsuranceAuto();
        typeOnElementNEnter(addZIPLocator,"08608");
    }

    public void clickOnNextLinkAfterZIPPageLoaded() throws InterruptedException {
        reviewQuoteWithZIP();
        clickByXpath(clickOnNext);
        sleepFor(3);
    }

    public void updateDateOfBirth() throws InterruptedException {
        clickOnNextLinkAfterZIPPageLoaded();
        driver.findElement(By.className(dateOfBirthLocator)).sendKeys("01202001", Keys.ENTER);
        sleepFor(2);
    }

    public void updateNameInformation() throws InterruptedException {
        updateDateOfBirth();
        driver.findElement(By.xpath(enterFirstNameLocator)).sendKeys("Maria");
        driver.findElement(By.xpath(enterLastNameLocator)).sendKeys("Bolton", Keys.ENTER);

    }


    /**
     * Method to open Motorcyle insurance from the Insurance dropdown menue
     * @throws InterruptedException
     */
    public void workOnVehicleInsuranceMotorcycle() throws InterruptedException {
        clickByXpath(insuranceLink);
        sleepFor(3);
        mouseHoverByXpath(vehicleInsuranceLocator);
        sleepFor(3);
        clickByCss(motorcycleInVehicleLocator);
        sleepFor(3);

    }

    public void reviewMotorInsuranceQuoteWithZIP() throws InterruptedException {
        workOnVehicleInsuranceMotorcycle();
        typeOnElementNEnter(addZIPLocator,"08608");
        sleepFor(3);
    }

    public void selectNoForAutoInsurance() throws InterruptedException {
        reviewMotorInsuranceQuoteWithZIP();
        clickRadio(radioNoLocator);
        sleepFor(2);
        clickByXpath(clickOnNext);
    }

    /**
     * Method to open Property --> then Homeowners insurance
     * from the Insurance dropdown menue
     * @throws InterruptedException
     */
    public void workOnPropertyInsuranceMenue() throws InterruptedException {
        clickByXpath(insuranceLink);
        sleepFor(3);
        mouseHoverByXpath(propertyInsuranceLocator);
        sleepFor(3);
        clickByCss(homeownerInsuranceLocator);
        sleepFor(3);
    }

        @FindBy(css = scrollToGetAnswersLocator)
        public WebElement locateGetAnswers;

    public void clickOnHowToProtectMyHome() throws InterruptedException {
        workOnPropertyInsuranceMenue();
        scrollTo(locateGetAnswers);
        clickByCss(waysToProtectMyHomeLocator);
    }

    public void clickOnHowMuchCoverage() throws InterruptedException {
        workOnPropertyInsuranceMenue();
        scrollTo(locateGetAnswers);
        clickByCss(howMuchCoverageLocator);
    }

    public void clickOnContinueQuoteButtonOfHomeInsurance() throws InterruptedException {
        workOnPropertyInsuranceMenue();
        clickByXpath(continueQuoteButton);
    }
    @Ignore // page seems changed
    public void loginIntoGeico() throws InterruptedException {
        clickOnContinueQuoteButtonOfHomeInsurance();
//        clickByCss(rememberMeLocator);
        boolean selected = driver.findElement(By.cssSelector(rememberMeLocator)).isSelected();
        if(selected == true){
            typeOnInputBox(userNameLocator,"Nemegata");
            typeByCssNEnter(geicoLoginlocator,"1234");
        }else {
            clickByCss(rememberMeLocator);
            typeOnInputBox(userNameLocator,"Nemegata");
            typeByCssNEnter(geicoLoginlocator,"1234");
        }
    }

    public void enterInsuraceQuoteInfo() throws InterruptedException {
        clickOnContinueQuoteButtonOfHomeInsurance();
        typeByCssNEnter(enterFirstNameLocatorInInsuranceQuote,"Maria");
        typeByCssNEnter(enterLastNameLocatorInInsuranceQuote,"Bolton");
        typeByCssNEnter(enterDOBLocatorInInsuranceQuote,"01202001");
        typeByCssNEnter(enterZIPLocatorInInsuranceQuote,"0826");
        sleepFor(3);

    }

    public void workingOnAdditionalInsuranceOption() throws InterruptedException {
        clickByXpath(insuranceLink);
        sleepFor(3);
        mouseHoverByXpath(additionalInsuranceOption);
        sleepFor(3);
        clickByCss(clickOnUmbrella);
        sleepFor(3);
        boolean found = driver.findElement(By.cssSelector(questionWindows)).isDisplayed();
        if(found == true){
            clickByCss(closeQuestionWindows);
        }
    }

    public void workingOnAdditionalInsuranceLife() throws InterruptedException {
        clickByXpath(insuranceLink);
        sleepFor(3);
        mouseHoverByXpath(additionalInsuranceOption);
        sleepFor(3);
        clickByXpath(clickOnLifeInsurance);
        sleepFor(3);
        boolean found = driver.findElement(By.cssSelector(questionWindows)).isDisplayed();
        if(found == true){
            clickByCss(closeQuestionWindows);
        }
    }

    public void workingOnTravelInsuranceOption() throws InterruptedException {
        clickByXpath(insuranceLink);
        sleepFor(3);
        mouseHoverByXpath(additionalInsuranceOption);
        sleepFor(3);
        clickByCss(clickOnTravelInsurance);
        sleepFor(3);
        boolean found = driver.findElement(By.cssSelector(questionWindows)).isDisplayed();
        if(found == true){
            clickByCss(closeQuestionWindows);
        }
    }

    public void selectingPetInsurance() throws InterruptedException {
        clickByXpath(insuranceLink);
        sleepFor(3);
        mouseHoverByXpath(additionalInsuranceOption);
        sleepFor(3);
        clickByCss(petInsurance);
        sleepFor(3);
        boolean found = driver.findElement(By.cssSelector(questionWindows)).isDisplayed();
        if(found == true){
            clickByCss(closeQuestionWindows);
        }
    }

    public void selectJewleryInsurance() throws InterruptedException {
        clickByXpath(insuranceLink);
        sleepFor(3);
        mouseHoverByXpath(additionalInsuranceOption);
        sleepFor(3);
        clickByCss(jewelryInsurance);
        sleepFor(3);
        boolean found = driver.findElement(By.cssSelector(questionWindows)).isDisplayed();
        if(found == true){
            clickByCss(closeQuestionWindows);
        }
    }

}
