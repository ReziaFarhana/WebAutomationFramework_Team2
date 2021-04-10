package homePage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class WalmartHomePage extends WebAPI{


    @FindBy(css ="#header-Header-sparkButton > span > img")
    WebElement optionsMenu;

    @FindBy(xpath ="//*[@id=\"vh-department-menu\"]/button[4]")
    WebElement officeLink;

    @FindBy(xpath = "//*[@id=\"dept-H5jorcac-children\"]/div[2]/div[1]/div[2]/div/span/a")
    WebElement tvAndVideo;

    @FindBy(xpath = "//*[@id=\"dept-H5jorcac-children\"]/div[2]/div[2]/div[1]/div/span/a")
    WebElement ipadTablet;

    @FindBy(xpath = "//*[@id=\"dept-H5jorcac-children\"]/div[2]/div[2]/div[2]/div/span/a")
    WebElement computers;

    @FindBy(xpath = "//*[@id=\"dept-H5jorcac-children\"]/div[2]/div[2]/div[2]/a[1]/div" )
    WebElement laptops;

    @FindBy(xpath = "(//span[contains(text(),'Get to Know Us')])[1]")
    WebElement getToKnowBtn;

    @FindBy (css = "(#js-global-footer-wrapper > div > div:nth-child(2) > div > div:nth-child(1) > div > span")
    WebElement walmartServices;

    @FindBy (xpath = "//*[@id=\"js-global-footer-wrapper\"]/div/div[2]/div/div[4]/div/span")
    WebElement customerServiceBtn;

    @FindBy(xpath = "(//*[@id=\"js-global-footer-wrapper\"]/div/div[2]/div/div[3]/div/span")
    WebElement walmartComBtn;

    @FindBy(xpath = "//span[contains(text(),'In The Spotlight')]")
    WebElement spotlightBtn;

    @FindBy(xpath= "//span[contains(text(),'Shop Our Brands')]")
    WebElement shopOurBrand;

    @FindBy(xpath = "//a[contains(text(),'Terms of Use')]")
    WebElement termsOfUse;

    @FindBy (id ="quickLink-truck")
    WebElement whereIsMyOrderImage;

    @FindBy(id = "quickLink-package")
    WebElement editOrCancelImage;

    @FindBy(id = "quickLink-start-a-return")
    WebElement returnAndRefundOrder;





    public void verifyElectronicsAndOfficeIsClickable(){
        optionsMenu.click();
        officeLink.click();
    }

    public void verifyTvAndVideoIsEnabled(){
        optionsMenu.click();
        officeLink.click();
        if(tvAndVideo.isEnabled()) {
            tvAndVideo.click();
        }
    }

    public void verifyIpadAndTabletIsDisplayed(){
        optionsMenu.click();
        officeLink.click();
       boolean b= ipadTablet.isDisplayed();
        Assert.assertTrue(b);
    }


    public void verifyIsComputersEnable(){
        optionsMenu.click();
        officeLink.click();
        boolean b=computers.isEnabled();
        Assert.assertTrue(b);
    }

    public void verifyIsLaptopsClickable(){
        optionsMenu.click();
        officeLink.click();
        laptops.click();
    }

    // ..

    public void verifyGetToKnow(){
        getToKnowBtn.isEnabled();
        boolean b=getToKnowBtn.isEnabled();
        Assert.assertTrue(b);
    }

    public void verifyGetToText(){
        String s= getToKnowBtn.getText();
        Assert.assertEquals(s,"Get to Know Us");
    }

    public void verifyWalmartServicesIsEnabled(){
        boolean b=walmartServices.isEnabled();
        Assert.assertTrue(b,"Test Failed");
    }

    public void verifyTextForWalmartServices(){
        String s= walmartServices.getText();
        Assert.assertEquals(s,"Walmart Services");
    }

    public void verifyIfCustomerServiceIsEnabled(){
        customerServiceBtn.isEnabled();
        boolean b=customerServiceBtn.isEnabled();
        Assert.assertTrue(b);
    }

    public void verifyCustomerServiceText(){
        String s= customerServiceBtn.getText();
        Assert.assertEquals(s,"Customer Service");
    }

    public void verifyWalmartComIsEnable(){
        walmartComBtn.isEnabled();
        boolean b=walmartComBtn.isEnabled();
        Assert.assertTrue(b);
    }

    public void verifyWalmartComText(){
        String s= walmartComBtn.getText();
        Assert.assertEquals(s,"Walmart.com");
    }

    public void verifySpotLightBtn(){
        spotlightBtn.isEnabled();
        boolean b=spotlightBtn.isEnabled();
        Assert.assertTrue(b);
    }

    public void verifySpotLightBtnText(){
        String s= spotlightBtn.getText();
        Assert.assertEquals(s,"In The Spotlight");
    }

    public void verifyShopOurBrandIsDisplayed(){
        boolean b= shopOurBrand.isDisplayed();
        Assert.assertTrue(b);

    }

    public void verifyTermsOfUseLink(){
        termsOfUse.isEnabled();
        termsOfUse.click();

    }
    public void verifyWhereIsMyOrderIsDisplayed(){
        termsOfUse.click();
        boolean b=whereIsMyOrderImage.isDisplayed();
        Assert.assertTrue(b);

    }

    public void verifyEditOrCancelOrderIsDisplayed(){
        termsOfUse.click();
        boolean b=editOrCancelImage.isDisplayed();
        Assert.assertTrue(b);

    }

    public void verifyReturnsAndRefundImageIsDisplayed(){
        termsOfUse.click();
        boolean b=returnAndRefundOrder.isDisplayed();
        Assert.assertTrue(b);

    }




}
