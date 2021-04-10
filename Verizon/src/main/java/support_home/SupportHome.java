package support_home;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static support_home.SupportHomeWebElement.*;


public class SupportHome extends WebAPI {

    @FindBy(xpath = supportPage)
    WebElement supportPageLink;

    @FindBy(xpath = verizonlogo)
    WebElement verizonLogo;

    @FindBy(css = entertainment)
    WebElement entertainmentOnFooter;

//    @FindBy(xpath = verizonSupportText)
//    WebElement verizonSupportIsDisplayed;

    @FindBy(xpath = supportHome)
    WebElement supportHomeLink;

    @FindBy(xpath = shopLocator)
    WebElement shopLink;

    @FindBy(xpath = shopEntertainment)
    WebElement shopEntertainmentBtn;

    @FindBy(xpath = homeSignIn)
    WebElement homeSignInIsClickable;

    @FindBy(xpath = videoEntertainment)
    WebElement BackgroundVideoEnt;

    @FindBy(xpath = topBrandText)
    WebElement TopBrandText;

    @FindBy(xpath = topAccessoryBrand)
    WebElement topAccessoryBrandText;

    @FindBy(linkText = apple)
    WebElement Apple;

    @FindBy(css = appleBuy)
    WebElement AppleBuy;

    @FindBy(className = iPhone12Buy)
    WebElement iPhoneProMax;

    @FindBy(xpath = iPhone12SelectColor)
    WebElement ColorBtn;

    //helper method

    //Method to click on Verizon Support Page


    public void verifyShopLink() throws InterruptedException {//1
        Actions actions = new Actions(driver);//mouseHover, dropdown,drag & drop
        actions.moveToElement(shopLink);
        Thread.sleep(5000);
        //shopEntertainmentBtn.click();
//        actions.moveToElement(target WebElement).perform().
//        actions.moveToElement(target WebElement).build().perform().
    }

    // helper method to scroll down

    public void scrollDown() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,4000);");
    }

    //Method to verify Verizon logo in the footer-2
    public void verifyVerizonLogo() {
        scrollDown();
        boolean b = verizonLogo.isDisplayed();
        Assert.assertEquals(b, true, "Test failed");
    }

    public void verifyVerizonEntertainmentIsClickable() {
        entertainmentOnFooter.click();
        boolean b = entertainmentOnFooter.isEnabled();
        Assert.assertTrue(b);
    }

    //method not working
    public void verifyBackGroundVideoIsRunning() {
        scrollDown();
        entertainmentOnFooter.click();
        boolean b = BackgroundVideoEnt.isDisplayed();
    }

    public void verifyTopDeviceBrandText() {
        scrollDown();
        TopBrandText.isDisplayed();
    }

    public void verifyTopAccessoriesBrandText() {
        scrollDown();
        topAccessoryBrandText.getAttribute("class");
    }

    public void scrollTo(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true)", element);
        // scrollIntoView(true)
    }

    public void verifyAppleBrand() {
        scrollTo(Apple);
        Apple.click();
        AppleBuy.click();

    }

    public void verifyBuyiPhone12Pro() {
        scrollDown();
        Apple.click();
        AppleBuy.click();
        iPhoneProMax.getText();

    }

    public void verifySelectColor() {
        scrollDown();
        Apple.click();
        AppleBuy.click();
        ColorBtn.click();
        System.out.println(ColorBtn.isSelected());

    }
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//       js.executeScript("document.getElementBy.(BackgroundVideoEnt).play");


        public void supportHomeText(){
            clickByXpath(supportPage);
            clickByXpath(supportHomeText);
        }
        public void homeSignIn() {
            clickByXpath(supportPage);
            clickByXpath(supportHomeText);
            clickByXpath(homeSignIn);
        }

        public void Register() {
            clickByXpath(supportPage);
            clickByXpath(supportHomeText);
            clickByXpath(homeSignIn);
    }


}

