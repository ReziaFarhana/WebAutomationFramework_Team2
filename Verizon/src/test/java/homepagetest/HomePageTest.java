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

    @Test
    public void selectShopAll() throws InterruptedException {
        homepage.selectShopAll();
        String expectedText ="Shop Deals on Smartphones, Accessories, Devices & Plans | Verizon";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text not same");
    }

}
