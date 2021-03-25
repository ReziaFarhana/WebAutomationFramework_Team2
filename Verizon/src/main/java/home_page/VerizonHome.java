package home_page;

import common.WebAPI;

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
        clickByCss(locatorToAddFilter);
      //  boolean displayed = isPopUpWindowDisplayed(driver,locatorToWorkOnPopup);
        if(isPopUpWindowDisplayed(driver,locatorToWorkOnPopup)){
            clickByCss(locatorToClosePopup);
        }
        sleepFor(3);
    }

    public void selectSamsungBrand() throws InterruptedException {
        applyFilterOnSmartphone();
        if(isPopUpWindowDisplayed(driver,locatorToSelectBrandSamsung)){
            clickByCss(locatorToSelectBrandSamsung);
            clickByCss(locatorToApplyTheSelectedProduct);
        }else {
            clickByXpath(locator);
            clickByCss(locatorToSelectBrandSamsung);
            clickByCss(locatorToApplyTheSelectedProduct);
        }
        sleepFor(2);
    }



}
