package sampletest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import sample.VerizonHomeRoom;
import java.io.IOException;

import static sample.VerizonWebElement.accessoriesOverview11;
import static sample.VerizonWebElement.otherPones11;

public class VerizonHomePageTest extends WebAPI {
    VerizonHomeRoom verizonhomeroom;

    @BeforeMethod
    public void getInit() {
        verizonhomeroom = PageFactory.initElements(driver, VerizonHomeRoom.class);
    }

    @Test(priority = 1)@Ignore
    public void testHomeInternet() {
        verizonhomeroom.HomeInternet();
        String expectedResult = "Ultra-Fast & Reliable Home Internet | Fios Internet | Verizon 5G";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Text Not found ");
    }

    @Test(priority = 2)@Ignore
    public void testhomeInternetAva() {
        verizonhomeroom.homeInternetAva();
        String expectedResult = "Ultra-Fast & Reliable Home Internet | Fios Internet | Verizon 5G";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Text Not found ");
    }


    @Test(priority = 3)@Ignore
    public void testfiveG() {
        verizonhomeroom.fiveGhomeInternet();
        String expectedResult = "Experience the power of Verizon 5G\n" +
                "Ultra Wideband. No data caps, no\n" +
                "annual contracts or extra fees.";
        String actualResult = verizonhomeroom.fiveG.getText();
        Assert.assertEquals(actualResult, expectedResult, "Text Not found ");
    }

    @Test(priority = 4)@Ignore
    public void testChatTab() {
        verizonhomeroom.ChatTab();
        String expectedResult = "Get a $100 Verizon Gift Card and discovery+ with your order today. Chat now to see if you qualify!";
        String actualResult = verizonhomeroom.ChatTbGetText.getText();
        Assert.assertEquals(actualResult, expectedResult, "Text Not found ");

    }

    @Test(priority = 5)@Ignore
    public void testLanguageSwitch() throws InterruptedException {
        verizonhomeroom.lgeSwitch();
        String expectedResult = "Verizon: Wireless, Internet, TV and Phone Services | Official Site";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Text Not found ");
    }

    @Test(priority=6)@Ignore
    public void testHomePageInternet() throws InterruptedException {
        verizonhomeroom.HomeInternetshop();
        verizonhomeroom.getCurrentTime();
        String expectedResult = "Verizon: Wireless, Internet, TV and Phone Services | Official Site";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Text Not found ");

    }
    @Test(priority=7)@Ignore
    public void testLogin() throws InterruptedException {
        verizonhomeroom.Login();
        String expectedResult = "My Verizon Log In, Sign in to your Verizon Wireless or Fios Account";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Text Not found ");
    }


    @Test(priority=8)@Ignore
    public void testRegistration() throws InterruptedException {
        verizonhomeroom.Registeration();
        String expectedResult = "Register My Account";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Text Not found ");

    }


    @Test(priority=9)@Ignore
    public void testHomepage() throws InterruptedException {
        verizonhomeroom.HomeWindow();
        verizonhomeroom.goBackToHomeWindow();
        String expectedResult = "Register My Account";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Text Not found ");

    }

    @Test(priority=10)@Ignore
    public void testStores(){
        verizonhomeroom.stores();
        String expectedResult ="Find & Locate Verizon Stores in Your Area | Verizon";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Text Not found ");
    }

    @Test(priority=11)
    public void ConnectedDevices(){
        verizonhomeroom.plans();

    }
    @Test(priority = 12)
    public void topDeviceBrandsSectionTest() throws InterruptedException {
        verizonhomeroom.topDeviceBrandsSection();
        String expectedTitle = "Verizon: Wireless, Internet, TV and Phone Services | Official Site";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(priority =13 )
    public void appleSectionTest() throws InterruptedException {
        verizonhomeroom.appleSection();
        String expectedTitle = "Verizon: Wireless, Internet, TV and Phone Services | Official Site";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(priority = 14)
    public void personalSectionTest() throws InterruptedException {
        verizonhomeroom.personalSection();
        String expectedTitle = "Verizon: Wireless, Internet, TV and Phone Services | Official Site";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(priority = 15)
    public void supportSectionTesting() throws InterruptedException {
        verizonhomeroom.supportSection();
        String expectedText = "Verizon: Wireless, Support, Services | ";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Results are not matching");
    }
    @Test(priority =16 )
    public void goToGPhonesSection() throws InterruptedException {
        verizonhomeroom.goToGPhonesSection();
        String expectedTitle = "5G Phones: 5G Ultra Wideband with a 5G Phone | Verizon";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(priority = 16)
    public void testingSelectShopAllSection() throws InterruptedException {
        verizonhomeroom.selectShopAllSection();
        String expectedTitle = "Shop Deals on Smartphones, Accessories, Devices & Plans | Verizon";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Results are not matching");
    }

    @Test(priority = 17)
    public void prepaidPhonesSectionTest() throws InterruptedException {
        verizonhomeroom.prepaidPhonesSection();
        String expectedTitle = "Prepaid Smartphones | Verizon ";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(priority = 18)
    public void testingSelectDevicesSection() throws InterruptedException {
        verizonhomeroom.selectDevicesSection();
        String expectedText = "Verizon: Wireless, Internet, TV and Phone Services | Official Site";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Results are not matching");
    }

    @Test(priority =19 )
    public void smartPhonesSection() throws InterruptedException {
        verizonhomeroom.smartPhonesSection();
        String expectedText = "Smartphones - Buy The Top Cell Phones | Verizon";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Results are not matching");
    }

    @Test(priority = 20)
    public void otherPhonesTesting() throws InterruptedException {
        verizonhomeroom.otherPhonesSection();
        String expectedText = "Other phones";
        String actualText = getTextByXpath(otherPones11);
        Assert.assertEquals(actualText, expectedText, "Results is matching");
    }

    @Test(priority =21 )
    public void accessoriesSectionSectionTesting() throws InterruptedException {
        verizonhomeroom.accessoriesSection();
        String expectedText = "Verizon: Wireless, Internet, TV and Phone Services | Official Site";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Results are not matching");
    }

    @Test(priority = 23)
    public void accessoriesOverviewSectionTesting() throws InterruptedException {
        verizonhomeroom.accessoriesOverviewSection();
        String expectedText = "Accessories overview";

        String actualText = getTextByXpath(accessoriesOverview11);
        Assert.assertEquals(actualText, expectedText, "Results is matching");
    }

    @Test(priority = 24)
    public void appleLocatorTest() {
        verizonhomeroom.appleLocator();
        String expectedTitle = "New Apple iPhone Release Date, Price, Features, & Reviews";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title did not match");
    }

    @Test(priority = 25)
    public void checkingTheOptionsTest() {
        verizonhomeroom.checkingTheOptions();
        String expectedTitle = "Compare Apple iPads | New iPad (8th Gen) 10.2, Air, Pro & More | Verizon";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title did not match");
    }

    @Test(priority = 26)
    public void exploreOptionsTest() {
        verizonhomeroom.exploreOptions();
        String expectedTitle = "Apple iPhone 12 Pro and Pro Max: 5G, Wide Camera | Verizon";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title did not match");
    }

    @Test(priority = 27 )
    public void phonesSectionTesting() {
        verizonhomeroom.phonesSection();
        String expectedTitle = "New Apple iPhone 12 and 12 mini: 5G, XDR Display ❘ Verizon";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title did not match");
    }

    @Test(priority = 28)
    public void exploreAccessoriesTesting() {
        verizonhomeroom.exploreAccessories();
        String expectedTitle = "New Apple iPhone Release Date, Price, Features, & Reviews";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title did not match");
    }

    @Test(priority = 29)
    public void SamsungLocatorTest() {
        verizonhomeroom.SamsungLocator();
        String expectedTitle = "Samsung Galaxy Phones, Tablets, & Watches";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title did not match");
    }

    @Test(priority = 30 )
    public void lGLocatorTest() {
        verizonhomeroom.lGLocator();
        String expectedTitle = "LG 5G & Value Phones, Accessories, Comparisons & More - Verizon";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title did not match");
    }

    @Test(priority = 31 )
    public void motorolaLocatorTest() {
        verizonhomeroom.motorolaLocator();
        String expectedTitle = "Motorola | Shop the Latest 5G Devices, Foldable Phones & More - Verizon";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title did not match");
    }

    @Test(priority =32 )
    public void iPadLocatorSectionTesting() {
        verizonhomeroom.iPadLocatorSection();
        String expectedText = "iPad";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title did not match");
    }

    @Test(priority = 33)
    public void checkingIphoneSectionTest() throws InterruptedException {
        verizonhomeroom.checkingIphoneSection();
        String expectedText = "Latest iPhone 11 Specifications & Features. Buy Today";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title did not match");
    }

    @Test(priority = 34)
    public void performingTheFunctionalityOfAppleWatchSeries6Testing() throws InterruptedException {
        verizonhomeroom.performingTheFunctionalityOfAppleWatchSeries6();
        String expectedText = "New Apple Watch Series 6, Shop Now at Verizon";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title did not match");
    }

    @Test(priority = 35)
    public void checkingAppleWatchTesting() throws InterruptedException {
        verizonhomeroom.checkingAppleWatch();
        String expectedText = "New Apple Watch Series 6, Shop Now at Verizon";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title did not match");
    }

    @Test(priority = 36)
    public void checkingIphoneSection1Test() throws InterruptedException {
        verizonhomeroom.checkingIphoneSection1();
        String expectedText = "New Apple iPhone 11 Pro & iPhone 11 Pro Max. Buy Now";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title did not match");
    }

    @Test(priority =37 )
    public void IphoneSection2Testing() throws InterruptedException {
        verizonhomeroom.IphoneSection2();
        String expectedText = "2020 iPad Pro 11-inch & 12.9-inch. Shop Now at Verizon";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title did not match");
    }

    @Test(priority = 38)
    public void checkingIpadPerformanceTest() throws InterruptedException {
        verizonhomeroom.checkingIpadPerformance();
        String expectedText = "Shop the new iPad Air (4th Gen), Verizon, Available Soon";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title did not match");
    }

    @Test(priority = 39)
    public void searchBoxTesting() throws InterruptedException, IOException {
        verizonhomeroom.searchBox();
        String expectedText = "\"Mask\"";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text did not match");
    }

    @Test(priority =40 )
    public void performingTheFunctionalityOfAppleWatchSETesting() throws InterruptedException {
        verizonhomeroom.performingTheFunctionalityOfAppleWatchSE();
        String expectedText = "Shop the new Apple Watch SE, Verizon, Available Soon";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Title did not match");
    }


}