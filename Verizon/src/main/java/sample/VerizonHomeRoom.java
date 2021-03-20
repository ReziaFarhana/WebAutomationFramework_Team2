package sample;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static sample.VerizonWebElement.*;

public class VerizonHomeRoom extends WebAPI {

    @FindBy(xpath = HomeInternet) public WebElement homeinternet;
    @FindBy(xpath = HomeInternetAvailibility) public WebElement homeinternetavailibilty;
    @FindBy(xpath = HomeInternetZipCodeTab) public WebElement homezip;
    @FindBy(xpath = HomeInternetEmailCodeTab) public WebElement HomeInEmail;
    @FindBy(xpath = HomeInternetAvailibility) public WebElement HomeInCh;
    @FindBy(xpath = fiveGHomeInternet) public WebElement fiveG;
    @FindBy(xpath = ChatTab) public WebElement chattab;
    @FindBy(xpath = ChatTabGetText) public WebElement ChatTbGetText;
    @FindBy(xpath = languageSwitch) public WebElement lswitch;
 @FindBy(xpath = languageSwitch2) public WebElement lswitch2;


    public void HomeInternet() {
        homeinternet.click();
        homeinternetavailibilty.click();
    }

    public void homeInternetAva() {
        HomeInternet();
        homezip.sendKeys("19145");
        HomeInEmail.sendKeys("mariaamiar89@gmail.com");


    }

    public void fiveGhomeInternet() {
        HomeInternet();
        fiveG.getText();
    }


    public void ChatTab() {
        HomeInternet();
        chattab.click();
    }

    public void ChatTabGetText() {
        HomeInternet();
        chattab.click();
        ChatTbGetText.getText();

    }
    public void lgeSwitch() throws InterruptedException {
    lswitch.click();
    Thread.sleep(5000);
    lswitch2.click();
    Thread.sleep(5000);



    }


}