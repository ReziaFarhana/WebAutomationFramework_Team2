package homePage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class GeicoHomePage extends WebAPI {

    @FindBy(xpath = "//span[@class='icon-chevron-down']//parent::a[@data-link-name='header-left-links:Insurance']")
    public WebElement insuranceLink;
    @FindBy(xpath = "//div[@class='panel-wrapper open']//li[@data-name='Vehicle Insurance']")
    public WebElement insuranceLinkDropDown;
    @FindBy(css = "a.icon-geico.not-open") public WebElement geicoLogo;
    @FindBy(css = "#zip") public WebElement zipCodeBox;
    @FindBy(css = "a#geolocation") public WebElement locationButton;
    @FindBy(xpath = "//a[@data-link-name='accessibility-main-content:Make a payment']")
    public WebElement makePaymentLocator;
    @FindBy(css = "div.select-box") public WebElement phoneNumberSelect;
    @FindBy(xpath = "(//div[@class='card-selections-content content-space-around'])[2]//parent::div//span[@class='checkbox']")
    public WebElement rentersCheckBox;
    @FindBy(css = "button#Id_ComboActivity_86928Button") public WebElement nextbutton;
    @FindBy(css = "span[role='search") public WebElement searchButton;
    @FindBy(xpath = "(//input[@type='text'])[3]") public WebElement searchField;
    @FindBy(xpath = "//li[@data-value='Vehicle']/label/div") public WebElement vehicleOption;
    @FindBy(xpath = "(//div[@class='coveo-facet-value-label-wrapper'])[2]//parent::label/")
    public WebElement propertyOption;
    @FindBy(xpath = "//select[@id='manage_select']/option") public WebElement loginDropDown;
    @FindBy(xpath = "//a[@class='login header-right-label']") public WebElement loginButton;






    public void validateInsueranceLink(){
        insuranceLink.click();
        String data = insuranceLinkDropDown.getText();
        System.out.println(data);
    }

    public void validateHomePage(){
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertTrue(geicoLogo.isDisplayed());
    }

    public void searchWithZip() throws InterruptedException {
        zipCodeBox.sendKeys("11421");
        locationButton.click();
//        driver.switchTo().alert().accept();
//        Thread.sleep(5000);
    }

    public void scrollDownJS(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,2500)");
    }

    public void scrolldownToElement(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true)",makePaymentLocator);
        makePaymentLocator.click();
    }

    public void formFillUp(){
        phoneNumberSelect.click();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .pause(Duration.ofSeconds(3))
                .sendKeys("7183165777")
                .sendKeys(Keys.TAB)
                .sendKeys("11421")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .pause(Duration.ofSeconds(3))
                .sendKeys(Keys.ENTER).build().perform();
    }

    public void checkBox(){
        zipCodeBox.sendKeys("11421");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER);
        rentersCheckBox.click();
        nextbutton.click();
    }

    public void searchFieldFunctionality(){
        searchButton.click();
        searchField.sendKeys("auto insurance");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER);
        vehicleOption.click();
        propertyOption.click();
        vehicleOption.click();
        propertyOption.click();
    }

    public void loginDropDown(){
        loginButton.click();
        loginDropDown.click();
        String data = loginDropDown.getText();
        List<WebElement> dropdown = driver.findElements(By.xpath("//a[@class='login header-right-label']"));
        System.out.println(dropdown);
        dropdown.get(5).click();

    }



}
