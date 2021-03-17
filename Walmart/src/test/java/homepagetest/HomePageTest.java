package homepagetest;

import common.WebAPI;
import homepage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static homepage.HomePageWebElements.helpcenterlocator;

public class HomePageTest extends WebAPI {

    HomePage homepage;

    @BeforeMethod
    public void init(){
        homepage = PageFactory.initElements(driver,HomePage.class);
    }


    public void helpCenterOptionTest(){
        homepage.helpCenterOption();
        String expectedText = "Help - Walmart.com";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Test failed");
    }
    @Test
    public void productRecallsTest() throws InterruptedException {
        homepage.productRecallsOption();
        String expectedText = "Walmart Careers | Submit a Walmart Job Application Online";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text did not match");
    }


}
