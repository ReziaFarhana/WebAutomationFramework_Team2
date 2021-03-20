package WalmartHomePage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class webElement extends WebAPI {


    //Walmart Account
    public static final String urlWalmart="https://www.walmart.com/";

    //best seller dropdown
    public static final String bestSellerDD="//select[@aria-label='Sort Filter']";
public static final String searchBoxFilter="//*[@id=\\\"Brand\\\"]/div/div/label[2]/div/span";
    public static final String iceCreamCartLink="//*[@id=\"searchProductResult\"]/ul/li[6]/div/div[2]/div[7]/div/a/span";
    public static final String icecreamcartHover="//*[@id=\"product-overview\"]/div/div[2]/div[2]/div/div/div/div/div[1]/button/span/div[2]/div[1]/div";
   public static final String icecreamcartHover2 =  "mouseHoverByXpath(icecreamcartHover)";

   //STEM
    public static final String stemLink="//*[@class='p_a p_l p_b' and text()='STEM']";
  public static final String  toysGamesNVideoGames="//*[@id=\"vh-department-menu\"]/button[7]";
  public static final String    mainMenuDropDown="//button[@id='header-Header-sparkButton']//img[@alt='null']";
   public static final String roboticsPageVerificaton ="//h1[normalize-space()='Robotics']";
//    public static final String
//    public static final String
//    public static final String



    //switch to new window handle
    public void windowHandle(){
        String parentHandle = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
        }
    }

}
