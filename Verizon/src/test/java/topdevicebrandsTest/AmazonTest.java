package topdevicebrandsTest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import topdevicebrands.Amazon;

import static topdevicebrands.TopDeviceBrandsWebElements.*;


public class AmazonTest extends WebAPI {

    Amazon amazon;

    @BeforeMethod
    public void getInit(){
        amazon = PageFactory.initElements(driver,Amazon.class);
    }

    @Test

    public void amazonTabTest(){
        amazon.amazonLocator();
        String expectedTitle = "Go Smart Home with Amazon on Verizon 5G";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Title is not a match");
    }

}
