package home_page;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static home_page.WalmartWebElement.*;

public class WalmartHome extends WebAPI {

//    @FindBy(xpath = allBenefitsOption)
//    WebElement benefit;

    @FindBy(xpath = benefitsLink)
    WebElement benefitLinkToHoverOn;

    @FindBy(xpath = allBenefitsOption)
    WebElement allBenefitsClick;

    @FindBy(css = mobileScanAndGo)
    WebElement mobileScanAndGoLink;



    // helper method to scroll down to the footer Walmart page
    public void scrollDown(){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,4000);");
    }

        // Method to click on Walmart+
    public void clickOnWalmartPlusLink(){
        scrollDown();
        clickByXpath(walmartPlusLink);
    }

    public void workingOnBenefitsSelection(){
        clickOnWalmartPlusLink();
        hoverAndClick(driver,benefitLinkToHoverOn,allBenefitsClick);
    }

    public void clickOnFreeShippingInBenefits(){
        workingOnBenefitsSelection();
        clickByCss(freeShippingInAllBenefits);
    }

    public void mobileScanAndGoInBenefits(){
        clickOnWalmartPlusLink();
        hoverAndClick(driver,benefitLinkToHoverOn,mobileScanAndGoLink);
    }

    public void clickOnGroceryPickupAndDelivery(){
        scrollDown();
        clickByXpath(groceryPickupAndDelivery);
    }






}
