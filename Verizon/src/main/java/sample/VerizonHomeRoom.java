package sample;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
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
    @FindBy(css = connectedDevices)
    public WebElement connectedDevices1;
    @FindBy(css = shop)
    public WebElement shop1;
    @FindBy(how = How.XPATH, using = searchBoxLocator)
    public WebElement searchBox;
    @FindBy(how = How.CSS, using = searchButtonLocator)
    public WebElement searchButton;
    @FindBy(how = How.LINK_TEXT, using = samsungLocator)
    public WebElement SamsungLocate;
    @FindBy(how = How.LINK_TEXT, using = lGLocator)
    public WebElement LGLocate;
    @FindBy(how = How.LINK_TEXT, using = motorolaLocator)
    public WebElement motorolaLocate;
    @FindBy(how = How.LINK_TEXT, using = appleLocator)
    public WebElement appleLocate;
    @FindBy(how = How.LINK_TEXT, using = iPadLocator)
    public WebElement iPadLoc;
    @FindBy(how = How.XPATH, using = compareTab)
    public WebElement compare;
    @FindBy(how = How.XPATH, using = exploreTab)
    public WebElement explore;
    @FindBy(how = How.XPATH, using = iphone12ProLocator)
    public WebElement iphone12Pro;
    @FindBy(how = How.XPATH, using = iphone12Locator)
    public WebElement iphone12;
    @FindBy(how = How.XPATH, using = iphone11Locator)
    public WebElement iphone11;
    @FindBy(how = How.XPATH, using = compareOptions)
    public WebElement compareOption;
    @FindBy(how = How.XPATH, using = accessoriesLocator)
    public WebElement accessories1;

    @FindBy(how = How.XPATH, using = iPhone11ProLocator)
    public WebElement iPhone11Pro;
    @FindBy(how = How.XPATH, using = iPadProLocator)
    public WebElement iPadPro;
    @FindBy(how = How.XPATH, using = iPadAirLocator)
    public WebElement iPadAir;
    @FindBy(how = How.XPATH, using = appleWatchSeries6Locator)
    public WebElement appleWatchSeries6;
    @FindBy(how = How.XPATH, using = appleWatchSELocator)
    public WebElement appleWatchSE;


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


    public void checkingAppleWatch() throws InterruptedException {
        appleLocator();
        sleepFor(2);
        hoverAndClick(driver, explore, appleWatchSeries6);
    }

    public void topDeviceBrandsSection() throws InterruptedException {
        clickOnElement(topDeviceBrands);
        sleepFor(2);
    }

    public void appleSection() {
        clickByXpath(apple);
    }

    public void personalSection() throws InterruptedException {
        clickByXpath(personal);
        sleepFor(2);
    }

    public void selectShopSection() {
        clickByXpath(shopping);
        waitTimeExplicit(shopping);
    }

    public void performingTheFunctionalityOfAppleWatchSeries6() throws InterruptedException {
        appleLocator();
        sleepFor(2);
        hoverAndClick(driver, explore, appleWatchSeries6);
    }

    public void selectShopAllSection() throws InterruptedException {
        selectShopSection();
        sleepFor(2);
        clickById(shopAll);
    }

    public void checkingIphoneSection1() throws InterruptedException {
        appleLocator();
        sleepFor(2);
        hoverAndClick(driver, explore, iPhone11Pro);
    }

    public void selectDevicesSection() throws InterruptedException {
        selectShopSection();
        sleepFor(2);
        clickOnElement(devices);
    }

    public void IphoneSection2() throws InterruptedException {
        appleLocator();
        sleepFor(2);
        hoverAndClick(driver, explore, iPadPro);
    }

    public void smartPhonesSection() throws InterruptedException {
        selectDevicesSection();
        sleepFor(2);
        clickOnElement(smartPhones);
        // scrollTO(smartPhones);
    }

    public void goToGPhonesSection() throws InterruptedException {
        selectDevicesSection();
        clickById(getGphones);
    }

    public void checkingIphoneSection() throws InterruptedException {
        appleLocator();
        sleepFor(2);
        hoverAndClick(driver, explore, iphone11);
    }

    public void prepaidPhonesSection() throws InterruptedException {
        selectDevicesSection();
        //clickById(getGPhones);
        sleepFor(3);
        // scrollTO(prepaidPhones);
        clickByCss(prepaidPhones);
    }

    public void checkingIpadPerformance() throws InterruptedException {
        appleLocator();
        sleepFor(2);
        hoverAndClick(driver, explore, iPadAir);
    }

    public void otherPhonesSection() throws InterruptedException {
        selectDevicesSection();
        sleepFor(3);
        clickOnElement(otherPones);
    }

    public void searchBox() throws InterruptedException, IOException {
        searchBox.sendKeys(productName);
        sleepFor(2);
        searchBox.click();
    }

    public void accessoriesSection() throws InterruptedException {
        selectDevicesSection();
        waitTimeUsingFluent(accessories);
        clickByCss(accessories);
    }

    public void accessoriesOverviewSection() throws InterruptedException {
        selectDevicesSection();
        waitTimeUsingFluent(accessories);
        clickByCss(accessories);
        mouseHoverByXpath(accessoriesOverview);
        sleepFor(3);
    }

    public void checkingTheOptions() {
        appleLocator();
        hoverAndClick(driver, compare, compareOption);
    }

    public void exploreAccessories() {
        appleLocator();
        hoverAndClick(driver, explore, accessories1);
    }

    public void exploreOptions() {
        appleLocator();
        hoverAndClick(driver, explore, iphone12Pro);
    }

    public void appleLocator() {
        clickByLinkText(appleLocator);
    }

    public void iPadLocatorSection() {
        clickByLinkText(iPadLocator);

    }

    public void phonesSection() {
        appleLocator();
        hoverAndClick(driver, explore, iphone12);
    }

    public void supportSection() throws InterruptedException {
        clickOnElement(support);
        sleepFor(2);
    }

    public void SamsungLocator() {
        clickByLinkText(samsungLocator);
    }

    public void selectEspañolSection() {
        clickByCss(españolSection);
    }

    public void performingTheFunctionalityOfAppleWatchSE() throws InterruptedException {
        appleLocator();
        sleepFor(2);
        hoverAndClick(driver, explore, appleWatchSE);
    }

    public void lGLocator() {
        clickByLinkText(lGLocator);
    }

    public void motorolaLocator() {
        clickByLinkText(motorolaLocator);
    }
}
