package test_page;

import common.WebAPI;
import home_page.WalmartHome;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static home_page.WalmartWebElement.*;

public class WalmartTest extends WebAPI {

    WalmartHome home;

    @BeforeMethod
    public void getInIt() {
        home = PageFactory.initElements(driver, WalmartHome.class);
    }

    // this method is to verify I am on walmart home page
    @Test
    @Ignore
    public void verifyWalmartHomePage() {
        String expected = "https://www.walmart.com/";
        String actual = getCurrentPageUrl();
        Assert.assertEquals(actual, expected, "Result failed to match expected outcome ");
    }

    @Test // 1
    public void verifyWalmartPlusIsClicked() {
        home.clickOnWalmartPlusLink();
        assertEqualBycssLocator(walmartPlusText, "Meet Walmart+");
    }

    @Test // 2
    public void verifyAllBenefitsIsSelected() {
        home.workingOnBenefitsSelection();
        assertEqualByXpath(allBenefitsText, "Explore all benefits");
    }

    @Test  // 3
    public void verifyFreeShippingInBenefits() {
        home.clickOnFreeShippingInBenefits();
        assertEqualByXpath(freeShippingText, "Free shipping, no order minimum");
    }

    @Test  // 4
    public void verifyMobileScanAndGoLinkInBenefits() {
        home.mobileScanAndGoInBenefits();
        assertEqualByXpath(mobileScanAndGoText, "Mobile scan & go");
    }

    @Test  // 5
    public void verifyLandedOnGroceryPickupAndDelivery() {
        home.clickOnGroceryPickupAndDelivery();
        assertEqualBycssLocator(groceryPickupAndDeliveryText, "Pickup & delivery");
    }

    @Test  // 6
    public void verifyMoneyCenterLink() {
        home.clickOnMoneyCenter();
        String expentedTitel = "Money Center - Walmart.com";
        String actualTitel = driver.getTitle();
        Assert.assertEquals(actualTitel, expentedTitel, "Expected doesn't match with actual");
    }

    // this method is to verify the credit card option in hamburger menu of Money Center
    @Test  // 7
    public void verifyCreditCardLinkFromMoneyCenterHamburger() {
        home.hamburgerMenuOfMoneyCenter();
        String expectedTitle = "Walmart Credit Card | Earn 5% Back | Unlimited Rewards - Walmart.com";
        String actuelTitle = driver.getTitle();
        Assert.assertEquals(actuelTitle, expectedTitle, "Test failed - titles doesn't match ");
    }

    //   @Test        //  keeps failing need to be revised in open mind
    public void verifyBillPauLink() {
        home.clickOnBillPay();
        assertEqualBycssLocator(billPayText, "Bill Pay");

    }

    @Test  //  8
    public void verifyGiftCardLink() {
        home.useGiftCardLink();
        assertEqualBycssLocator(shopWalmartGiftCare, "Shop Walmart gift cards");
    }

    @Test  // 9
    public void verifyWalmartE_GiftCard() throws InterruptedException {
        home.useWalmartGiftCardsLink();
        String expected = "Walmart Gift Cards - Walmart.com";
        String actual = driver.getTitle();
    }

    @Test  // 10
    public void verifyGiftEligibleIsApplied() throws InterruptedException {
        home.filterByGiftEligible();
        boolean found = isPopUpWindowDisplayed(driver, e_GiftCardText);
        Assert.assertEquals(found, true, "Test failed - filter is not applied");
    }

    @Test  // 11
    public void verifyOccasionFilterIsApplied() throws InterruptedException {
        home.filterByOccasion();
        boolean found = isPopUpWindowDisplayed(driver, itemSelectedDisplayed);
        Assert.assertEquals(found, true, "Test failed - filter is not applied");
    }

    @Test  // 12
    public void verifyGiftBrandFilterIsApplied() throws InterruptedException {
        home.filterByGiftBrandName();
        boolean found = isPopUpWindowDisplayed(driver, itemSelectedDisplayed);
        Assert.assertEquals(found, true, "Test failed - filter is not applied");
    }

    @Test  // 13
    public void verifyGiftPriceFilterIsApplied() throws InterruptedException {
        home.filterByGiftPrice();
        boolean found = isPopUpWindowDisplayed(driver, itemSelectedDisplayed);
        Assert.assertEquals(found, true, "Test failed - filter is not applied");
    }

    @Test
    public void verifySamesClubIsSelected() throws InterruptedException {
        home.useSortByTopBrand();
        String expected = "Sam's Club";
        String actual = getTextByXpath(toVerifySamsClub);
        Assert.assertEquals(actual, expected, "Test failed");
    }

    @Test
    public void verifyWalmartPay() throws InterruptedException {
        home.walmartPay();
        String expected = "Walmart Pay";
        String actual = getTextByCss(verifyWalmartPay);
        Assert.assertEquals(actual, expected, "Test failed");

    }


    @Test
    public void verifyWalmartWeeklyAd() throws InterruptedException {
        home.walmartWeeklyAdy();
        String expected = "Weekly Ad";
        String actual = getTextByXpath(verifyWalmartWeeklyAd);
        Assert.assertEquals(actual, expected, "Test failed");
    }

    @Test
    public void verifyFindAnotherStore() throws InterruptedException {
        home.findAnotherWalmartStore();
        String actual = driver.getTitle();
        String expected = "Store Finder - Walmart.com";
        Assert.assertEquals(actual, expected, "Test failed");
    }

    @Test
    public void verifyWalmartOtherServices() throws InterruptedException {
        home.WalmartOtherServices();
        String actual = driver.getTitle();
        String expected = "Services | Walmart.com - Walmart.com";
        Assert.assertEquals(actual, expected, "Test failed");
    }

    @Test
    public void verifyHomeServices() throws InterruptedException {
        home.homeServices();
        String expected = "Home Services - Walmart.com";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Test failed");
    }

    @Test
    public void moreThan4Stars() throws InterruptedException {
        home.filterByCustomerRating();
        String expected = "4 stars & up";
        assertEqualByXpath(verify4AndUpSelected, expected);
    }

    @Test
    public void verifyfilterByPrice() throws InterruptedException {
        home.filterByPrice();
        String expected = "$120+";
        assertEqualByXpath(minimumPriceEntered, expected);
    }

    @Test
    public void verifyMaxPriceFilter() throws InterruptedException {
        home.filterByMaxPrice();
        String expected = "$120 - $320";
        assertEqualByXpath(verifyMaxAndMinPrice, expected);
    }

    @Test
    public void verifyUseTheSearchBox() throws InterruptedException {
        home.useTheSearchBox();
        String expected = "Tomato";
        assertEqualByXpath(verifyProductSelection, expected);
    }

    @Test
    public void verifyItemIsAddedToCart() throws InterruptedException {
        home.addItemToCart();
        String expected = "1 item";
        String actual = driver.findElement(By.cssSelector(verifySelectedItemAddedToCart)).getText();
        Assert.assertEquals(actual, expected, "Test failed");
    }

    @Test
    public void verifyItemIsIncereasedInCart() throws InterruptedException {
        home.increaseItemCountInCart();
        String expected = "2 items";
        String actual = driver.findElement(By.cssSelector(verifySelectedItemAddedToCart)).getText();
        Assert.assertEquals(actual, expected, "Test failed");
    }


}
