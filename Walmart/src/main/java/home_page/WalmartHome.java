package home_page;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static home_page.WalmartWebElement.*;

public class WalmartHome extends WebAPI {


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


    /**
     * helper method to scroll down fixed amount to the footer Walmart page
     */
    public void scrollDown() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,4000);");
    }

    /**
     * Helper method to scroll dynamically - applying overloading
      * @param num
     */
    public void scrollDown(String num) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0," + num + ");");
    }

    /**
     * This method will look for Walmart+ form Walmart Services
     * which are found under the footer of Walmart Home Page :
     *  =>The followings are all the lists in Walmart Services
     *      Walmart+, Grocery Pickup & Delivery , MoneyCenter
     *      Walmart Credit Card, Walmart Pay , Weekly Ad, Other Services
     */
    public void clickOnWalmartPlusLink() {
        scrollDown();
        clickByXpath(walmartPlusLink);
    }

    /**
     * This method will click on All Benefits once we landed on walmart+ from the Benefits
     * selection option. Used the Action method to hover over before click on the element
     */
    public void workingOnBenefitsSelection() {
        clickOnWalmartPlusLink();
        hoverAndClick(driver, benefitLinkToHoverOn, allBenefitsClick);
    }

    /**
     * This method will click on a Free shipping, no order minimum link inside
     * All Benefits link - on the 17th of March 2021 it had a tag labeled new in Yellow
     */
    public void clickOnFreeShippingInBenefits() {
        workingOnBenefitsSelection();
        clickByCss(freeShippingInAllBenefits);
    }

    /**
     * This method will click on the Mobile Scan & Go selection option in Benefits
     */
    public void mobileScanAndGoInBenefits() {
        clickOnWalmartPlusLink();
        hoverAndClick(driver, benefitLinkToHoverOn, mobileScanAndGoLink);
    }

    /**
     * This method will look for Grocery Pickup & Delivery form Walmart Services
     * which are found under the footer of Walmart Home Page :
     *  =>The followings are all the lists in Walmart Services
     *      Walmart+, Grocery Pickup & Delivery , MoneyCenter
     *      Walmart Credit Card, Walmart Pay , Weekly Ad, Other Services
     */
    public void clickOnGroceryPickupAndDelivery() {
        scrollDown();
        clickByXpath(groceryPickupAndDelivery);
    }

    /**
     * This method will look for MoneyCenter form Walmart Services
     * which are found under the footer of Walmart Home Page :
     *  =>The followings are all the lists in Walmart Services
     *      Walmart+, Grocery Pickup & Delivery , MoneyCenter
     *      Walmart Credit Card, Walmart Pay , Weekly Ad, Other Services
     */
    public void clickOnMoneyCenter() {
        scrollDown();
        clickByLinkText(MoneyCenter);
    }

    /**
     * This method is will find the Walmart Credit Card option under the
     * hamburger menu once the money center page is loaded
     */
    public void hamburgerMenuOfMoneyCenter() {
        clickOnMoneyCenter();
        clickByCss(hamburgerMenuInMoneyCenter);
        clickByCss(walmartCreditCardInhamburgerMenuInMoneyCenter);
    }

    // failing need to be refined
    public void clickOnBillPay() {
        clickOnMoneyCenter();
        hoverAndClick(driver, menuButtonHover, billPayLinkForClick);
    }

    /**
     * This is a method that will open the Gift Cards link which is found
     * in Money Center page in the menu bar
     */
    public void useGiftCardLink() {
        clickOnMoneyCenter();
        clickByCss(giftCardLink);
    }

    /**
     * This is a method to open the Walmart gift Cards menu bare list
     * once we landed on new page of the Gift cards link
     */
    public void useVisaE_GiftCardLink() {
        useGiftCardLink();
        try {
            sleepFor(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickByXpath(walmartEGiftCard);
    }

    /**
     * This method will apply the Gift eligible check box filter
     * inside the Walmart Gift Cards - Walmart.com page
     */
    public void filterByGiftEligible() {
        useVisaE_GiftCardLink();
        clickByCss(giftCheckBox);
    }

    /**
     * This method will apply the graduation check box filter under Occasions option
     * inside the Walmart Gift Cards - Walmart.com page
     */
    public void filterByOccasion() {
        useVisaE_GiftCardLink();
        scrollDown("500");
        clickByCss(occasionGraduation);
    }

    /**
     * This method will apply the Brand check box filter
     * inside the Walmart Gift Cards - Walmart.com page
     */
    public void filterByGiftBrandName() {
        useVisaE_GiftCardLink();
        scrollDown("500");
        clickByCss(giftCardBrand);
    }

    /**
     * This method will apply the price options check box filter
     * inside the Walmart Gift Cards - Walmart.com page
     */
    public void filterByGiftPrice() {
        useVisaE_GiftCardLink();
        scrollDown("500");
        clickByCss(priceInGifrCard);
    }


}
