package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElements.*;

public class HomePage extends WebAPI {

    @FindBy(how= How.ID, using=otherPhonesID) public WebElement otherPhones;
    @FindBy(how= How.ID, using=accessoriesID) public WebElement accessories;

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

    public void select5GPhone() throws InterruptedException {
        selectDevices();
        clickById(gphoneID);
    }
    public void selectPrepaidPhone() throws InterruptedException {
        selectDevices();
        scrollByID(prepaidPhoneID);
    }
    public void selectBasicPhones() throws InterruptedException {
        selectDevices();
        scrollByID(otherPhonesID);
        clickById(basicPhonesID);
    }

    public void selectAccessories() throws InterruptedException {
        selectDevices();
        hoverOver(driver,accessories);
        clickById(accessoriesOverviewID);
    }
    public void selectFeatures() throws InterruptedException {
        selectShop();
        sleepFor(3);
        scrollByID(featuresID);
    }
    public void select5GNationWide() throws InterruptedException {
        selectFeatures();
        clickById(gNationWideID);
    }
    public void selectPlans() throws InterruptedException {
        selectShop();
        sleepFor(3);
        scrollByID(plansID);
    }
    public void selectPrepaid() throws InterruptedException {
        selectPlans();
        scrollByID(prepaidID);
    }
    public void selectHome() throws InterruptedException {
        selectShop();
        sleepFor(3);
        scrollByID(homeID);
    }
    public void selectMoving() throws InterruptedException {
        selectHome();
        clickById(movingID);
    }
    public void selectEntertainment() throws InterruptedException {
        selectShop();
        sleepFor(3);
        scrollByID(entertainmentID);
    }
    public void selectDisney() throws InterruptedException {
        selectEntertainment();
        clickById(disneyID);
    }
    public void selectDeals() throws InterruptedException {
        selectShop();
        sleepFor(3);
        scrollByID(dealsID);
    }
    public void selectPhones() throws InterruptedException {
        selectDeals();
        clickById(phonesID);
    }
}
