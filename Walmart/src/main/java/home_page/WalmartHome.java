package home_page;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static home_page.WalmartWebElement.*;

public class WalmartHome extends WebAPI {

//    @FindBy(xpath = allBenefitsOption)
//    WebElement benefit;

    @FindBy(xpath = benefitsLink)
    WebElement benefitLinkToHoverOn;

    @FindBy(xpath = allBenefitsOption)
    WebElement allBenefitsClick;

    @FindBy(css = mobileScanAndGo)
    WebElement mobileScanAndGoLink;

    @FindBy(css = menuButtonInMoneyCenter)
    WebElement menuButtonHover;

    @FindBy(css = billPayInmenuButtonInMoneyCenter)
    WebElement billPayLinkForClick;

//
//    @FindBy(css = e_GiftCard)
//    WebElement hoverOverE_GiftCard;
//
//    @FindBy(xpath = walmartEGiftCard)
//    WebElement clickOnWalmartE_Card;



    // helper method to scroll down to the footer Walmart page
    public void scrollDown(){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,4000);");
    }

         public void scrolDown(String num){
        JavascriptExecutor executor = (JavascriptExecutor) driver;

        executor.executeScript("window.scrollBy(0,"+num+");");
    }

        // Method to click on Walmart+
    public void clickOnWalmartPlusLink(){
        scrollDown();
        clickByXpath(walmartPlusLink);
    }

    public void workingOnBenefitsSelection(){
        clickOnWalmartPlusLink();
        hoverAndClick(driver,benefitLinkToHoverOn,allBenefitsClick);
    }

    public void clickOnFreeShippingInBenefits(){
        workingOnBenefitsSelection();
        clickByCss(freeShippingInAllBenefits);
    }

    public void mobileScanAndGoInBenefits(){
        clickOnWalmartPlusLink();
        hoverAndClick(driver,benefitLinkToHoverOn,mobileScanAndGoLink);
    }

    public void clickOnGroceryPickupAndDelivery(){
        scrollDown();
        clickByXpath(groceryPickupAndDelivery);
    }

    public void clickOnMoneyCenter(){
        scrollDown();
        clickByLinkText(MoneyCenter);
    }

    public void hamburgerMenuOfMoneyCenter(){
        clickOnMoneyCenter();
        clickByCss(hamburgerMenuInMoneyCenter);
        clickByCss(walmartCreditCardInhamburgerMenuInMoneyCenter);
    }
            // failing need to be refined
    public void clickOnBillPay(){
        clickOnMoneyCenter();
        hoverAndClick(driver,menuButtonHover,billPayLinkForClick);
    }

    public void useGiftCardLink(){
        clickOnMoneyCenter();
        clickByCss(giftCardLink);
    }

    public void useVisaE_GiftCardLink(){
        useGiftCardLink();
        try {
            sleepFor(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickByXpath(walmartEGiftCard);
    }

    public void filterByGiftEligible(){
        useVisaE_GiftCardLink();
        clickByCss(giftCheckBox);
    }

    public void filterByOccasion(){
        useVisaE_GiftCardLink();
        scrolDown("500");
        clickByCss(occasionGraduation);
    }

    public void filterByGiftBrandName() {
        useVisaE_GiftCardLink();
        scrolDown("500");
        clickByCss(giftCardBrand);
    }


public void filterByGiftPrice() {
        useVisaE_GiftCardLink();
        scrolDown("500");
        clickByCss(priceInGifrCard);
    }








}
