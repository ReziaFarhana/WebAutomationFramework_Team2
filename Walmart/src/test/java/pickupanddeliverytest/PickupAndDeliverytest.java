package pickupanddeliverytest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pickanddelivery.PickupAndDelivery;

import static pickanddelivery.PickupAndDeliveryWebElement.*;

public class PickupAndDeliverytest extends WebAPI {

    PickupAndDelivery pickupAndDelivery;

    @BeforeMethod
    public void getInit(){
        pickupAndDelivery = PageFactory.initElements(driver,PickupAndDelivery.class);
    }

    @Test
    public void pickupAndDeliveryTabTest(){
        pickupAndDelivery.pickupAndDeliveryTab();
        String expectedText = "Let us do the shopping for you";
        String actualText = getTextByXpath(welcomeText);
        Assert.assertEquals(actualText,expectedText,"Text did not match");
    }


    @Test
    public void quickIntroTest() throws InterruptedException {
        pickupAndDelivery.quickIntro();
        String expectedText = "Walmart Grocery";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Text did not match");
    }

    @Test
    public void pickupFromTest() throws InterruptedException {
        pickupAndDelivery.pickupFrom();
        String expectedText = "Walmart Germantown Store,";
        String actualText = getTextByXpath(changedAddress);
        Assert.assertEquals(actualText,expectedText,"Text did not match");
    }

    @Test
    public void learnMoreLinkTest() throws InterruptedException {
        pickupAndDelivery.learnMoreLink();
        String expectedText = "Express deilvery";
        String actualText = getTextByXpath(title);
        Assert.assertEquals(actualText,expectedText,"Text did not match");
    }


















}
