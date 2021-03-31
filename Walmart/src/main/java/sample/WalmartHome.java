package sample;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

import static sample.WalmartWebElement.searchButtonLocator;

public class WalmartHome extends WebAPI {

 //Action method
 //Find by annotation

 //WebAPI wp = new WebAPI();
 //@FindBy(how=How.XPATH,using=searchBoxLocator )public WebElement searchBox;
 @FindBy(css = searchButtonLocator)
 public WebElement searchButton;


 public void brockenlink() throws IOException {
  WebAPI wp=new WebAPI();
  wp.brokenLink();
 }

}











