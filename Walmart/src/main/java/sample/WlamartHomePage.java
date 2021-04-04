package sample;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;

import static sample.WalmartHomePageWebElements.*;

public class WlamartHomePage extends WebAPI {

    WebAPI wa = new WebAPI();
    // Find By Annotation: First Approach
    @FindBy(how = How.XPATH, using = searchBoxLocator)
    public WebElement searchBox;
    @FindBy(how = How.XPATH, using = searchButtonLocator)
    public WebElement searchButton;
    @FindBy(how = How.XPATH, using = careers)
    public WebElement career;
    @FindBy(how = How.XPATH, using = allCareersArea)
    public WebElement allCareers;
    @FindBy(xpath = careersLocation)
    public WebElement careerLoc;
    @FindBy(xpath = walmartplusText)
    public WebElement walmartplusText1;
    @FindBy(xpath = Accounttab)
    public WebElement Accountabb;
    @FindBy(xpath = Samsclub)
    public WebElement Samscl;
    @FindBy(xpath = walmartplus)
    public WebElement wlmplus;
    @FindBy(xpath = walmrtplusText1)
    public WebElement wlmplus1;
    @FindBy(xpath = fifteendaysoff)
    public WebElement fiftenday;
    @FindBy(xpath = allcareerarea)
    public WebElement allCareerArea;
    @FindBy(xpath = jobTitle)
    public WebElement jobtitle;
      @FindBy(xpath = menutab)
    public WebElement menutab1;


    //  @FindBy (how = How.XPATH, using =searchTextLocator ) public WebElement searchText;

    // Action Method
    public void searchBox() throws InterruptedException {
        // Enter productName
        searchBox.sendKeys(productName);
        Thread.sleep(3000);
        // Click on searchButton
        searchButton.click();

    }

    public void Careers() throws InterruptedException {
        career.click();
        Thread.sleep(5000);
        allCareers.click();
        Thread.sleep(5000);


    }


    public void CareersLocations() throws InterruptedException {
        career.click();
        Thread.sleep(5000);
        allCareers.click();
        allCareers.wait();
        sleepFor(20);
        careerLoc.click();

    }


    public void Careerstab() throws InterruptedException {
        career.click();
        Thread.sleep(5000);
    }


    public void clickOnElement(String locator) {
        try {
            driver.findElement(By.cssSelector(walmartplus)).click();
        } catch (Exception ex) {
            try {
                driver.findElement(By.className(walmartplus)).click();
            } catch (Exception ex2) {
                try {
                    driver.findElement(By.id(walmartplus)).click();
                } catch (Exception ex3) {
                    driver.findElement(By.xpath(walmartplus)).click();
                }
            }
        }
    }

  /*      public void typeOnElement1(WebElement locator, String value) {
            try {
                Accountabb.sendKeys("mariaamiar90@gmail.com");
            } catch (Exception ex) {
                walmartplus.sendKeys(value);
            }*/


    public void brockenlink() throws IOException {
        WebAPI wp = new WebAPI();
        wp.brokenLink();
    }

    public void wlamrtplusTab() throws InterruptedException {
        wlmplus.click();
        wait(10);
        wlmplus1.getText();
    }

    public void fifteendaysofftab() throws InterruptedException {
        wlmplus.click();
        wlmplus1.click();
        fiftenday.click();


    }

    public void allCarreerArea() throws InterruptedException {
        career.click();
        Thread.sleep(5000);
        allCareerArea.click();


    }

    public void Jobtitle() throws InterruptedException {
        allCarreerArea();
        jobtitle.sendKeys("cashier");


    }


    public void menuTab(){
        menutab1.click();
    }





}



