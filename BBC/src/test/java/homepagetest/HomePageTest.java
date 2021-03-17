package homepagetest;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import homepage.HomePage;

public class HomePageTest extends WebAPI {
    //Test class

    HomePage homePage;

    @BeforeMethod
    public void getInit(){
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
    @Test
    public void homePageTest(){
        homePage.searchBoxFunc();
        String expectedText="BBC - Search results for COVID-19";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Actual result doesn't match expected");
    }
    @Test
    public void homePageTest2(){
        homePage.checkVisitReal();
        String expectedText2="Home - BBC Reel";
        String actualText2= driver.getTitle();
        Assert.assertEquals(actualText2,expectedText2,"Expected result doesn't match with actual");
    }
    @Test
    public void homePageTest3(){
        homePage.checkAboutBBC();
        String expectedText3="Learn more about what we do - About the BBC";
        String actualText3= driver.getTitle();
        Assert.assertEquals(actualText3,expectedText3,"Expected result doesn't match with actual");
    }
    @Test
    public void homePageTest4(){
        homePage.checkSignIn();
        String expectedText4="BBC – Sign in";
        String actualText4=driver.getTitle();
        Assert.assertEquals(expectedText4,actualText4,"Expected result doesn't match actual");
    }


}
