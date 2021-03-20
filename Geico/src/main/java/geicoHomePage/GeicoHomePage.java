package geicoHomePage;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class GeicoHomePage extends WebAPI {

    @FindBy (xpath = "//*[@id=\"footer-links-secondary\"]/ul/li[4]/a")
    WebElement career;

    @FindBy (xpath = "/html/body/div[1]/section[2]/div/div/header/div/div/div[3]/nav/ul/li[1]/a/span/ppc-content")
    WebElement opportunities;

    @FindBy (xpath = "//*[@id=\"left-dropdown-home\"]/ul/li[1]/a/span[2]/ppc-content")
    WebElement careerOpportunities;

    @FindBy (xpath = "//*[@id=\"left-dropdown-home\"]/ul/li[1]/ul/li[4]/a/ppc-content")
    WebElement corporate;

    @FindBy(xpath ="//span[contains(text(),'Career Opportunities')]" )
    WebElement careerOpportunitiesText;

    @FindBy(xpath = "//*[@id=\"left-dropdown-home\"]/ul/li[1]/ul/li[5]/a/ppc-content")
    WebElement customerService;

    public void verifyCareerPageUrl(){

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1000)");
        career.click();

       String s= driver.getCurrentUrl();

     boolean b= s.contains("careers.geico.com");
     Assert.assertTrue(b);

     // Assert.assertEquals(b,"true");

        Assert.assertEquals(s,"https://careers.geico.com/us/en/");
    }

    public void verifyOppportuniesCareerIsClickable() throws InterruptedException {
//
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1000)");

        Thread.sleep(5000);

        career.click();

        Thread.sleep(5000);

        opportunities.click();
    }

    public void verifyMenusFromOpportunities() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1000)");

        career.click();
        opportunities.click();

        //mouseHoverByXpath("/html/body/div[1]/section[2]/div/div/header/div/div/div[3]/nav/ul/li[1]/a/span/ppc-content");

        Actions actions=new Actions(driver);

        actions.moveToElement(opportunities).perform();

        Thread.sleep(4000);
    }

    public void verifyCareerOpportunitiesText(){

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1000)");

        career.click();
        opportunities.click();

        careerOpportunities.click();
       String s= careerOpportunitiesText.getText();

       Assert.assertEquals(s,"Career Opportunities");

    }

    public void verifyCareerOpportunitiesAttribute(){

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1000)");

        career.click();
        opportunities.click();

        careerOpportunities.click();

        String s=careerOpportunitiesText.getAttribute("class");

        boolean b=s.contains("brand-color-primary");

        Assert.assertTrue(b);


    }

    public void verifyCustomerServiceIsClickable() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1000)");

        Thread.sleep(5000);

        career.click();
        Thread.sleep(5000);

        opportunities.click();
        
        customerService.click();
    }



}
