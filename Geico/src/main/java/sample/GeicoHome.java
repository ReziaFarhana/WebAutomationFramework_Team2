package sample;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static sample.GeicoWebElement.*;

public class GeicoHome extends WebAPI {



    //Action method:
    @FindBy(how= How.XPATH,using =searchBoxLocator)public WebElement searchBox;
    @FindBy(how= How.XPATH,using =searchButtonLocator)public WebElement searchButton;




    public void geicoInsuranceChecking() throws InterruptedException {
        clickByXpath(insurance);
        sleepFor(2);
    }

    public void geicoVehicleInsuranceChecking() throws InterruptedException {
        clickOnElement(insurance);
        sleepFor(2);
        scrollTO(vehicleInsurance);
        clickByXpath(vehicleInsurance);
    }

    public void geicoAutoVehicleChecking() throws InterruptedException {
       // clickOnElement(insurance);
        sleepFor(2);
      //  scrollTO(vehicleInsurance);
        clickByXpath(vehicleInsurance);
        sleepFor(2);
        //waitTimeExplicit(autoVehicle);
        clickByXpath(autoVehicle);
    }

  public void SelectPropertyInsurance() throws InterruptedException {
      clickOnElement(insurance);
      sleepFor(2);
      clickByXpath(propertyInsurance);
  }

   public void checkingBusinessInsurance() throws InterruptedException {
       clickByXpath(insurance);
       sleepFor(2);
        getListOfWebElementsByXpath(businessInsurance);
       clickOnElement(businessInsurance);
   }

   public void additionalInsuranceSection(){
       clickByXpath(insurance);
       waitTimeExplicit(businessInsurance);
       getTextByXpath(additionalInsurance);
   }

   public void selectUmbrellaOption() throws InterruptedException {
       clickByXpath(insurance);
       sleepFor(2);
        clickOnElement(additionalInsurance);
        sleepFor(2);
        clickByCss(umbrellaOption);
   }

    public void informationSection() throws InterruptedException {
        clickOnElement(information,driver);
        sleepFor(3);
    }

   public void selectMyAccount(){
        clickOnElement(information);
        waitTimeUsingFluent(myAccount);
        clickByXpath(myAccount);
   }

   public void ClaimsAndRoadsideHelpSection() throws InterruptedException {
        clickByXpath(information);
        sleepFor(3);
        getTextByXpath(claimsAndRoadsideHelp);

   }
   public void selectToolsAndResources() throws InterruptedException {
       clickOnElement(information,driver);
       sleepFor(3);
      // waitTimeExplicit(toolsAndResources);
       clickOnElement(toolsAndResources);

   }
 public void aboutGEICOSection() throws InterruptedException {
     clickOnElement(information,driver);
     sleepFor(2);
     getTextByXpath(aboutGEICO);
     sleepFor(2);

 }

 public void selectWebAndMobile(){
        clickByXpath(information);
        waitTimeUsingFluent(webAndMobile);
     getTextByXpath(webAndMobile);
 }

 public void contactUsSection(){
        clickByXpath(information);
        waitTimeUsingFluent(contactUs);
        clickByXpath(contactUs);
 }

 public void reportAnIncidentSection() throws InterruptedException {
        getTextByXpath(reportAnIncident);
        sleepFor(2);
        isPopUpWindowDisplayed(driver,reportAnIncident);
 }
 public void gEICOHomepage() throws InterruptedException {
        clickOnElement(information,driver);
        sleepFor(2);
        clickByCss(gEICOHomepage);

 }
 public void covid19UpdatesSection() throws InterruptedException {

       // waitTimeExplicit(covid19Updates);
        clickByXpath(covid19Updates);
       sleepFor(2);
 }

 public void startQuoteSection() throws InterruptedException {
     clickOnElement(startQuote,driver);
     sleepFor(2);
   // waitTimeExplicit(startQuote);
 }

 public void SelectReportGlassOnlyDamage() throws InterruptedException {
     clickOnElement(reportGlassOnlyDamage);
     sleepFor(2);

 }
 public void continueYourSavedQuoteSection() throws InterruptedException {
     clickByXpath(continueYourSavedQuote);
     sleepFor(2);
      navigateBack();
     }

     public void findAnAgentNearYouSection() throws InterruptedException {
        clickByCss(findAnAgentNearYou);
        sleepFor(2);
     }

 public void moreProductsSection(){
     clickByCss(moreProducts);
     isPopUpWindowDisplayed(driver,moreProducts);
 }
  public void requestRoadsideAssistance() throws InterruptedException {
        getTextByXpath(requestRoadsideAssistance);
        sleepFor(3);
  }
   public void trackAClaimSection() throws InterruptedException {
        clickOnElement(trackAClaim,driver);
        sleepFor(3);
   }
   public void boatSection() throws InterruptedException {
        clickByXpath(boat);
        sleepFor(3);
   }

   public void selectClaimCenter() throws InterruptedException {
        clickOnElement(claimsCenter);
        sleepFor(2);
   }

   public void gEICOLivingSection(){
        clickByXpath(gEICOLiving);

   }
}
