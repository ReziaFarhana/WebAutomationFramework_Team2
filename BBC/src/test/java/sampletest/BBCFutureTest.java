package sampletest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import sample.BBCFuture;

public class BBCFutureTest extends WebAPI {

    BBCFuture bbcFuture;

    @BeforeMethod
    public void getInit() {
        bbcFuture = PageFactory.initElements(driver, BBCFuture.class);

    }

    @Test(priority = 1)
    @Ignore
    public void testFutureTab() {
        bbcFuture.FutureTab();
        String exResult = ".st0{fill:#FFFFFF;}";
        String acResult = bbcFuture.future1.getText();
        Assert.assertEquals(acResult, exResult, "Text not found ");

    }


    @Test(priority = 2)
    @Ignore
    public void testFutureTab1() {
        bbcFuture.FutureTab();
        String exResult = "Home - BBC Future";
        String acResult = driver.getTitle();
        Assert.assertEquals(acResult, exResult, "Text not found ");
    }

    @Test(priority = 3)
    @Ignore
    public void testWhatIsBBCFuture() throws InterruptedException {
        bbcFuture.FutureTab();
        Thread.sleep(300);
        bbcFuture.WhatIsBBC();
        Thread.sleep(500);
        String exResult = "What is BBC Future? - BBC Future";
        String acResult = driver.getTitle();
        Assert.assertEquals(acResult, exResult, "Text not found ");

    }

    @Test(priority = 4)
    @Ignore
    public void testBBCMore() throws InterruptedException {
        bbcFuture.BBCMoretab();
        String exResult = "Home - BBC Future";
        String acResult = driver.getTitle();
        Assert.assertEquals(acResult, exResult, "Text not found ");

    }


    @Test(priority = 5)
    @Ignore
    public void testBBCMoreFutureWhatIsBBC() throws InterruptedException {
        bbcFuture.BBCMoreWhatIsBBCFuture();
        String exResult = "Home - BBC Future";
        String acResult = driver.getTitle();
        Assert.assertEquals(acResult, exResult, "Text not found ");
    }


    @Test(priority = 6)
    @Ignore
    public void testBBCMoreFutureGetText() throws InterruptedException {
        bbcFuture.BBCMoreWhatIsBBCGetText();
        String exResult = "We believe in truth, facts, and science. We take the time to think. And we don't accept — we ask why.";
        String acResult = bbcFuture.BBCMoreGetText1.getText();
        Assert.assertEquals(acResult, exResult, "Text not found ");

    }

    @Test(priority = 7)
    @Ignore
    public void testFollowTheFoodTab() throws InterruptedException {
        bbcFuture.FollowTheFoodTab();
        String exResult = "Follow the Food";
        String acResult = driver.getTitle();
        Assert.assertEquals(acResult, exResult, "Text not found ");

    }

    @Test(priority = 8)
    @Ignore
    public void testFollowTheFood() throws InterruptedException {
        bbcFuture.FollowTheFood();
        String exResult = "Follow the Food";
        String acResult = driver.getTitle();
        Assert.assertEquals(acResult, exResult, "Text not found ");
    }


    @Test(priority = 9)
    @Ignore
    public void TestBBCHome() throws InterruptedException {
        bbcFuture.homePage();
        String exResult = "Follow the Food";
        String acResult = driver.getTitle();
        Assert.assertEquals(acResult, exResult, "Text not found ");

    }

    @Test(priority = 10)
    @Ignore
    public void testBBCSignIn() throws InterruptedException {
        bbcFuture.BBCSignIn();
        String exResult = "Home - BBC Future";
        String acResult = driver.getTitle();
        Assert.assertEquals(acResult, exResult, "Text not found ");

    }

    @Test(priority = 11)
    @Ignore
    public void testInputField() throws InterruptedException {
        bbcFuture.typeOnInputField("Email", "mxzckjdshfusdhvdskj");
        String exResult = "Home - BBC Future";
        String acResult = driver.getTitle();
        Assert.assertEquals(acResult, exResult, "Text not found ");
    }


    @Test(priority = 12)
    @Ignore
    public void testFutureTabMenu() throws InterruptedException {
        bbcFuture.FutureTabMenu();
        String exResult = "What is BBC Future?";
        String acResult = bbcFuture.whatisbbcfuture1.getText();
        Assert.assertEquals(acResult, exResult, "test failed ");
    }

    @Test(priority = 13)
    @Ignore
    public void testFutureTabMenuBack() throws InterruptedException {
        bbcFuture.FutureTabMenuchange();
        String exResult = "Welcome to BBC.com";
        String acResult = bbcFuture.welcometobbc.getText();
        Assert.assertEquals(acResult, exResult, "test failed ");
    }

    @Test(priority = 14)
    @Ignore
    public void testMadeOnEarthTab() throws InterruptedException {
        bbcFuture.madeOnEarth();
        String exResult = "Made on Earth";
        String acResult = bbcFuture.madeonearthtitle.getText();
        Assert.assertEquals(acResult, exResult, "test failed ");
    }

    @Test(priority = 15)
    @Ignore
    public void testspaceTab() throws InterruptedException {
        bbcFuture.spacetab();
        String exResult = "Space";
        String acResult = driver.getTitle();
        Assert.assertEquals(acResult, exResult, "Text not found ");
    }


    @Test(priority = 16)
    @Ignore
    public void testSearch() throws InterruptedException {
        bbcFuture.searchButton();
        String exResult = "BBC - Search results for News";
        String acResult = driver.getTitle();
        Assert.assertEquals(acResult, exResult, "Text not found ");
    }

    @Test(priority = 17)
    @Ignore
    public void testMore() throws InterruptedException {
        bbcFuture.moreButton();
        String exResult = "Celeste wins BBC Music’s Sound of 2020 - BBC Culture";
        String acResult = driver.getTitle();
        Assert.assertEquals(acResult, exResult, "Text not found ");
    }

    @Test(priority = 18)
    @Ignore
    public void testMusicButton() throws InterruptedException {
        bbcFuture.musicButton();
        String exResult = "The 20 best songs of 2019 - BBC Culture";
        String acResult = driver.getTitle();
        Assert.assertEquals(acResult, exResult, "Text not found ");

    }

    @Test(priority = 19)
    @Ignore
    public void testTVButton() throws InterruptedException {
        bbcFuture.TVButton();
        String exResult = "BBC WORLD NEWS North America - Schedules";
        String acResult = driver.getTitle();
        Assert.assertEquals(acResult, exResult, "Text not found ");
    }


    @Test(priority = 20)
    public void testTVBBCnews() throws InterruptedException {
        bbcFuture.TVBBCNews();
        String exResult = "BBC World News - BBC World News, 06/04/2021 GMT";
        String acResult = driver.getTitle();
        Assert.assertEquals(acResult, exResult, "Text not found ");
    }


}