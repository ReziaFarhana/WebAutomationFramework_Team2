package tvpagetest;

import common.WebAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tvPage.TvPage;

import static tvPage.TvPageWebElement.*;

public class TvPageTest extends WebAPI {
    TvPage tvpage;

    @BeforeMethod
    public void init(){ tvpage= PageFactory.initElements(driver, TvPage.class); }

    @Test
    public void clickTvNavTest(){
        tvpage.clickTvNav();
        String expectedText="BBC World News";
        String actualText=getTextByXpath(tvPageTextXp);
        Assert.assertEquals(actualText,expectedText,"Text not matched");
    }
}
