package sample;
import static sample.WalmartWebElement.*;
import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

import java.io.IOException;

import static sample.WalmartWebElement.searchButtonLocator;

public class WalmartHome extends WebAPI {

//public void savingsSpotLightSection() throws InterruptedException {
//    clickByXpath(savingsSpotLight);
//    sleepFor(2);
//}
//public void shopHomeSection(){
//    clickByXpath(shopHome);
//}

//    public void usingBBCContentSection() throws InterruptedException {
//        waitTimeExplicit(advertisement);
//        clickByXpath(advertisement);
//        sleepFor(2);
//        clickByXpath(termsOfUse);
//        waitTimeUsingFluent(usingBBCContent);
//        clickByXpath(usingBBCContent);
    // }



    public void brokenLink() throws IOException {
        WebAPI wp = new WebAPI();
        wp.brokenLink();
    }

    @FindBy (how = How.ID, using =searchBoxLocator ) public WebElement searchBox;
    @FindBy (how = How.ID, using =searchButtonLocator ) public WebElement searchButton;
    @FindBy (how = How.XPATH, using =searchTextLocator ) public WebElement searchText;

//    // Action Method
//    public void searchBox() throws InterruptedException {
//        // Enter productName
//        searchBox.sendKeys(productName);
//        sleepFor(3);
//        // Click on searchButton
//        searchButton.click();
//
//        //****************************          or
//    }
        public void searchBox1(){
            typeOnElement(searchBoxLocator,"Hand Sanitizer");
            clickOnElement(searchButtonLocator);
        }

    public void pickUpAndDeliverySection() throws InterruptedException {
            clickByCss(pickUpAndDelivery);
            sleepFor(2);
    }

    public void myItemsSection() throws InterruptedException {
        clickByCss(pickUpAndDelivery);
        sleepFor(2);
        clickByXpath(myItems);
    }

    public void myItems2Section() throws InterruptedException {
            clickByXpath(myItems2);
    }

    public void byAgainSection() throws InterruptedException {
            clickOnElement(byAgain);
            sleepFor(2);
    }

    public void selectListsSection() throws InterruptedException {
            clickOnElement(lists);
            sleepFor(2);
    }
    public void walmartServicesSection(){
            clickByXpath(walmartServices);
            waitTimeExplicit(walmartServices);
    }

    public void selectWalmartSection() throws InterruptedException {
           clickOnElement(walmart);
           sleepFor(2);
    }

    public void groceryPickUpAndDelivery(){
          clickByXpath(pickUpAndDelivery);
          waitTimeUsingFluent(pickUpAndDelivery);
    }

}










