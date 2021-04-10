package topdevicebrandsTest;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.Test;
import topdevicebrands.SearchBoxDataProvider;

import static topdevicebrands.TopDeviceBrandsWebElements.*;

public class SearchDataProviderTest extends WebAPI {
    @FindBy(how = How.XPATH,using = searchBoxLocator)public WebElement searchBox;

    @Test(dataProvider = "SearchItems",dataProviderClass = SearchBoxDataProvider.class)
    public void testSearchBoxFunctionality(String item) throws InterruptedException {
        String expectedItem = "Search Results for "+item+" at Verizon";
        clickByXpath(searchBoxLocator);
        sleepFor(3);
        typeByXpathNEnter(searchBoxInputBox,item);
        sleepFor(3);
        String actualItem =driver.getTitle();
        Assert.assertEquals(actualItem,expectedItem, "Title is not a match");
    }
}
