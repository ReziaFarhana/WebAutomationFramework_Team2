package bbcTest;

import bbcHomePage.FoodAndCulture;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FoodAndCultureTest extends WebAPI {


    FoodAndCulture explore;

    @BeforeMethod
    public void getinit() throws InterruptedException {
        explore = PageFactory.initElements(driver, FoodAndCulture.class);


        String bbcUrl = "https://www.bbc.com/";
        this.driver.get(bbcUrl);
        sleepFor(1);
    }

    @Test//1
    public void foodPageTest() throws InterruptedException {

        explore.foodPage();
        String expectedText="How Canada is reclaiming its cuisine";
        String actualText=getTextByXpath("//h3[text()='How Canada is reclaiming its cuisine']");
        Assert.assertEquals(actualText,expectedText,"the text did not match");


    }



    @Test//2
    public void poorMansBurgerTest() throws InterruptedException {

    explore.poorMansBurger();
        String expectedText="By Aysha Imtiaz";
        String actualText=getTextByXpath("//span[text()='By Aysha Imtiaz']");
        Assert.assertEquals(actualText,expectedText,"the text did not match");
    }

    @Test//3
    public void japaneseFruitFoodTest() throws InterruptedException {

        explore.japaneseFruitFood();
        String expectedText="By Brendan Sainsbury";
        String actualText=getTextByXpath("//span[@class='index-body']");
        Assert.assertEquals(actualText,expectedText,"the text did not match");
    }

    @Test//4
    public void riceShapedAmericaTest() throws InterruptedException {

        explore.riceShapedAmerica();
        result("By Michael W Twitty","//Span[text()='By Michael W Twitty']");



    }

    @Test//5
    public void milkBarTest() throws InterruptedException {

        explore.milkBar();
        result("By Glory Iribagiza","//*[@id=\"story-content\"]/div[1]/div[3]/div[3]/div[1]/div/div/ul/li/span");
    }

    //-------------------------------

    //CULTURE TESTS
@Test//6
    public void culturePageTest() throws InterruptedException {

        explore.cutlurePage();
        String expectedTitle="BBC - Travel - Culture & Identity";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"the text did not match");
    }
    @Test//7

    public void harmoniousNationTest() throws InterruptedException {

        explore.harmoniousNation();
        result("By Charukesi Ramadurai","//span[@class='index-body' and text()='By Charukesi Ramadurai']");

    }



    public void result(String expected, String actual){
        String expectedText=expected;
        String actualText=getTextByXpath(actual);
        Assert.assertEquals(actualText,expectedText,"the text did not match");

    }


}
