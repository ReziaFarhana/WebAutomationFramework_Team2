package sampletest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import sample.VerizonHomePage;

import java.io.IOException;

import static sample.VerizonWebElement.*;

public class VerizonPageTest extends WebAPI {


    VerizonHomePage verizon;

    @BeforeMethod
    public void getInit() throws IOException {
        verizon = PageFactory.initElements(driver, VerizonHomePage.class);
    }

    @Test(enabled = true)
    public void topDeviceBrandsSectionTest() throws InterruptedException {
        verizon.topDeviceBrandsSection();
        String expectedTitle = "Verizon: Wireless, Internet, TV and Phone Services | Official Site";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(enabled = true)
    public void appleSectionTest() throws InterruptedException {
        verizon.appleSection();
        String expectedTitle = "Verizon: Wireless, Internet, TV and Phone Services | Official Site";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(enabled = true)
    public void personalSectionTest() throws InterruptedException {
        verizon.personalSection();
        String expectedTitle = "Verizon: Wireless, Internet, TV and Phone Services | Official Site";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(enabled = true)
    public void supportSectionTesting() throws InterruptedException {
        verizon.supportSection();
        String expectedText = "Verizon: Wireless, Support, Services | ";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Results are not matching");
    }
    @Test(enabled = true)
    public void goToGPhonesSection() throws InterruptedException {
        verizon.goToGPhonesSection();
        String expectedTitle = "5G Phones: 5G Ultra Wideband with a 5G Phone | Verizon";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(enabled = true)
    public void testingSelectShopAllSection() throws InterruptedException {
        verizon.selectShopAllSection();
        String expectedTitle = "Shop Deals on Smartphones, Accessories, Devices & Plans | Verizon";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Results are not matching");
    }

    @Test(enabled = true)
    public void prepaidPhonesSectionTest() throws InterruptedException {
        verizon.prepaidPhonesSection();
        String expectedTitle = "Prepaid Smartphones | Verizon ";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(enabled = true)
    public void testingSelectDevicesSection() throws InterruptedException {
        verizon.selectDevicesSection();
        String expectedText = "Verizon: Wireless, Internet, TV and Phone Services | Official Site";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Results are not matching");
    }

    @Test(enabled = true)
    public void smartPhonesSection() throws InterruptedException {
        verizon.smartPhonesSection();
        String expectedText = "Smartphones - Buy The Top Cell Phones | Verizon";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Results are not matching");
    }

    @Test(enabled = true)
    public void otherPhonesTesting() throws InterruptedException {
        verizon.otherPhonesSection();
        String expectedText = "Other phones";
        String actualText = getTextByXpath(otherPones);
        Assert.assertEquals(actualText, expectedText, "Results is matching");
    }

    @Test(enabled = true)
    public void accessoriesSectionSectionTesting() throws InterruptedException {
        verizon.accessoriesSection();
        String expectedText = "Verizon: Wireless, Internet, TV and Phone Services | Official Site";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Results are not matching");
    }

    @Test(enabled = true)
    public void selectEspañolSection(){
      verizon.selectEspañolSection();
        String expectedText = "Verizon: Wireless, Languages , Services | Official Site";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Results are not matching");
    }

    @Test(enabled = true)
    public void accessoriesOverviewSectionTesting() throws InterruptedException {
        verizon.accessoriesOverviewSection();
        String expectedText = "Accessories overview";
        String actualText = getTextByXpath(accessoriesOverview);
        Assert.assertEquals(actualText, expectedText, "Results is matching");
    }

    @Test(enabled = true)
    public void appleLocatorTest() {
        verizon.appleLocator();
        String expectedTitle = "New Apple iPhone Release Date, Price, Features, & Reviews";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title did not match");
    }

    @Test(enabled = true)
    public void checkingTheOptionsTest() {
        verizon.checkingTheOptions();
        String expectedTitle = "Compare Apple iPads | New iPad (8th Gen) 10.2, Air, Pro & More | Verizon";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title did not match");
    }

    @Test(enabled = true)
    public void exploreOptionsTest() {
        verizon.exploreOptions();
        String expectedTitle = "Apple iPhone 12 Pro and Pro Max: 5G, Wide Camera | Verizon";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title did not match");
    }

    @Test(enabled = true)
    public void phonesSectionTesting() {
        verizon.phonesSection();
        String expectedTitle = "New Apple iPhone 12 and 12 mini: 5G, XDR Display ❘ Verizon";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title did not match");
    }

    @Test(enabled = true)
    public void exploreAccessoriesTesting() {
        verizon.exploreAccessories();
        String expectedTitle = "New Apple iPhone Release Date, Price, Features, & Reviews";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title did not match");
    }

    @Test(enabled = true)
    public void SamsungLocatorTest() {
        verizon.SamsungLocator();
        String expectedTitle = "Samsung Galaxy Phones, Tablets, & Watches";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title did not match");
    }

    @Test(enabled = true)
    public void lGLocatorTest() {
        verizon.lGLocator();
        String expectedTitle = "LG 5G & Value Phones, Accessories, Comparisons & More - Verizon";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title did not match");
    }

    @Test(enabled = true)
    public void motorolaLocatorTest() {
        verizon.motorolaLocator();
        String expectedTitle = "Motorola | Shop the Latest 5G Devices, Foldable Phones & More - Verizon";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title did not match");
    }

    @Test(enabled = true)
    public void iPadLocatorSectionTesting() {
        verizon.iPadLocatorSection();
        String expectedText = "iPad";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title did not match");
    }

    @Test(enabled = true)
    public void checkingIphoneSectionTest() throws InterruptedException {
        verizon.checkingIphoneSection();
        String expectedText = "Latest iPhone 11 Specifications & Features. Buy Today";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title did not match");
    }

    @Test(enabled = true)
    public void performingTheFunctionalityOfAppleWatchSeries6Testing() throws InterruptedException {
        verizon.performingTheFunctionalityOfAppleWatchSeries6();
        String expectedText = "New Apple Watch Series 6, Shop Now at Verizon";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title did not match");
    }

    @Test(enabled = true)
    public void checkingAppleWatchTesting() throws InterruptedException {
        verizon.checkingAppleWatch();
        String expectedText = "New Apple Watch Series 6, Shop Now at Verizon";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title did not match");
    }

    @Test(enabled = true)
    public void checkingIphoneSection1Test() throws InterruptedException {
        verizon.checkingIphoneSection1();
        String expectedText = "New Apple iPhone 11 Pro & iPhone 11 Pro Max. Buy Now";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title did not match");
    }

    @Test(enabled = true)
    public void IphoneSection2Testing() throws InterruptedException {
        verizon.IphoneSection2();
        String expectedText = "2020 iPad Pro 11-inch & 12.9-inch. Shop Now at Verizon";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title did not match");
    }

    @Test(enabled = true)
    public void checkingIpadPerformanceTest() throws InterruptedException {
        verizon.checkingIpadPerformance();
        String expectedText = "Shop the new iPad Air (4th Gen), Verizon, Available Soon";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title did not match");
    }

    @Test(enabled = true)
    public void searchBoxTesting() throws InterruptedException, IOException {
        verizon.searchBox();
        String expectedText = "\"Mask\"";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text did not match");
    }

    @Test(enabled = true)
    public void performingTheFunctionalityOfAppleWatchSETesting() throws InterruptedException {
        verizon.performingTheFunctionalityOfAppleWatchSE();
        String expectedText = "Shop the new Apple Watch SE, Verizon, Available Soon";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title did not match");
    }

    }
//    @Test
//    public void planSectionTest() throws InterruptedException {
//        verizon.planSection();
//        String expectedTitle = "verizon news";
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
//    }

//    @Test
//    public void solutionsSectionTest() throws InterruptedException {
//        verizon.solutionsSection();
//        String expectedTitle = "verizon news";
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
//
//    }
//    @Test
//    public void resourcesSectionTest() throws InterruptedException {
//        verizon.resourcesSection();
//        String expectedTitle = "verizon news";
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
//
//    }
//
//    @Ignore
//    @Test
//    public void contactUsSectionTest() throws InterruptedException {
//        verizon.contactUsSection();
//        String expectedTitle = "verizon news";
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
//
//    }
//
//    @Test
//    public void clickOnHealthCreTest() throws InterruptedException {
//        verizon.clickOnHealthCareSection();
//        String expectedTitle = "verizon news";
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
//
//    }
//
//    @Test
//    public void tabletsSectionTest() throws InterruptedException {
//        verizon.tabletsSection();
//        String expectedTitle = "verizon news";
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
//
//    }
//    @Test
//    public void storesSectionTest() throws InterruptedException {
//        verizon.storesSection();
//        String expectedTitle = "verizon news";
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
//
//    }













