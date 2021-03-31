package sample;
import static sample.BBCWebElement.*;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BBCHome  extends WebAPI {
BBCWebElement key;

//Action method:
    @FindBy(how= How.XPATH,using =searchBoxLocator)public WebElement searchBox;
    @FindBy(how= How.XPATH,using =searchButtonLocator)public WebElement searchButton;

  //  public void clickByXpath1(String loc) {

  //   driver.findElement(By.xpath(loc)).click();
  //  }


//    public void clickOnElement1(String locator) {
//        try {
//            driver.findElement(By.cssSelector(locator)).click();



    public void musicLinkSection(){
clickByXpath(more);
clickByXpath(music);

    }

    public void wordNewsSection(){
        clickByXpath(more);
        clickByXpath(tv);
        clickByXpath(WordNews);
    }

public void weatherSection(){
        clickByXpath(more);
        clickByXpath(weather);
}

public void travelSection(){
        clickByXpath(more);
        clickByXpath(travel);
        clickByXpath(culture);
}

public void searchBoxSection() throws InterruptedException {
searchBox.sendKeys(productName);
sleepFor(2);
searchButton.click();
}

public void sportSection(){
     clickOnElement(sport);
     clickOnElement(sportText);
}
}
