package testNewsPage;

import common.WebAPI;
import newsPage.DataProviderNewsPage;
import newsPage.NewsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.ExtentTestManager;

public class TestNewsPage extends WebAPI {

    NewsPage newsPage;

    @BeforeMethod
    public void pageFactorySetup(){
        newsPage = PageFactory.initElements(driver, NewsPage.class);
    }

    @Test(enabled = false)
    public void newsPageLink(){
        newsPage.newsPageLink();
        ExtentTestManager.log("News page link has been validated");
    }

    @Test(enabled = false)
    public void newsPageLogo(){
        newsPage.validateLogo();
    }

    @Test(enabled = false)
    public void searchFieldValidation(){
        newsPage.searchFieldValidation();
        ExtentTestManager.log("Search field validation done");
    }

    @Test(dataProviderClass = DataProviderNewsPage.class,dataProvider = "credentials")
    public void searchData(String data){
        newsPage.searchField.sendKeys(data);
        newsPage.searchButton.click();
    }

    @Test(enabled = false)
    public void scrollDownJS(){
        newsPage.scrollDownJS();
        ExtentTestManager.log("Window scrolled down as expected");
    }

    @Test(enabled = false)
    public void moveToTravelLink(){
        newsPage.moveToTravelLink();
    }

    @Test(enabled = false)
    public void navigateFunctionality(){
        newsPage.navigateFunctionality();
    }

    @Test(enabled = false)
    public void mosuseHoverOverNewsLink(){
        newsPage.moiuseHoverOverNewsLink();
    }

    @Test
    public void validateSocialMediaLink(){
        newsPage.validateSocialMediaLink();
        ExtentTestManager.log("FaceBook page link is validated");
    }


}
