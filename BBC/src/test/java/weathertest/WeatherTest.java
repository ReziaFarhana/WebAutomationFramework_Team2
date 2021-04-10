package weathertest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import weather.Weather;

import static weather.WeatherWebElement.*;


public class WeatherTest extends WebAPI {

    Weather weather;

    @BeforeMethod
    public void init() {
        weather = PageFactory.initElements(driver, Weather.class);

    }

    @Test
    public void headerTest() {
        weather.openDropDown();
        assertEqualByXpath(weatherTab, "Weather");

    }

    @Test
    public void titleTest() {
        weather.weatherPage();
        String expectedText = "BBC Weather";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Test failed");

    }


    @Test
    public void urlTest() {
        weather.weatherPage();
        String actualText = driver.getCurrentUrl();
        Assert.assertEquals(actualText, weatherPageUrl, "Test failed");

    }
    

    @Test
    public void SearchBoxFunctionTest() {
        weather.searchPhil();
        assertEqualByXpath(philName, location);
    }

    @Test
    public void naTest() {
        weather.weatherPage();
        assertEqualByXpath(naWeather, "North America weather");

    }

    @Test
    public void featuresTest() {
        weather.weatherPage();
        assertEqualByXpath(featuresTab, "Features");

    }

    @Test
    public void settingsTest() throws InterruptedException {
        weather.weatherPageSettings();
        assertEqualByXpath(settingsTab, "Settings");

    }

    @Test
    public void moreWeatherTest() throws InterruptedException {
        weather.weatherPageSettings();
        assertEqualByXpath(moreWeatherTab, "More Weather");

    }

    @Test
    public void languageSettingTest() throws InterruptedException {
        weather.weatherPageSettings();
        assertEqualByXpath(languageSetting, "Language:");

    }

    @Test
    public void temperatureSettingTest() throws InterruptedException {
        weather.weatherPageSettings();
        assertEqualByXpath(temperatureSetting, "Temperature:");

    }

    @Test
    public void windSpeedSettingTest() throws InterruptedException {
        weather.weatherPageSettings();
        assertEqualByXpath(windSpeedSetting, "Wind speed");

    }

    @Test
    public void weatherWarningsTabTest() throws InterruptedException {
        weather.weatherPageSettings();
        assertEqualByXpath(weatherWarningsTab, "Weather Warnings");

    }

    @Test
    public void weatherWarningsPageTest() throws InterruptedException {
        weather.weatherWarningsPage();
        String actualText = driver.getCurrentUrl();
        Assert.assertEquals(actualText, weatherWarningsPageUrl, "Test failed");

    }

    @Test
    public void weatherWarningsTitleTest() throws InterruptedException {
        weather.weatherWarningsPage();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, "BBC Weather", "Test failed");

    }

    @Test
    public void floodWarningsTabTest() throws InterruptedException {
        weather.weatherPageSettings();
        assertEqualByXpath(floodWarningsTab, "Flood Warnings");

    }
    @Test
    public void floodWarningsPageTest() throws InterruptedException {
        weather.floodWarningsPage();
        String actualText = driver.getCurrentUrl();
        Assert.assertEquals(actualText, floodWarningsPageUrl, "Test failed");

    }

    @Test
    public void floodWarningsTitleTest() throws InterruptedException {
        weather.floodWarningsPage();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, "BBC Weather", "Test failed");

    }

    @Test
    public void monthlyOutlookTabTest() throws InterruptedException {
        weather.weatherPageSettings();
        assertEqualByXpath(monthlyOutlookTab, "Monthly Outlook");

    }
    @Test
    public void monthlyOutlookPageTest() throws InterruptedException {
        weather.monthlyOutlookPage();
        String actualText = driver.getCurrentUrl();
        Assert.assertEquals(actualText, monthlyOutlookUrl, "Test failed");

    }

    @Test
    public void monthlyOutlookTitleTest() throws InterruptedException {
        weather.monthlyOutlookPage();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, "BBC Weather", "Test failed");

    }

    @Test
    public void coastAndSeaTabTest() throws InterruptedException {
        weather.weatherPageSettings();
        assertEqualByXpath(coastAndSeaTab, "Coast & Sea");

    }
    @Test
    public void coastAndSeaPageTest() throws InterruptedException {
        weather.coastAndSeaPage();
        String actualText = driver.getCurrentUrl();
        Assert.assertEquals(actualText, coastAndSeaUrl, "Test failed");

    }

    @Test
    public void coastAndSeaTitleTest() throws InterruptedException {
        weather.coastAndSeaPage();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, "Coast and Sea - BBC Weather", "Test failed");

    }







}
