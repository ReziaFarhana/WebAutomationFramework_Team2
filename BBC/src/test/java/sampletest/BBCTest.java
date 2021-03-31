package sampletest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sample.BBCHome;

import java.io.IOException;

import static sample.BBCWebElement.*;

public class BBCTest extends WebAPI {
BBCHome home;

    @BeforeMethod
    public void getInit() throws IOException {
        home = PageFactory.initElements(driver, BBCHome.class);
    }

@Test(enabled = false)
    public void musicSectionTest(){
        home.musicLinkSection();
        assertEqualByXpath(musicText,"Music");

    }

@Test(enabled = false)
   public void wordNewsSectionTest(){
        home.wordNewsSection();
        String expectedTitle="BBC World News: 24 hour news TV channel - BBC News";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Title is matching");

   }

@Test(enabled = false)
public void weatherSectionTest(){
        home.weatherSection();
        assertEqualByXpath(weatherText,"WEATHER");

}

 @Test(enabled = false)
    public void travelSectionTest(){
        home.travelSection();
        assertEqualByXpath(travel,"Culture");

 }
 @Test(enabled = false)
    public void searchBoxSectionTest() throws InterruptedException {
       home.searchBoxSection();
//       String expectedText="\"Coronavirus\"";
//       String actualText=home.searchBox.getText();
//       Assert.assertEquals(actualText,expectedText,"Results are matching");
 }

 @Test(enabled = false)
    public void sportSectionTest(){
        home.sportSection();
        String expectedText="\"Sport\"";
        String actualText=home.clickOnElement(sport);
        Assert.assertEquals(actualText,expectedText,"Results are not matching");
 }



}
