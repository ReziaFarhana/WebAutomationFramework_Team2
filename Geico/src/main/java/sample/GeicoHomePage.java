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
    @FindBy(xpath = information)
    public WebElement information1;
    @FindBy(xpath = autoInsuranceText)
    public WebElement autoinsurancegettext;
    @FindBy(xpath = webandMobile)
    public WebElement webandmobile;
    @FindBy(xpath = geicoMobileApp)
    public WebElement geicomobileapp;
    @FindBy(xpath = MobileAppText)
    public WebElement MobileAppText1;
    @FindBy(xpath = webandMobileTitle)
    public WebElement webandMobileTitle1;
    @FindBy(xpath = expressServices)
    public WebElement expressServices1;
    @FindBy(xpath = expressServicesText)
    public WebElement expressServicesText1;
    @FindBy(xpath = amazonAlexa)
    public WebElement amazonAlexa1;
    @FindBy(xpath = amazonAlexaText)
    public WebElement amazonAlexaText1;
    @FindBy(xpath = geicoLiving)
    public WebElement geicoLiving1;
    @FindBy(xpath = geicoLivingtext)
    public WebElement geicoLivingtext1;
    @FindBy(xpath = socialMedia)
    public WebElement socialMedia1;
    @FindBy(xpath = socialMediaText)
    public WebElement socialMediaText1;
    @FindBy(css = geicoFacebook)
    public WebElement geicoFacebook1;
    @FindBy(css = geicoFacebookText)
    public WebElement geicoFacebookText1;
    @FindBy(css = geicoTweeter)
    public WebElement geicoTweeter1;
    @FindBy(xpath = Questions)
    public WebElement Questions1;
    @FindBy(css = contactUs)
    public WebElement contactUs1;
    @FindBy(css = Continue)
    public WebElement Continue1;

    public void Geicozipcode() throws InterruptedException {
        geicozipcode.sendKeys(zipcode);
        Thread.sleep(5000);
        geicoZipcodeSubmiButton.click();
        Thread.sleep(5000);
        navigateForward();
        Thread.sleep(6000);
        autoinsurancegettext.getText();

    }

    public void infoTabMobileapp() throws InterruptedException {
        information1.click();
        webandmobile.click();
        Thread.sleep(5000);
    }

    public void mobileApp() throws InterruptedException {
        infoTabMobileapp();
        geicomobileapp.click();
        Thread.sleep(5000);

    }

    public void ExpressServices() throws InterruptedException {
        infoTabMobileapp();
        expressServices1.click();
    }


    public void amazonAlexa() throws InterruptedException {
        infoTabMobileapp();
        amazonAlexa1.click();
    }


    public void geicoLiving() throws InterruptedException {
        infoTabMobileapp();
        geicoLiving1.click();
    }

    public void SocialMedia() throws InterruptedException {
        infoTabMobileapp();
        socialMedia1.click();
    }

    public void geicoFacebook() throws InterruptedException {
        infoTabMobileapp();
        socialMedia1.click();
        geicoFacebook1.click();
    }

    public void geicoContactUs() throws InterruptedException {
        information1.click();
        Thread.sleep(5000);
        contactUs1.click();
        clickByXpath(Quotes);
      Thread.sleep(2000);


    }


}
