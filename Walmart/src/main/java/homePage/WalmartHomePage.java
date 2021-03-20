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









}
