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

    @Test(enabled = true)
    public void getUrlTest() throws InterruptedException {
        home.getCurrentUrl("https://www.bbc.com");
        String expectedTitle = "BBC - Homepage";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(enabled = true)
    public void musicSectionTest() {
        home.musicLinkSection();
        assertEqualByXpath(musicText, "Music");
    }

    @Test(enabled = true)
    public void soundsSectionTest() {
        home.soundsLinkSection();
        String expectedTitle = "BBC Sounds - Music. Radio. Podcasts";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(enabled = true)
    public void weatherSectionTest() {
        home.weatherSection();
        String expectedTitle = "BBC Weather";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
   }

    @Test(enabled = true)
    public void travelSectionTest() {
        home.travelSection();
        String expectedTitle = "BBC - Travel - Culture & Identity";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(enabled = true)
    public void searchBoxSectionTest() throws InterruptedException {
        home.searchBoxSection();
      String expectedText="BBC - Search results for Coronavirus";
      String actualText= driver.getTitle();
      Assert.assertEquals(actualText,expectedText,"Results are matching");
    }

    @Test(enabled = true)
    public void sportSectionTest() throws InterruptedException {
        home.sportSection();
        String expectedText = "Home - BBC Sport";
        String actualText =  driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Results are not matching");
    }

    @Test(enabled = true)
    public void workLifeSectionTest() throws InterruptedException {
        home.workLifeSection();
        String expectedText="Home - BBC Worklife";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Results are matching");
   }

    @Test(enabled = true)
    public void allSportSectionTest() throws InterruptedException {
        home.allSportSection();
        String expectedTitle = "Teams - Rugby Union - BBC Sport";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
   }

   @Test(enabled = true)
    public void futureSectionTest() throws InterruptedException {
        home.futureSection();
       String expectedTitle = "Home - BBC Future";
       String actualTitle = driver.getTitle();
       Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

   @Test(enabled = true)
    public void newsSectionTest() throws InterruptedException {
        home.newsSection();
       String expectedTitle ="One-minute World News - BBC News";
       String actualTitle = driver.getTitle();
       Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
   }

      @Test(enabled = true)
      public void advertisementSectionTest() throws InterruptedException {
        home.advertisementSection();
       String expectedTitle ="Cookie & Browser Settings - Using the BBC";
       String actualTitle = driver.getTitle();
       Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

        @Test(enabled = true)
        public void termsOfUseSectionTest() throws InterruptedException {
        home.termsOfUseSection();
        String expectedTitle ="Terms of Use - Using the BBC";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(enabled = true)
    public void usingBBCContentSection() throws InterruptedException {
        home.usingBBCContentSection();
        String expectedTitle = "Can I use BBC content? - Using the BBC";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

     @Test(enabled = true)
     public void businessSectionTest() throws InterruptedException {
     home.businessSection();
     String expectedTitle = "Business - BBC News";
     String actualTitle = driver.getTitle();
     Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(enabled = true)
    public void sectionOfUKNews() throws InterruptedException {
        home.sectionOfUKNews();
        String expectedTitle =  "UK - BBC News";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(enabled = true)
    public void companiesSectionTest() throws InterruptedException {
        home.companiesSection();
        String expectedTitle =  "Companies - BBC News";
        String actualTitle = driver.getTitle();
       Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(enabled = true)
     public void worldSectionTest() throws InterruptedException {
        home.worldSection();
        String expectedTitle = "World - BBC News";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }
      @Test(enabled = true)
    public void techSectionTest() throws InterruptedException {
        home.techSection();
        String expectedTitle = "Technology - BBC News";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(enabled = true)
    public void scienceSectionTest() throws InterruptedException {
        home.scienceSection();
        String expectedTitle = "Science & Environment - BBC News";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
   }

    @Test(enabled = true)
    public void latinAmericaSectionTest() throws InterruptedException {
        home.latinAmericaSection();
        String expectedText = "Latin America";
        String actualText = getTextByXpath(latinAmerica);
        Assert.assertEquals(actualText, expectedText, "results are matching");
    }

    @Test(enabled = true)
    public void coronavirusSectionTest() throws InterruptedException {
        home.coronavirusSection();
        String expectedText = "Coronavirus";
        String actualText =  getTextByXpath(coronavirus);
        Assert.assertEquals(actualText, expectedText, "Results is matching");
    }

    @Test(enabled = true)
    public void storiesSectionTest() throws InterruptedException {
        home.storiesSection();
        String expectedText = "Stories";
        String actualText =  getTextByXpath(stories);
        Assert.assertEquals(actualText, expectedText, "Results is matching");
    }

    @Test(enabled = true)
    public void destinationsSectionTest() {
        home.destinationsSection();
        String expectedTitle = "BBC - Travel - Destinations";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(enabled = true)
    public void foodSectionTest() throws InterruptedException {
        home.foodSection();
        String expectedText = "Food ";
        String actualText =  getTextByXpath(food);
        Assert.assertEquals(actualText, expectedText, "Results is matching");
    }

    @Test(enabled = true)
    public void selectAsiaSectionTesting() throws InterruptedException {
        home.selectAsiaSection();
        String expectedText = "Asia - BBC News ";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Results is matching");
    }

    @Test(enabled = true)
    public void selectEuropeSection() throws InterruptedException {
        home.selectEuropeSection();
        String expectedText = "Europe - BBC News ";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Results is matching");
    }

    @Test(enabled = true)
    public void selectGolfSectionTesting() throws InterruptedException {
        home.selectGolfSection();
        String expectedTitle = "Golf - BBC Sport";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(enabled = true)
    public void tennisSectionTesting() throws InterruptedException {
        home.tennisSection();
        String expectedTitle = "Tennis - BBC Sport";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(enabled = true)
    public void selectCyclingOptionTesting() throws InterruptedException {
        home.selectCyclingOption();
        String expectedTitle = "Cycling - BBC Sport";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(enabled = true)
    public void checkingSectionOfAthleticsTest() throws InterruptedException {
        home.checkingSectionOfAthletics();
        String expectedText = "Athletics - BBC Sport";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Results is matching");
    }

    @Test(enabled = true)
    public void formula1SectionTesting(){
        home.formula1Section();
        String expectedTitle = "Formula1 - BBC Sport";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is matching");
    }

    @Test(enabled = true)
    public void selectCricketSectionTesting(){
        home.selectCricketSection();
        String expectedTitle = "Cricket - BBC Sport";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Results is matching");
    }
    }
