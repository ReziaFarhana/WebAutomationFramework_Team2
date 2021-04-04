package sampletest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sample.VerizonHomeRoom;

public class VerizonHomePageTest extends WebAPI {

    VerizonHomeRoom verizonhomeroom;

    @BeforeMethod
    public void getInit() {
        verizonhomeroom = PageFactory.initElements(driver, VerizonHomeRoom.class);
    }


    @Test(priority = 1)
    public void testHomeInternet() {
        verizonhomeroom.HomeInternet();

    }

    @Test(priority = 2)
    public void testhomeInternetAva() {
        verizonhomeroom.homeInternetAva();

    }


    @Test(priority = 3)
    public void testfiveG() {
        verizonhomeroom.fiveGhomeInternet();
        String expectedResult="Experience the power of Verizon 5G\n" +
                "Ultra Wideband. No data caps, no\n" +
                "annual contracts or extra fees.";
        String actualResult=   verizonhomeroom.fiveG.getText();
        Assert.assertEquals(actualResult,expectedResult,"Text Not found ");
    }

    @Test(priority = 4)
    public void testChatTab(){
        verizonhomeroom.ChatTab();
        String expectedResult="Get a $100 Verizon Gift Card and discovery+ with your order today. Chat now to see if you qualify!";
        String actualResult=   verizonhomeroom.ChatTbGetText.getText();
        Assert.assertEquals(actualResult,expectedResult,"Text Not found ");

    }
        @Test(priority = 5)
        public void testLanguageSwitch() throws InterruptedException {
        verizonhomeroom.lgeSwitch();
        String expectedResult="English";
        String actualResult=   verizonhomeroom.lswitch2.getText();
        Assert.assertEquals(actualResult,expectedResult,"Text Not found ");
}

    }
