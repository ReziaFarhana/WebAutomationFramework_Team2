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


    public void clickTvNavTest(){
        tvpage.clickTvNav();
        String expectedText="BBC World News";
        String actualText=getTextByXpath(tvPageTextXp);
        Assert.assertEquals(actualText,expectedText,"Text not matched");
    }

    public void selectDateTest(){
        tvpage.selectDate();
        String expectedText = "100 Women";
        String actualText = getTextByCss(women100pagetextCss);
        Assert.assertEquals(actualText,expectedText,"Text doesnt match");
    }

    public void selectSouthAsiaTest() throws InterruptedException {
        tvpage.selectSouthAsia();
        String expectedText="BBC WORLD NEWS South Asia - Schedules";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");

    }

    public void selectAfricaTest() throws InterruptedException {
        tvpage.selectAfrica();
        String expectedText="BBC WORLD NEWS Africa - Schedules";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");
    }

    public void selectMiddleEastTest() throws InterruptedException {
        tvpage.selectMiddleEast();
        String expectedText="BBC WORLD NEWS Middle East - Schedules";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");
    }

    public void selectEuropeTest() throws InterruptedException {
        tvpage.selectEurope();
        String expectedText="BBC WORLD NEWS Europe - Schedules";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");
    }
    @Test
    public void selectLatinAmericaTest() throws InterruptedException {
        tvpage.selectLatinAmerica();
        String expectedText="BBC WORLD NEWS Latin America - Schedules";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");
    }
    public void selectAsiaPacificTest() throws InterruptedException {
        tvpage.selectAsiaPacific();
        String expectedText="BBC WORLD NEWS Asia Pacific - Schedules";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Text doesnt match");
    }
}
