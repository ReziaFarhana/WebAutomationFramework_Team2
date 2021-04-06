package sampletest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import sample.VerizonHomeRoom;

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
}