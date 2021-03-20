package sample;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static sample.GeicoWebElement.*;

public class GeicoHomePage extends WebAPI {

    @FindBy(xpath = GeicoZipCode)
    public WebElement geicozipcode;
    @FindBy(xpath = GeicoZipCodeSubmitbutton)
    public WebElement geicoZipcodeSubmiButton;
    @FindBy(xpath = infoTab)
    public WebElement infotab;
    @FindBy(xpath = autoInsuranceText)
    public WebElement autoinsurancegettext;
    @FindBy(xpath = webandMobile)
    public WebElement webandmobile;
    @FindBy(xpath = geicoMobileApp)
    public WebElement geicomobileapp;
 @FindBy(xpath = MobileAppTab)
    public WebElement mobileapptab;


    public void Geicozipcode() throws InterruptedException {
        geicozipcode.sendKeys(zipcode);
        Thread.sleep(5000);
        geicoZipcodeSubmiButton.click();
        Thread.sleep(5000);
        navigateForward();
        Thread.sleep(6000);
        autoinsurancegettext.getText();

    }

    public void infoTab() throws InterruptedException {
        infotab.click();
    }


    public void infoTabMobileapp() throws InterruptedException {
        infoTab();
        webandmobile.click();
        Thread.sleep(5000);
        geicomobileapp.click();

    }

    public void mobileApp() throws InterruptedException {
        infoTabMobileapp();
        Thread.sleep(5000);
        geicomobileapp.click();
        Thread.sleep(5000);
        mobileapptab.click();

    }
}
