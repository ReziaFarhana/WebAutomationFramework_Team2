package topdevicebrandsTest;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import topdevicebrands.Apple;

import static topdevicebrands.TopDeviceBrandsWebElements.*;

public class AppleTest extends WebAPI {
    Apple apple;

    @BeforeMethod
    public void getInit() {
        apple = PageFactory.initElements(driver, Apple.class);
    }

//    @Test
//    public void appleLocatorTest(){
//        apple.appleLocator();
//        String expectedTitle = "New Apple iPhone Release Date, Price, Features, & Reviews";
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(actualTitle,expectedTitle,"Title did not match");
//    }


    @Test
    public void iPhoneFinancingOptionsTest() {
        apple.iPhoneFinancingOptions();
        String expectedText = "Apple iPhone 12 Pro Max\n";
        String actualText = getTextByXpath(phoneTitle);
        Assert.assertEquals(actualText,expectedText,"Text did not match");
    }


}
