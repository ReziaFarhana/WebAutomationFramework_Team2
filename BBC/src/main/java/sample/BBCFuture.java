package sample;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static sample.BBCFutureWebElements.*;


public class BBCFuture extends WebAPI {


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
    @FindBy(xpath = WhatIsBBCFuture1)
    public WebElement whatisbbcfuture1;


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


    public void signIn() throws InterruptedException {
        BBCSignIn();
        email.sendKeys("maria@gmail.com");
        wait(4000);
        password.sendKeys("jaxbcjsz");
        wait(4000);
        signinbuttom.click();
        wait(40);
    }

    // BBC future

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
    @FindBy(xpath = futureTab)
    public WebElement futuretab;
    @FindBy(xpath = futureTabMenu)
    public WebElement futuretabmenu;
    @FindBy(xpath = future)
    public WebElement future1;
    @FindBy(xpath = madeOnEarth)
    public WebElement madeonearth;
    @FindBy(xpath = WelcomeToBBC)
    public WebElement welcometobbc;
    @FindBy(xpath = roadToRecovery)
    public WebElement roadtorecovery;

     @FindBy(xpath = MadeOnEarthTitle)
    public WebElement madeonearthtitle;
    @FindBy(xpath = space)
    public WebElement space1 ;



    public void madeOnEarthTab() throws InterruptedException {
        FutureTabMenu();
    }


    public void FutureTabMenu() throws InterruptedException {
        futuretab.click();
        sleepFor(5);
        futuretabmenu.click();
    }

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


    public void FutureTabMenuchange() throws InterruptedException {
        futuretab.click();
        sleepFor(5);
        futuretabmenu.click();
        sleepFor(5);
        navigateBack();
        sleepFor(5);
    }




    public void madeOnEarth() throws InterruptedException {
       FutureTab();
       sleepFor(5);
       madeonearth.click();
       Thread.sleep(200);


    }


    public void spacetab() throws InterruptedException {
        FutureTab();
        sleepFor(5);
        space1.click();
        Thread.sleep(200);

}
}



