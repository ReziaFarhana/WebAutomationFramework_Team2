package helpcenterpagetest;

import common.WebAPI;
import helpcenterpage.HelpCenter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static helpcenterpage.HelpCenterWebElements.*;

public class HelpCenterPageTest extends WebAPI {

    HelpCenter helpcenter;


    @BeforeMethod
    public void init(){
        helpcenter = PageFactory.initElements(driver, HelpCenter.class);
    }


    public void searchBoxHelpTest(){
        helpcenter.searchHelpBox();
        String expectedText = "Refunds";
        String actualText = getTextByXpath(refundsPageTextXPath);
        Assert.assertEquals(actualText,expectedText, "Text does not match");

    }


    public void frequentlyAskedQuestionsTest(){
    helpcenter.frequentlyAskedQuestions();
    String expectedText = frequentlyAskedQuestionsTitle;
    String actualText = driver.getTitle();
    Assert.assertEquals(actualText, expectedText, "Text does not match");
    }


    public void wheresMyOrderTest(){
        helpcenter.wheresMyOrder();
        String expectedText ="Where is my order?";
        String actualText = getTextById(wheresMyOrderId);
        Assert.assertEquals(actualText, expectedText, "Text does not match");
    }


    public void trackOrderButtonTest(){
        helpcenter.trackOrderButton();
        String expectedText = "Track your order";
        String actualText = getTextByCss(trackYourOrderTitleCSSSelector);
        Assert.assertEquals(actualText, expectedText, "Text does not match");
    }
    @Test
    public void trackOrderTest(){
        helpcenter.trackOrder();
        String expectedText ="Track your order";
        String actualText = getTextByCss(trackOrderPageTitleCssSelector);
        Assert.assertEquals(actualText, expectedText, "Text does not match");
    }

}
