package test_page.MoreMenuTabTest;

import common.WebAPI;
import home_page.MoreMenuTab.MenuBarMore;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.io.IOException;

import static home_page.MoreMenuTab.MenuBarMoreWEbElement.*;

public class MoreTabTest extends WebAPI {

    MenuBarMore act ;  // instantiate MenuBarMore class

    /**
     * Method to initialize action class
     */
    @BeforeMethod
    public void initializeActionclass(){
        act = PageFactory.initElements(driver, MenuBarMore.class);
    }

    @Test
    public void verifyMoreMenuTabClik(){
        act.clikOnMoreMenuTab();
        assertEqualBycssLocator(moreClickText, "MORE");
    }

    @Test
    public void verifyWeatherLink() throws InterruptedException {
        act.openWeatherLink();
        boolean weatherLogo = driver.findElement(By.className(weatherText)).isDisplayed();
        Assert.assertEquals(weatherLogo, true, "Test failed");
    }

    @Test @Ignore
    public void verifyWeatherSearchByCity(){
        act.weatherSearchByCity();
        assertEqualByXpath(washingtonDC,"Washington DC");
    }

    @Test @Ignore
    public void searchingOnBBCUsingDB () throws Exception {
        act.searchWithSearchInputBox();
    }

    @Test
    public void searchingOnBBCUsingExcel() throws IOException, InterruptedException {
        act.searchOnBBCUsingExcelData();
    }


}
