package searchboxtest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import searchbox.SearchBox;

import java.io.IOException;

public class SearchBoxTest extends WebAPI {

    SearchBox searchbox;

    @BeforeMethod
    public void init(){
        searchbox = PageFactory.initElements(driver, SearchBox.class);
    }

    @Test
    public void searchCatToysTest() throws IOException, InterruptedException {
        searchbox.searchCatToys();
        String expectedText = "Cat Toys - Walmart.com";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text not matched");
    }

    public void searchBikesTest() throws IOException, InterruptedException {
        searchbox.searchBikes();
        String expectedText = "Bikes - Walmart.com";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text not matched");
    }
}
