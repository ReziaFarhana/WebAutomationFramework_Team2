package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElements.*;

public class HomePage extends WebAPI {

//    @FindBy(how= How.XPATH, using=rentersXp) public WebElement renters;

    public void selectShop(){
        clickByXpath(shopXp);
    }
    public void selectShopAll() throws InterruptedException {
        selectShop();
        sleepFor(3);
        clickById(shopAllID);
    }
}
