package topdevicebrandsTest;

import org.testng.annotations.Test;
import topdevicebrands.Samsung;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import java.util.Arrays;
import java.util.List;

import static topdevicebrands.PersonalHomePageWebElements.*;


public class SamsungTest extends WebAPI {
    Samsung samsung;

    @BeforeMethod
    public void init() {
        samsung = PageFactory.initElements(driver, Samsung.class);
    }

    //@Test
    public void topDeviceBrandsCategoryListTest() {
        samsung.topDeviceBrandsCategoryList();
        List<String> expectedArrayList = Arrays.asList("Samsung", "Apple", "LG", "Motorola", "Google", "Amazon");
        //List<String> actualArrayList = Arrays.asList(topAccessoryBrandsList);
        Assert.assertEquals(getTextFromWebElementsByXpath(topAccessoryBrandsList), expectedArrayList, "The list is incorrect");
    }

//    @Test(priority =1)//passed
//    public void samsungTabTest(){
//        samsung.samsungTab();
//        String expectedTitle = "Samsung Galaxy Phones, Tablets, & Watches";
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(actualTitle,expectedTitle,"Ttitle is wrong");
//    }

//    @Test(priority = 2)//passed
//    public void shopSamsungPageTest(){
//        samsung.shopSamsungPage();
//        String expectedTitle = "Shop Samsung Galaxy S21 Series Phones";
//        String actualTitle = getTextByXpath(buyPageVerify);
//        Assert.assertEquals(actualTitle,expectedTitle,"Ttitle is wrong");
//    }

//    @Test//passed
//    public void samsungTabTest(){
//        samsung.samsungTab();
//        String expectedTitle = "Samsung Galaxy Phones, Tablets, & Watches";
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(actualTitle,expectedTitle,"Ttitle is wrong");
//    } @Test//passed
//    public void samsungTabTest(){
//        samsung.samsungTab();
//        String expectedTitle = "Samsung Galaxy Phones, Tablets, & Watches";
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(actualTitle,expectedTitle,"Ttitle is wrong");
//    } @Test//passed
//    public void samsungTabTest(){
//        samsung.samsungTab();
//        String expectedTitle = "Samsung Galaxy Phones, Tablets, & Watches";
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(actualTitle,expectedTitle,"Ttitle is wrong");
//    } @Test//passed
//    public void samsungTabTest(){
//        samsung.samsungTab();
//        String expectedTitle = "Samsung Galaxy Phones, Tablets, & Watches";
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(actualTitle,expectedTitle,"Ttitle is wrong");
//    } @Test//passed
//    public void samsungTabTest(){
//        samsung.samsungTab();
//        String expectedTitle = "Samsung Galaxy Phones, Tablets, & Watches";
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(actualTitle,expectedTitle,"Ttitle is wrong");
//    } @Test//passed
//    public void samsungTabTest(){
//        samsung.samsungTab();
//        String expectedTitle = "Samsung Galaxy Phones, Tablets, & Watches";
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(actualTitle,expectedTitle,"Ttitle is wrong");
//    } @Test//passed
//    public void samsungTabTest(){
//        samsung.samsungTab();
//        String expectedTitle = "Samsung Galaxy Phones, Tablets, & Watches";
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(actualTitle,expectedTitle,"Ttitle is wrong");
//    } @Test//passed
//    public void samsungTabTest(){
//        samsung.samsungTab();
//        String expectedTitle = "Samsung Galaxy Phones, Tablets, & Watches";
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(actualTitle,expectedTitle,"Ttitle is wrong");
//    }



}
