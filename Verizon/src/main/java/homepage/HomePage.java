package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElements.*;

public class HomePage extends WebAPI {

//    @FindBy(how= How.XPATH, using=rentersXp) public WebElement renters;

    public void selectShop(){
        clickByXpath(shopXp);
    }
    public void selectShopAll() throws InterruptedException {
        selectShop();
        sleepFor(3);
        clickById(shopAllID);
    }
    public void selectDevices() throws InterruptedException {
        selectShop();
        sleepFor(3);
       scrollByID(devicesID);

    }
    public void selectSmartPhones() throws InterruptedException {
        selectDevices();
        clickById(smartPhoneID);
    }
    public void selectFeatures() throws InterruptedException {
        selectShop();
        sleepFor(3);
        scrollByID(featuresID);
    }
    public void selectPlans() throws InterruptedException {
        selectShop();
        sleepFor(3);
        scrollByID(plansID);
    }
    public void selectHome() throws InterruptedException {
        selectShop();
        sleepFor(3);
        scrollByID(homeID);
    }
    public void selectEntertainment() throws InterruptedException {
        selectShop();
        sleepFor(3);
        scrollByID(entertainmentID);
    }
    public void selectDeals() throws InterruptedException {
        selectShop();
        sleepFor(3);
        scrollByID(dealsID);
    }
}
