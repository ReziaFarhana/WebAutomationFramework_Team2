package weather;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static music.MusicWebElement.dropDown;
import static weather.WeatherWebElement.*;


public class Weather extends WebAPI {

    @FindBy(id = searchBoxLocator)
    public WebElement searchBox;
    @FindBy(xpath = searchButtonLocator)
    public WebElement searchButton;
    @FindBy(xpath = philButtonLocator)
    public WebElement philButton;


    public void weatherPage() {
        clickByXpath(dropDown);
        clickByXpath(weatherTab);


    }

    public void openDropDown() {
        clickByXpath(dropDown);


    }

    public void searchPhil() {
        weatherPage();
        searchBox.sendKeys(location);
        searchButton.click();
        philButton.click();


    }

    public void scrollDown() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

    }

    public void weatherPageSettings() throws InterruptedException {
        clickByXpath(dropDown);
        clickByXpath(weatherTab);
        scrollDown();


    }

    public void weatherWarningsPage() throws InterruptedException {
        weatherPageSettings();
        clickByXpath(weatherWarningsTab);


    }
    public void floodWarningsPage() throws InterruptedException {
        weatherPageSettings();
        clickByXpath(floodWarningsTab);


    }

    public void monthlyOutlookPage() throws InterruptedException {
        weatherPageSettings();
        clickByXpath(monthlyOutlookTab);


    }

    public void coastAndSeaPage() throws InterruptedException {
        weatherPageSettings();
        clickByXpath(coastAndSeaTab);


    }



}
