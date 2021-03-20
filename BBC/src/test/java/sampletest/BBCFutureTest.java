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

    @Test(enabled = true)

    public void testFutureTab() {
        //
        bbcFuture.FutureTab();

    }


    @Test(enabled = false)
    @Ignore
    public void testFutureTab1() {
        //getInit();
        bbcFuture.FutureTab();
    }

    @Test(priority = 1)
    @Ignore
    public void testWhatIsBBCFuture() throws InterruptedException {
        bbcFuture.FutureTab();
        Thread.sleep(300);
        bbcFuture.WhatIsBBC();
        Thread.sleep(500);
    }

    @Test
    @Ignore
    public void testBBCMore() throws InterruptedException {
        bbcFuture.BBCMoretab();

    }


    @Test
    @Ignore
    public void testBBCMoreFutureWhatIsBBC() throws InterruptedException {
        bbcFuture.BBCMoreWhatIsBBCFuture();

    }


    @Test
    @Ignore
    public void testBBCMoreFutureGetText() throws InterruptedException {
        bbcFuture.BBCMoreWhatIsBBCGetText();
        String exResult = "We believe in truth, facts, and science. We take the time to think. And we don't accept — we ask why.";
        String acResult = bbcFuture.BBCMoreGetText1.getText();
        Assert.assertEquals(acResult,exResult,"Text not found ");

    }

    @Test@Ignore
    public void testFollowTheFoodTab() throws InterruptedException {
        bbcFuture.FollowTheFoodTab();

    }

    @Test@Ignore
    public void testFollowTheFood() throws InterruptedException {
        bbcFuture.FollowTheFood();
    }


 //********************************************************************



    @Test
    public void TestBBCHome() throws InterruptedException {
        bbcFuture.homePage();

    }

    @Test@Ignore
    public void testBBCSignIn() throws InterruptedException {
        bbcFuture.BBCSignIn();

    }


//   @Test@Ignore
//    public void testBBCSignInInf() throws InterruptedException {
//        bbcFuture.signIn();
//    }




    @Test
    public void testInputField() throws InterruptedException {
        bbcFuture.typeOnInputField("Email", "mxzckjdshfusdhvdskj");




    }

}





