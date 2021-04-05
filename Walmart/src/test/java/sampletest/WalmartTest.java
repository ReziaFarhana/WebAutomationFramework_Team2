package sampletest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sample.WalmartHome;

import java.io.IOException;

import static sample.WalmartWebElement.*;

public class WalmartTest extends WebAPI {

    //Test class
    WalmartHome walmart;

    @BeforeMethod
    public void getInit() {
        walmart = PageFactory.initElements(driver, WalmartHome.class);
    }
//    @Test(enabled = true)
//    public void latinAmericaSectionTest() throws InterruptedException {
//        home.latinAmericaSection();
//        String expectedText = "Latin America";
//        String actualText = getTextByXpath(latinAmerica);
//        Assert.assertEquals(actualText, expectedText, "results are matching");
//    }
//   @Test(enabled = true)
//    public void savingsSpotLightSectionTesting() throws InterruptedException {
//    walmart.savingsSpotLightSection();
//        String expectedText = "walmart saving";
//        String actualText = getTextByXpath(savingsSpotLight);
//        Assert.assertEquals(actualText, expectedText, "results are matching");
//    }
//    @Test(enabled = true)
//    public void shopHomeSectionTest(){
//        walmart.shopHomeSection();
//        String expectedText = "walmart saving";
//        String actualText = getTextByXpath(shopHome);
//        Assert.assertEquals(actualText, expectedText, "results are matching");
//
//    }


    @Test(enabled = false)
    public void testSearchBox1() throws InterruptedException {
        walmart.searchBox1();
        String expectedText = "Hand Sanitizer - Walmart.com";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Product does not match");
    }

    @Test(enabled = false)
    public void pickUpAndDeliverySectionTesting() throws InterruptedException {
        walmart.pickUpAndDeliverySection();
        String expectedText = "Walmart Grocery";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Product does not match");

    }

    @Test(enabled = false)
    public void brokenLinkTest() throws IOException, IOException {
        walmart.brokenLink();

    }

    @Test(enabled = true)
    public void myItemsSectionTesting() throws InterruptedException {
        walmart.myItemsSection();
        String expectedText = "Easy Reorder - Walmart.com";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Product does not match");
    }

    @Test(enabled = false)
    public void myItems2SectionTesting() throws InterruptedException {
        walmart.myItems2Section();
        String expectedText = "Easy Reorder - Walmart.com";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Product does not match");
    }

    @Test(enabled = false)
    public void byAgainSectionTesting() throws InterruptedException {
        walmart.byAgainSection();
        String expectedText = "Easy Reorder - Walmart.com";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Product does not match");
    }

    @Test(enabled = false)
    public void selectListsSectionTesting() throws InterruptedException {
        walmart.selectListsSection();
        String expectedText = "Easy Reorder - Walmart.com";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Product does not match");
    }

    @Test(enabled =false)
    public void walmartServicesSectionTesting() {
        walmart.walmartServicesSection();
        String expectedText = " Walmart.com";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Product does not match");
    }

    @Test(enabled = false)
    public void selectWalmartSectionTesting() throws InterruptedException {
        walmart.selectWalmartSection();
        String expectedText = " Walmart.com";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Product does not match");
    }


    @Test(enabled = false)
    public void groceryPickUpAndDeliveryTesting(){
        walmart.groceryPickUpAndDelivery();
        String expectedTitle = "walmart Grocery";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Results are not matching");
    }

}