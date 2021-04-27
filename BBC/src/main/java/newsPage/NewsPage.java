package newsPage;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.ExtentTestManager;

public class NewsPage extends WebAPI {


    @FindBy(xpath = "(//a[text()='News'])[1]") public WebElement newsPageLInk;
    @FindBy(css = "preserveAspect") public WebElement newsLogo;
    @FindBy(css = "input#orb-search-q") public WebElement searchField;
    @FindBy(css = "#orb-search-button") public WebElement searchButton;
    @FindBy(xpath = "(//a[text()='Travel'])[3]") public WebElement moveToTravelLink;
    @FindBy(css = "svg.ws-c-social-slice__icon.ws-c-social-slice__icon--facebook") public WebElement facebookLink;



    public void newsPageLink(){
        newsPageLInk.click();
        String actualResult=driver.getCurrentUrl();
        String expectedResult= "https://www.bbc.com/news";
        Assert.assertEquals(actualResult,expectedResult,"url did not match!");
    }

    public void validateLogo(){
        Assert.assertTrue(newsLogo.isDisplayed());
        System.out.println("News page logo landed properly");
    }

    public void searchFieldValidation(){
        searchField.sendKeys("News" );
        searchButton.click();
        driver.getCurrentUrl();
    }

    public void scrollDownJS(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,2500)");
    }

    public void moveToTravelLink(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0],scrollIntoView=(true)",moveToTravelLink);
    }

    public void navigateFunctionality(){
        driver.get("http://www.amazon.com");
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();
    }

    public void moiuseHoverOverNewsLink(){
        Actions actions = new Actions(driver);
        actions.moveToElement(newsPageLInk);
        newsPageLInk.click();
    }

    public void validateSocialMediaLink(){
        facebookLink.click();
        String actualResult=driver.getCurrentUrl();
        String expectedResult="https://www.facebook.com/bbcnews";
        Assert.assertEquals(actualResult,expectedResult);
    }



}
