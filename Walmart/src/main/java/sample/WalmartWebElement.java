package sample;

import common.WebAPI;
import org.openqa.selenium.By;

public class WalmartWebElement {


    // WebElement class for Locators only and some other properties

//    public static final String searchBarLocator="//input[@id='global-search-input']";
//    public static final String productName="Coronavirus";
//    public static final String searchButtonLocator="button[id='global-search-submit'] img[alt='null']";
//    public static final String savingsSpotLight="//div[@class='b_a p_a p_o p_g af_a b_f']//button[1]";
//    public static final String shopHome="//*[@id=\"cp-top-module-2\"]/nav/ul/li[1]/h2/a";

    //********************************
    public static final String productName="Hand Sanitizer";
    public static final String searchBoxLocator="//input[@id='global-search-input']";
    public static final String searchButtonLocator="//*[@id=\"global-search-submit\"]/span/img";
    public static final String searchTextLocator="//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]";
    public static final String pickUpAndDelivery="a[title='Pickup & delivery'] span[class='g_b']";
    public static final String walmartLocator = "Walmart.com";
    public static final String myItems = "//span[@class='NavigationPanel__headerLabel___gRqK4'][normalize-space()='My Items']";
    public static final String myItems2 = "//span[contains(text(),'My Items')]";
    public static final String byAgain = "//a[normalize-space()='Buy again']";
    public static final String lists = "//span[@class='LinkTabs-tab text-center font-bold active']";
    public static final String walmartServices= "//div[@class='p_a p_n']//span[@class='x_a x_i x_b'][normalize-space()='Walmart Services']";
    public static final String walmart= "//a[normalize-space()='Walmart+']";
    public static final String groceryPickUpAndDelivery= "//a[normalize-space()='Walmart+']";


}
