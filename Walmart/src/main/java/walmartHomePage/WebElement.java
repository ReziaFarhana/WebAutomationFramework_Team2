package walmartHomePage;

import common.WebAPI;

public class WebElement  {


    //Walmart Account
    public static final String urlWalmart = "https://www.walmart.com/";
    public static final String searchBAr="//input[@aria-controls='global-search-dropdown']";

    //best seller dropdown
    public static final String bestSellerDD = "//select[@aria-label='Sort Filter']";
    public static final String searchBoxFilter = "//*[@id=\\\"Brand\\\"]/div/div/label[2]/div/span";
    public static final String iceCreamCartLink = "//*[@id=\"searchProductResult\"]/ul/li[6]/div/div[2]/div[7]/div/a/span";
    public static final String icecreamcartHover = "//*[@id=\"product-overview\"]/div/div[2]/div[2]/div/div/div/div/div[1]/button/span/div[2]/div[1]/div";
    public static final String icecreamcartHover2 = "mouseHoverByXpath(icecreamcartHover)";

    //STEM
    public static final String stemLink = "//*[@class='p_a p_l p_b' and text()='STEM']";
    public static final String toysGamesNVideoGames = "//*[@id=\"vh-department-menu\"]/button[7]";
    public static final String mainMenuDropDown = "//button[@id='header-Header-sparkButton']//img[@alt='null']";
    public static final String roboticsPageVerificaton = "//h1[normalize-space()='Robotics']";


    //Write excel
    public static final String firstName = "(//input[@type='text'][@name='firstName'])[1]";
    public static final String lastName = "(//input[@type='text'][@name='lastName'])[1]";
    public static final String email = "(//input[@type='email'][@name='email'])[1]";
    public static final String password = "(//input[@type='password'][@name='password'])[1]";

}
