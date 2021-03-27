package homepagetest;

import common.WebAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static homepage.HomePageWebElements.*;

public class HomePageTest extends WebAPI {

    HomePage homepage;

    @BeforeMethod
    public void init(){ homepage= PageFactory.initElements(driver, HomePage.class); }


    public void selectShopAllTest() throws InterruptedException {
        homepage.selectShopAll();
        String expectedText ="Shop Deals on Smartphones, Accessories, Devices & Plans | Verizon";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text not same");
    }

    public void selectSmartPhonesTest() throws InterruptedException {
        homepage.selectSmartPhones();
        String expectedText ="Smartphones - Buy The Top Cell Phones | Verizon";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text not same");
    }

    public void select5GPhoneTest() throws InterruptedException {
        homepage.select5GPhone();
        String expectedText ="5G Phones: 5G Ultra Wideband with a 5G Phone | Verizon";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text not same");
    }

    public void select5GNationWideTest() throws InterruptedException {
        homepage.select5GNationWide();
        String expectedText ="Verizon 5G: This is 5G Built Right | Verizon";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text not same");
    }

    public void selectPrepaidTest() throws InterruptedException {
        homepage.selectPrepaid();
        String expectedText ="Verizon Prepaid | Prepaid Phones, Plans, & Hotspot Devices";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text not same");
    }

    public void selectMovingTest() throws InterruptedException {
        homepage.selectMoving();
        String expectedText ="Moving Internet to a New Address or Switching to Verizon Fios";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text not same");
    }

    public void selectDisneyTest() throws InterruptedException {
        homepage.selectDisney();
        String expectedText ="Disney Plus: First Year, On Us. | Verizon Unlimited & 5G Home Internet";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text not same");
    }

    public void selectPhonesTest() throws InterruptedException {
        homepage.selectPhones();
        String expectedText ="Upgrade";
        String actualText=getTextByCss(phonesPageTextCss);
        Assert.assertEquals(actualText, expectedText, "Text not same");
    }

    public void selectPrepaidPhoneTest() throws InterruptedException {
        homepage.selectPrepaidPhone();
        String expectedText ="Prepaid Smartphones | Verizon";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text not same");
    }

    public void selectBasicPhonesTest() throws InterruptedException {
        homepage.selectBasicPhones();
        String expectedText ="Basic Phones | Verizon";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text not same");
    }

    public void selectAccessoriesTest() throws InterruptedException {
        homepage.selectAccessories();
        String expectedText ="Products, Apple, Fitbit, Samsung, Kate Spade & Under Armour";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text not same");
    }

    public void selectShopAllPlansTest() throws InterruptedException {
        homepage.selectShopAllPlans();
        String expectedText ="Unlimited Data, Talk & Text Prepaid and Family Wireless Plans";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text not same");
    }

    public void selectUnlimitedTest() throws InterruptedException {
        homepage.selectUnlimited();
        String expectedText ="Verizon Unlimited Data Plans for Talk & Text, Now with 5G";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text not same");
    }

    public void selectSharedDataTest() throws InterruptedException {
        homepage.selectSharedData();
        String expectedText ="Unlimited Data, Talk & Text Prepaid and Family Wireless Plans";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text not same");
    }

    public void selectConnectedDevicesTest() throws InterruptedException {
        homepage.selectConnectedDevices();
        String expectedText ="Connected Devices";
        String actualText= getTextByXpath("//a[normalize-space()='Connected Devices']");
        Assert.assertEquals(actualText, expectedText, "Text not same");
    }

    public void selectThoseWhoServeOverviewTest() throws InterruptedException {
        homepage.selectThoseWhoServeOverview();
        String expectedText ="Verizon Plan Discounts for those who serve: Teachers. Nurses, First Responders, Military & Veterans";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText,  expectedText, "Text not same");
    }

    public void selectTeacherPlanTest() throws InterruptedException {
        homepage.selectTeacherPlan();
        String expectedText ="Verizon Plan Discounts for Teachers & Their Families";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText,  expectedText, "Text not same");
    }

    public void selectNursePlanTest() throws InterruptedException {
        homepage.selectNursePlan();
        String expectedText ="Verizon Plan Discounts for Nurses & Their Families";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText,  expectedText, "Text not same");
    }

    public void selectFirstResponderTest() throws InterruptedException {
        homepage.selectFirstResponder();
        String expectedText ="Exclusive Discounts on Phones, Plans & Services For First Responders";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText,  expectedText, "Text not same");
    }

    public void selectKidsTest() throws InterruptedException {
        homepage.selectKids();
        String expectedText ="Just Kids Verizon Wireless Plans with Unlimited Talk & Text";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText,  expectedText, "Text not same");
    }

    public void selectStudentPlansTest() throws InterruptedException {
        homepage.selectStudentPlans();
        String expectedText ="Verizon Plan Discounts for Students";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText,  expectedText, "Text not same");
    }

    public void selectInternationalServicesTest() throws InterruptedException {
        homepage.selectInternationalServices();
        String expectedText ="International";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText,  expectedText, "Text not same");
    }

    public void selectConnectedCarTest() throws InterruptedException {
        homepage.selectConnectedCar();
        String expectedText ="Connected Car Mobile hotspot - Get WiFi for Ford, Toyota, Lexus, Lincoln & Volkswagen";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText,  expectedText, "Text not same");
    }
    @Test
    public void selectEmployeeDiscountTest() throws InterruptedException {
        homepage.selectEmployeeDiscount();
        String expectedText ="Discounts for Military, Government, Corporate Employees | Verizon Wireless";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText,  expectedText, "Text not same");
    }

    //TDD COMPLETE!


}
