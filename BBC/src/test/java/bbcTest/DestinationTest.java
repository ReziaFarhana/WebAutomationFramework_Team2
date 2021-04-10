package bbcTest;


import bbcHomePage.Destinations;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class
DestinationTest extends WebAPI {

    Destinations explore;

    @BeforeMethod
    public void getinit() throws InterruptedException {
        explore = PageFactory.initElements(driver, Destinations.class);


        String bbcUrl = "https://www.bbc.com/";
        this.driver.get(bbcUrl);
        sleepFor(1);
    }

    @Test//1
    public void destinationsPageTest() throws InterruptedException {

        explore.destinationsPage();
        result("Africa", "//*[@id=\"false\"]/div/a/header/div/div[2]/h3");



        explore.destinationsPage();
        result("Antarctica","//h3[normalize-space()='Antarctica']");


        //explore.destinationsPage();
       // result("Europe","//h3[normalize-space()='Europe']");

    }
@Test//2
    public void africaTest() throws InterruptedException {

        explore.africa();
        result("Destinations in Africa:","//*[@id=\"homepage-two-column\"]/div[3]/div[1]/div[2]/div/h3");
    }
    @Test//3
    public void janeGoodmanTest() throws InterruptedException {

        explore.africaDestinations();
        result("By Laurie Wiegler","//span[@class='index-body' and text()='By Laurie Wiegler']");
    }

    @Test//4
    public void europeTest() throws InterruptedException {

        explore.europe();
        result("Europe","//h2[normalize-space()='Europe']");
    }

    @Test//5
    public void ageOldAlpineTest() throws InterruptedException {

        explore.ageOldAlpine();
        result("By Mike MacEacheran","//span[@class='index-body' and text()='By Mike MacEacheran']");
    }

    @Test//6
    public void australiaAndPacific() throws InterruptedException {

        explore.australiaAndPacific();
        result("Destinations in Australia and Pacific:","//h3[text()='Destinations in Australia and Pacific:']");

    }


    @Test//7
    public void futureOfTravel() throws InterruptedException {

        explore.futureOfTravel();
        result("A defiant move to the Norwegian Arctic","//h3[normalize-space()='A defiant move to the Norwegian Arctic']");

    }







    public void result(String expected, String actual) {
        String expectedText = expected;
        String actualText = getTextByXpath(actual);
        Assert.assertEquals(actualText, expectedText, "the text did not match");


    }
}





