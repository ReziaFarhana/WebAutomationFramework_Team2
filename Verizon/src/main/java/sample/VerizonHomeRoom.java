package sample;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.SimpleDateFormat;
import java.util.Date;

import static sample.VerizonWebElement.*;

public class VerizonHomeRoom extends WebAPI {

    @FindBy(xpath = HomeInternet)
    public WebElement homeinternet;
    @FindBy(xpath = HomeInternetAvailibility)
    public WebElement homeinternetavailibilty;
    @FindBy(xpath = HomeInternetZipCodeTab)
    public WebElement homezip;
    @FindBy(xpath = HomeInternetEmailCodeTab)
    public WebElement HomeInEmail;
    @FindBy(xpath = HomeInternetAvailibility)
    public WebElement HomeInCh;
    @FindBy(xpath = fiveGHomeInternet)
    public WebElement fiveG;
    @FindBy(xpath = ChatTab)
    public WebElement chattab;
    @FindBy(xpath = ChatTabGetText)
    public WebElement ChatTbGetText;
    @FindBy(xpath = languageSwitch)
    public WebElement lswitch;
    @FindBy(xpath = languageSwitch2)
    public WebElement lswitch2;
    @FindBy(xpath = HomeInternetShop)
    public WebElement HomeInternetShop1;
    @FindBy(xpath = SignIn)
    public WebElement SignIn1;
    @FindBy(xpath = MyAccount)
    public WebElement MyAccount1;
    @FindBy(xpath = Register)
    public WebElement Register1;
    @FindBy(xpath = inHome)
    public WebElement inHome1;
    @FindBy(xpath = ID)
    public WebElement ID1;
    @FindBy(xpath = Password)
    public WebElement Password1;
    @FindBy(xpath = registeration)
    public WebElement registeration1;
    @FindBy(xpath = InHome)
    public WebElement InHome1;
    @FindBy(xpath = Continue)
    public WebElement Continue1;
    @FindBy(xpath = SelectMethod)
    public WebElement SelectMethod1;
    @FindBy(xpath = stores)
    public WebElement stores1;
    @FindBy(xpath = findStore)
    public WebElement findStore1;
    @FindBy(xpath = Plans)
    public WebElement Plans1;
    @FindBy(css= connectedDevices)
    public WebElement connectedDevices1;
 @FindBy(css = shop)
    public WebElement shop1;


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

    public void HomeInternetshop() throws InterruptedException {
        homeinternet.click();
        sleepFor(5);
        HomeInternetShop1.click();
    }

    public void getCurrentTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        System.out.println(" my test suite started at this time --> " + formatter.format(date));
    }

    public void Login() throws InterruptedException {
        SignIn1.click();
        Thread.sleep(1000);
        ID1.sendKeys("maria");
        Password1.sendKeys("******");

    }

    public void Registeration() throws InterruptedException {
        Login();
        registeration1.click();
        clickByXpath(InHome);
        Continue1.click();

    }

    public void HomeWindow() throws InterruptedException {
        Login();
        registeration1.click();
        clickByXpath(InHome);
        Continue1.click();
        goBackToHomeWindow();

    }

    public void stores() {
        stores1.click();
        typeByXpath(findStore, "New York");
    }

    public void plans() {
        Plans1.click();
        connectedDevices1.click();
       shop1.click();
    }
}
