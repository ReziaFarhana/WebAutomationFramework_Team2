package home_page;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

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

    @FindBy(xpath = priceSelection)
    WebElement findPriceSelection;

    @FindBy(xpath = "//span[contains(text(),'Customer Rating')]")
    public WebElement rating;


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
    public void useWalmartGiftCardsLink() throws InterruptedException {
        useGiftCardLink();
        try {
            sleepFor(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickByXpath(walmartEGiftCard);
        sleepFor(3);
    }

    /**
     * This method will apply the Gift eligible check box filter
     * inside the Walmart Gift Cards - Walmart.com page
     */
    public void filterByGiftEligible() throws InterruptedException {
        useWalmartGiftCardsLink();
        clickByCss(giftCheckBox);
    }

    /**
     * This method will apply the graduation check box filter under Occasions option
     * inside the Walmart Gift Cards - Walmart.com page
     */
    public void filterByOccasion() throws InterruptedException {
        useWalmartGiftCardsLink();
        scroll("500");
        clickByCss(occasionGraduation);
    }

    /**
     * This method will apply the Brand check box filter
     * inside the Walmart Gift Cards - Walmart.com page
     */
    public void filterByGiftBrandName() throws InterruptedException {
        useWalmartGiftCardsLink();
        scroll("500");
        clickByCss(giftCardBrand);
    }

    /**
     * This method will apply the price options check box filter
     * inside the Walmart Gift Cards - Walmart.com page
     */
    public void filterByGiftPrice() throws InterruptedException {
        useWalmartGiftCardsLink();
        scroll("500");
        clickByCss(priceInGifrCard);
    }

    /**
     * This is a method that will open to sort with top brands
     * inside the Walmart Gift Cards - Walmart.com page
     */
    public void useSortByTopBrand() throws InterruptedException {
        useWalmartGiftCardsLink();
        clickByXpath(sortByTopBrands);
        sleepFor(4);
        clickByXpath(sellecrSamsclaubAsBrand);
        sleepFor(4);
        clickByXpath(clickToUnfreez);
    }

    public void walmartPay() throws InterruptedException {
        scrollToBottomPage();
        sleepFor(3);
        clickByXpath(walmartPay);
    }

     public void walmartWeeklyAdy() throws InterruptedException {
        scrollToBottomPage();
        sleepFor(3);
        clickByXpath(walmartWeeklyAd);
        sleepFor(3);
    }

    public void findAnotherWalmartStore() throws InterruptedException {
        walmartWeeklyAdy();
        clickByXpath(findAnotherWalmartStore);
    }

    public void WalmartOtherServices() throws InterruptedException {
        scrollDown();
        sleepFor(2);
        clickByXpath(otherServicesOfWalmartFootPage);
        sleepFor(2);
    }

    public void homeServices() throws InterruptedException {
        WalmartOtherServices();
        clickByXpath(walmartHomeServices);
        clickByXpath(linkForHomeServices);
        sleepFor(2);
    }

    public void filterByCustomerRating() throws InterruptedException {
        homeServices();
        scrollTo(rating);
        clickById(filterByCustomerRating);
    }

    public void filterByPrice() throws InterruptedException {
        filterByCustomerRating();
        scrollTo(findPriceSelection);
        typeOnElementNEnter(enterMininumPrice,"120");
    }

    public void filterByMaxPrice() throws InterruptedException {
        filterByPrice();
        scrollTo(findPriceSelection);
        typeOnElementNEnter(maximumPriceEntered, "320");
    }

    public void useTheSearchBox() throws InterruptedException {
        scrollToBottomPage();
        sleepFor(3);
        clickByXpath(footerGroceryAndPickUP);
        typeOnElementNEnter(usingSearchOption,"Tomato");
        sleepFor(2);
    }

    public void addItemToCart() throws InterruptedException {
        useTheSearchBox();
        clickByXpath(addItemToCart);
        sleepFor(2);
    }

    public void increaseItemCountInCart() throws InterruptedException {
        addItemToCart();
        clickByCss(increasingItemCountInCart);
        clickByCss(increasingItemByOneCountInCart);
        sleepFor(2);
    }


}
