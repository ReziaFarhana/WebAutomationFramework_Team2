package WalmartTest;

import WalmartHomePage.walmartBurgerMenu;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class walmartToysTest extends WebAPI {


    walmartBurgerMenu mainMenu;

    @BeforeMethod
    public void getinit() throws InterruptedException {
        mainMenu= PageFactory.initElements(driver, walmartBurgerMenu.class);

        String walmartUrl = "https://www.walmart.com/";
        this.driver.get(walmartUrl);

        Thread.sleep(5000);
    }

  @Test  //Test Case (1)
    public void toysAndGamesTest() throws InterruptedException {

      mainMenu.toysAndGames();
String expectedText= "Shop New Toys";
String actualText=getTextByXpath("//div[@class='visualFacetTitle']");
    Assert.assertEquals(actualText,expectedText,"text did not match");

    }
@Ignore
@Test //Test case (2)
public void shopByAgeTest() throws InterruptedException {
    mainMenu.shopByAge();
       String expectedText="$5 - $50";
       String actualText=getTextByXpath("//button[normalize-space()='$5 - $50']");
       Assert.assertEquals(actualText,expectedText,"the text did not match");

}
@Ignore
@Test  //TestCase (3)

public void bestSellerDropDownTest() throws InterruptedException {

    mainMenu.bestSellerDropDown();

}

@Test //Testcase 4
public void searchFilterBarNewToys() throws InterruptedException {

    mainMenu.searchFilterBarNewToys();
        String expectedText="LeapFrog";
        String actualText=getTextByXpath("//button[@class='item' and text()='LeapFrog']");
        Assert.assertEquals(actualText,expectedText,"The Text did not match");
}

@Test //Test(5)
public void leapFrogIceCreamLinkTest() throws InterruptedException {

    mainMenu.leapFrogIceCreamLink();
        String expectedText="LeapFrog Scoop and Learn Ice Cream Cart, Play Kitchen Toy for Kids";
        String actualText=getTextByXpath("//*[@class='prod-ProductTitle prod-productTitle-buyBox font-bold']");
        Assert.assertEquals(actualText,expectedText,"Txt didn't match");

}

@Test //Test (6)
public  void  leapFrogAddToCartTest() throws InterruptedException {

    mainMenu.leapFrogAddTocart();
        String expectedText="2 items in cart";
        String actualText=getTextByXpath("//a[@aria-label='2 items in total, view in your cart']");
        Assert.assertEquals(actualText,expectedText,"Text didn't match");

}


@Test//(7)
 public void stemPageTest() throws InterruptedException {

    mainMenu.stemPage();
        String expectedText ="Shop by educational focus";
        String actualText = getTextByXpath("//*[@id=\"cp-center-module-1\"]/div/div[1]/h2");
        Assert.assertEquals(actualText,expectedText,"Text didn't match");
 }

 @Test//(8)
 public void roboticsPageLinkTest() throws InterruptedException {

     mainMenu.roboticsPageLink();
       String expectedText ="Robotics";
      String actualText = getTextByXpath("//h1[normalize-space()='Robotics']");
       Assert.assertEquals(actualText,expectedText,"Text didn't match");
 }
 @Test//(9)
 public void decorLiknkTest(){
     mainMenu.decorLink();
 }
@Test//(10)
public void searchBarTest(){

    mainMenu.searchBar();
    String expectedText ="Shop Home";
    String actualText = getTextByXpath("//*[@id=\"cp-top-module-2\"]/nav/ul/li[1]/h2/a");
    Assert.assertEquals(actualText,expectedText,"Text didn't match");
}

@Test//(11)
public void locationUpdateTest(){
    mainMenu.locationUpdate();
//    String expectedText ="Pickup or delivery";
//    String actualText = getTextByXpath("
//    Assert.assertEquals(actualText,expectedText,"Text didn't match");



}






 public void tearDown(){
        driver.close();

 }


}
