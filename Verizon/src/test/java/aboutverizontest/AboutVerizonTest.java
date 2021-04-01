package aboutverizontest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import aboutverizon.AboutVerizon;

import static aboutverizon.AboutVerizonWebElement.*;


public class AboutVerizonTest extends WebAPI {

    AboutVerizon about;

    @BeforeMethod
    public void init() {
        about = PageFactory.initElements(driver, AboutVerizon.class);

    }

    @Test
    public void urlTest() throws InterruptedException {
        about.aboutVerizonSection();
        String actualText = driver.getCurrentUrl();
        Assert.assertEquals(actualText, verizonUrl, "Test failed");
    }

    @Test
    public void titleTest() throws InterruptedException {
        about.aboutVerizonSection();
        String expectedText = "Verizon: Wireless, Internet, TV and Phone Services | Official Site";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Test failed");

    }

    @Test
    public void mainBannerTest() throws InterruptedException {
        about.aboutVerizonSection();
        assertEqualByXpath(aboutVerizonBanner, "About Verizon");

    }

    @Test
    public void aboutUsBannerTest() throws InterruptedException {
        about.aboutVerizonSection();
        assertEqualByXpath(aboutUsBanner, "About us");

    }

    @Test
    public void aboutUsPageTest() throws InterruptedException {
        about.aboutUsPage();
        String actualText = driver.getCurrentUrl();
        Assert.assertEquals(actualText, aboutUsUrl, "Test failed");

    }


    @Test
    public void aboutUsTitleTest() throws InterruptedException {
        about.aboutUsPage();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, "Official Verizon Corporate Web site | About Verizon", "Test failed");

    }

    @Test
    public void careersBannerTest() throws InterruptedException {
        about.aboutVerizonSection();
        assertEqualByXpath(aboutUsBanner, "About us");

    }


    @Test
    public void careersTitleTest() throws InterruptedException {
        about.careersPage();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, "Find a Career at Verizon | About Verizon", "Test failed");

    }

    @Test
    public void newsBannerTest() throws InterruptedException {
        about.aboutVerizonSection();
        assertEqualByXpath(newsBanner, "News");

    }

    @Test
    public void newsPageTest() throws InterruptedException {
        about.newsPage();
        String actualText = driver.getCurrentUrl();
        Assert.assertEquals(actualText, newsUrl, "Test failed");

    }


    @Test
    public void newsTitleTest() throws InterruptedException {
        about.newsPage();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, "Verizon Newsroom | About Verizon", "Test failed");

    }

    @Test
    public void newsReleaseBannerTest() throws InterruptedException {
        about.newsPage();
        assertEqualByXpath(newsReleasesBanner, "News Releases\n" +
                " ");

    }

    @Test
    public void insideNewsBannerTest() throws InterruptedException {
        about.newsPage();
        assertEqualByXpath(insideNewsBanner, "Inside Verizon news");

    }

    @Test
    public void resBannerTest() throws InterruptedException {
        about.aboutVerizonSection();
        assertEqualByXpath(resBanner, "Responsibility");

    }



    @Test
    public void resTitleTest() throws InterruptedException {
        about.resPage();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, "Citizen Verizon: Corporate Responsibility | About Verizon", "Test failed");

    }

    @Test
    public void innoBannerTest() throws InterruptedException {
        about.aboutVerizonSection();
        assertEqualByXpath(innoBanner, "Verizon Innovation Program");

    }

    @Test
    public void innoPageTest() throws InterruptedException {
        about.innoPage();
        String actualText = driver.getCurrentUrl();
        Assert.assertEquals(actualText,innoUrl, "Test failed");

    }


    @Test
    public void innoTitleTest() throws InterruptedException {
        about.innoPage();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, "Verizon Innovative Learning: An Educational Initiative | About Verizon", "Test failed");

    }

    @Test
    public void eduBannerTest() throws InterruptedException {
        about.aboutVerizonSection();
        assertEqualByXpath(eduBanner, "Consumer education");

    }



    @Test
    public void eduTitleTest() throws InterruptedException {
        about.eduPage();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, "Fios Information - Learn about Internet, Cable TV, and Phone from Verizon", "Test failed");

    }

    @Test
    public void broBannerTest() throws InterruptedException {
        about.aboutVerizonSection();
        assertEqualByXpath(broBanner, "Brochures");

    }



    @Test
    public void broTitleTest() throws InterruptedException {
        about.broPage();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, "Consumer Brochures", "Test failed");

    }

    @Test
    public void consumerBroBannerTest() throws InterruptedException {
        about.broPage();
        assertEqualByXpath(consumerBroBanner, "Consumer Brochures");

    }




}




