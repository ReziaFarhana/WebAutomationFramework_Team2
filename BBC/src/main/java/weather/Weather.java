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
        waitTimeExplicit(dropDown);
        clickByXpath(dropDown);
        waitTimeExplicit(weatherTab);
        clickByXpath(weatherTab);


    }

    public void openDropDown() {
        waitTimeExplicit(dropDown);
        clickByXpath(dropDown);


    }

    public void searchPhil() {
        weatherPage();
        searchBox.sendKeys(location);
        waitTimeExplicit(searchButtonLocator);
        searchButton.click();
        waitTimeExplicit(philButtonLocator);
        philButton.click();


    }

    public void scrollDown() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

    }

    public void weatherPageSettings() throws InterruptedException {
        waitTimeExplicit(dropDown);
        clickByXpath(dropDown);
        waitTimeExplicit(dropDown);
        clickByXpath(weatherTab);
        scrollDown();


    }

    public void weatherWarningsPage() throws InterruptedException {
        weatherPageSettings();
        waitTimeExplicit(weatherWarningsTab);
        clickByXpath(weatherWarningsTab);


    }
    public void floodWarningsPage() throws InterruptedException {
        weatherPageSettings();
        waitTimeExplicit(floodWarningsTab);
        clickByXpath(floodWarningsTab);


    }

    public void monthlyOutlookPage() throws InterruptedException {
        weatherPageSettings();
        waitTimeExplicit(monthlyOutlookTab);
        clickByXpath(monthlyOutlookTab);


    }

    public void coastAndSeaPage() throws InterruptedException {
        weatherPageSettings();
        waitTimeExplicit(coastAndSeaTab);
        clickByXpath(coastAndSeaTab);


    }



}
