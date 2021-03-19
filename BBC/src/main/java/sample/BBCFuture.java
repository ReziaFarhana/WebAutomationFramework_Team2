package sample;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static sample.BBCFutureWebElements.*;


public class BBCFuture extends WebAPI {


    @FindBy(how = How.XPATH, using = FutureTab)
    public WebElement FutureTab1;
    @FindBy(how = How.XPATH, using = WhatIsBBCFuture)
    public WebElement WhatIsBBC;
    @FindBy(how = How.XPATH, using = BBCMore)
    public WebElement BBCmor;
    @FindBy(how = How.XPATH, using = BBCMoreWhatisBBCFuture)
    public WebElement BBCmorewhatisbbcFuture;
    @FindBy(xpath = BBCMoreGetText)
    public WebElement BBCMoreGetText1;
    @FindBy(xpath = FollowTheFoodTab)
    public WebElement FollowTheFoodta;
    @FindBy(xpath = FollowTheFood)
    public WebElement followthefood;

    public void FutureTab() {
        FutureTab1.click();
    }


    public void WhatIsBBC() {
        WhatIsBBC.click();
    }


    public void BBCMoretab() throws InterruptedException {
        FutureTab1.click();
        sleepFor(10);
        BBCmor.click();
        Thread.sleep(2000);

    }


    public void BBCMoreWhatIsBBCFuture() throws InterruptedException {
        FutureTab1.click();
        sleepFor(10);
        BBCmor.click();
        Thread.sleep(2000);
        BBCmorewhatisbbcFuture.click();
        sleepFor(20);
    }


    public void BBCMoreWhatIsBBCGetText() throws InterruptedException {
        FutureTab1.click();
        sleepFor(10);
        BBCmor.click();
        Thread.sleep(2000);
        BBCmorewhatisbbcFuture.click();
        sleepFor(20);
        BBCMoreGetText1.getText();
    }

    public void FollowTheFoodTab() throws InterruptedException {

        FutureTab1.click();
        sleepFor(10);
        FollowTheFoodta.click();
        Thread.sleep(2000);


    }

    public void FollowTheFood() throws InterruptedException {

        FutureTab1.click();
        sleepFor(10);
        FollowTheFoodta.click();
        Thread.sleep(2000);
        followthefood.click();
        sleepFor(10);
    }
    //Home Page***********************************

    @FindBy(xpath = BBCHomeTab)
    public WebElement bbchome;
    @FindBy(xpath = BBCHomePageWeather)
    public WebElement bbchomepageweather;
    @FindBy(xpath = BBCSignIn)
    public WebElement BBCsignin;
    @FindBy(xpath = Password)
    public WebElement password;
    @FindBy(xpath = Email)
    public WebElement email;
    @FindBy(xpath = BBCSignIn)
    public WebElement signinbuttom;


    public void homePage() throws InterruptedException {
        bbchome.click();
        wait(10);
//        bbchomepageweather.click();
//        Thread.sleep(5000);
//


    }

    public void BBCSignIn() throws InterruptedException {
        BBCsignin.click();

    }



   /* public void signIn() throws InterruptedException {
        BBCSignIn();
        email.sendKeys("maria@gmail.com");
        wait(4000);
        password.sendKeys("jaxbcjsz" );
        wait(4000);
        signinbuttom.click();
        wait(40);
        }*/





    }




