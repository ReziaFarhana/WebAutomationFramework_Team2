package home_page;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static home_page.VerizonWebElement.*;

public class VerizonHome extends WebAPI {

    VerizonWebElement element;

    /**
     * Method to open a Shop option from Verizon main page
     * @throws InterruptedException
     */
    public void clickOnVerizonShopMenu() throws InterruptedException {
        clickByXpath(locatorToClickOnShop);
        sleepFor(2);
    }

    /**
     * Method to navigate to smartphones from shop menu
     * through Devices
     * @throws InterruptedException
     */
    public void clickOnDevicesInShopMenu() throws InterruptedException {
        clickOnVerizonShopMenu();
        clickByCss(locatorOfShop_Devices);
        sleepFor(3);
    }

    /**
     * Method to click on Smartphones which is located
     * Shop >> Devices >> Smartphones
     * @throws InterruptedException
     */
    public void clickOnSmartphones() throws InterruptedException {
        clickOnDevicesInShopMenu();
        clickByCss(locatorToFindSmartphonesOption);
        sleepFor(3);
    }

    /**
     * Method to click on apply filter button
     * @throws InterruptedException
     */
    public void applyFilterOnSmartphone() throws InterruptedException {
        clickOnSmartphones();
        clickByXpath(locatorToAddFilter);
      //  boolean displayed = isPopUpWindowDisplayed(driver,locatorToWorkOnPopup);
        sleepFor(3);
        if(isPopUpWindowDisplayed(driver,locatorToWorkOnPopup)){
            clickByXpath(locatorToClosePopup);
        }
    }
        @FindBy(xpath = locatorToSamsung) public WebElement samsung;

    public void selectSamsungBrand() throws InterruptedException {
        applyFilterOnSmartphone();
        clickByXpath(locatorToClickOnBrand);
        if(isItemDisplayed(findYourIdealPopup)){
            clickByXpath(clickOnNotNowlocator);
            scrollTo(samsung);
            clickByXpath(locatorToSamsung);
        }else {
            scrollTo(samsung);
            clickByXpath(locatorToSamsung);
        }
        sleepFor(2);
    }



}
