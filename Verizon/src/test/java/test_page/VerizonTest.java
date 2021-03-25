package test_page;

import common.WebAPI;
import home_page.VerizonHome;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static home_page.VerizonWebElement.*;

public class VerizonTest extends WebAPI {

    VerizonHome action;

    @BeforeMethod
    public void getInIt(){
        action = PageFactory.initElements(driver,VerizonHome.class);
    }

    @Test
    public void verifyLandingOnVerizonHomePage(){
        scrollToBottomPage();
        boolean found = driver.findElement(By.xpath(locatorToVerifyLogo)).isDisplayed();
        Assert.assertEquals(found,true,"Test failed");
    }

    @Test
    public void verifyShopLinkLaunched() throws InterruptedException {
        action.clickOnVerizonShopMenu();
        assertEqualBycssLocator(locatorToVerifyLoginToShop,"Shop");
    }

    @Test
    public void verifyClickOnDeviceOption() throws InterruptedException {
        action.clickOnDevicesInShopMenu();
        assertEqualBycssLocator(locatorToFindSmartphonesOption,"Smartphones");
    }

    @Test
    public void verifySmartphoneIsOpened() throws InterruptedException {
        action.clickOnSmartphones();
        String actualTitle = "Smartphones - Buy The Top Cell Phones | Verizon";
        String expected = driver.getTitle();
        Assert.assertEquals(actualTitle,expected,"Test failed");
    }

    @Test
    public void verifyFilterButtonIsSelected() throws InterruptedException {
        action.applyFilterOnSmartphone();
        boolean displayed = driver.findElement(By.xpath(locatorToVerifyFilter)).isDisplayed();
        Assert.assertEquals(displayed,true,"Test failed");
    }

    @Test
    public void verifySamsungBrandIsSelected() throws InterruptedException {
        action.selectSamsungBrand();
        String expected = "Samsung";
        String actual = driver.findElement(By.cssSelector(locatorToVerifyTheSelectedItemIsDisplayed)).getText();
        Assert.assertEquals(actual,expected,"Test faild");
    }
}
