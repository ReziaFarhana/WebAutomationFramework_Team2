package homepagetest;

import common.WebAPI;
import homepage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static homepage.HomePageWebElements.*;

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

    public void productRecallsTest() throws InterruptedException {
        homepage.productRecallsOption();
        String expectedText = "Walmart Careers | Submit a Walmart Job Application Online";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text did not match");
    }

    public void accessibilityOptionTest(){
        homepage.accessibilityOption();
        String expectedText = "Responsible Disclosure and Accessibility Policies - Walmart.com";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");
    }

    public void trampolineOptionTest(){
        homepage.trampolineOption();
        String expectedText = "Trampolines - Walmart.com";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text did not match");
    }

    public void trampolinePageGiftElibileCheckBoxTest(){
        homepage.trampolinePageGiftElibileCheckBox();
        String expectedText ="Gift eligible";
        WebElement actualText = driver.findElement(By.xpath(giftEligibleResXp));
        Assert.assertEquals(actualText, expectedText, "Text does not match");
    }

    public void contactUSOptionTest(){
        homepage.contactUsOption();
        String expectedText ="https://www.walmart.com/help";
        String actualText =getCurrentPageUrl();
        Assert.assertEquals(actualText, expectedText, "Text not passed");
    }
    @Test
    public void walmartEBooksLogoTest(){
        homepage.walmartEBooksLogo();
        String expectedText ="Kobo has millions of eBooks. Sign up today and get a $5 acco";
        String actualText = getTextByClass(walmartEBookPagetitleClass);
        Assert.assertEquals(actualText, expectedText, "Text not match");
    }
    public void allswellLogoTest(){
        homepage.allsWellLogo();
        String expectedText="https://allswellhome.com/";
        String actualText = getCurrentUrl();
        Assert.assertEquals(actualText, expectedText, "Text not match");

    }
    public void feedBackButtonTest(){
        homepage.feedBackButton();
        String expectedText="Thank you!";
        String actualText =getTextByCss(thankYouMessageCss);
        Assert.assertEquals(actualText, expectedText, "Text does not match");
    }



}
