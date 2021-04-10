package bbcTest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import bbcHomePage.AboutUs;

public class AboutUsTest extends WebAPI {
    AboutUs explore;

    @BeforeMethod
    public void getinit() throws InterruptedException {
        explore = PageFactory.initElements(driver, AboutUs.class);


        String bbcUrl = "https://www.bbc.com/";
        this.driver.get(bbcUrl);
        sleepFor(1);
    }

    @Test//1
    public void aboutUsTest() throws InterruptedException {

        explore.aboutUs();
        String expectedTitle = "BBC - Travel - Home";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "the text did not match");
    }
@Test//2
    public void seriesTest() throws InterruptedException {

        explore.series();
    String expectedTitle = "BBC - Travel - Home";
    String actualTitle = driver.getTitle();
    Assert.assertEquals(actualTitle, expectedTitle, "the text did not match");


    }
@Test// 3  useing get Title Method
public void seriesAdventureTest() throws InterruptedException {

        explore.seriesAdventure();
    String expectedTitle = "BBC - Travel - Home";
    String actualTitle = driver.getTitle();
    Assert.assertEquals(actualTitle, expectedTitle, "the text did not match");

}
@Test//4
public void seriesBBCTravel2019() throws InterruptedException {
        explore.seriesBBCTravel2019();
    String expectedTitle = "BBC - Travel - Mexico City’s ‘walking fish’";
    String actualTitle = driver.getTitle();
    Assert.assertEquals(actualTitle, expectedTitle, "the text did not match");

}
@Test//5
public void experiences() throws InterruptedException {

        explore.experiences();
    String expectedTitle = "BBC - Travel - Adventure & Experience";
    String actualTitle = driver.getTitle();
    Assert.assertEquals(actualTitle, expectedTitle, "the text did not match");

}


    //-----------------------------------------------------

    public void result(String expected, String actual) {
        String expectedText = expected;
        String actualText = getTextByXpath(actual);
        Assert.assertEquals(actualText, expectedText, "the text did not match");
    }
}