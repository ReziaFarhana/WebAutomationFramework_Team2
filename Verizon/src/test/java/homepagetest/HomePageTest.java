package homepagetest;

import common.WebAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static homepage.HomePageWebElements.*;

public class HomePageTest extends WebAPI {

    HomePage homepage;

    @BeforeMethod
    public void init(){ homepage= PageFactory.initElements(driver, HomePage.class); }


    public void selectShopAllTest() throws InterruptedException {
        homepage.selectShopAll();
        String expectedText ="Shop Deals on Smartphones, Accessories, Devices & Plans | Verizon";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text not same");
    }
    @Test
    public void selectDevicesTest() throws InterruptedException {
        homepage.selectSmartPhones();
        String expectedText ="Smartphones - Buy The Top Cell Phones | Verizon";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text not same");
    }

}
