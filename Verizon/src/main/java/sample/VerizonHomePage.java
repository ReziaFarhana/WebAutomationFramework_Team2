package sample;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;

import static sample.VerizonWebElement.*;

public class VerizonHomePage extends WebAPI {

    //Action Method class:

    @FindBy(how= How.XPATH, using =searchBoxLocator) public WebElement searchBox;
    @FindBy(how=How.CSS,using =searchButtonLocator) public WebElement searchButton;

   // @FindBy(how = How.XPATH, using = searchBoxLocator)
   // public WebElement searchBox;
    //@FindBy(how = How.CSS, using = searchButtonLocator)
   // public WebElement searchButton;
    // @FindBy(how = How.CSS, using = productName)
    @FindBy(how = How.XPATH, using = PRODUCTS)
    public WebElement product;
    @FindBy(how=How.XPATH,using =TABLETS) public WebElement tablets;
    @FindBy(how=How.XPATH,using =STORES) public WebElement stores;

    public void searchBox() throws InterruptedException, IOException {
        searchBox.sendKeys(productName);
        Thread.sleep(3000);
        // searchBox.click();




    }
        public void brokenLink() throws IOException {
            WebAPI wp = new WebAPI();
            wp.brokenLink();
        }

        public void productSection() throws InterruptedException {
            sleepFor(2);
            mouseHoverByXpath(PRODUCTS);
            sleepFor(10);
        }

        public void planSection()throws InterruptedException {
            sleepFor(2);
            mouseHoverByXpath(PLAN);
            sleepFor(10);

        }

        public void solutionsSection() throws InterruptedException {
            sleepFor(3);
            mouseHoverByXpath(SOLUTIONS);
            sleepFor(10);

        }

        public void resourcesSection() throws InterruptedException {
            sleepFor(3);
            mouseHoverByXpath(RESOURCES);
            sleepFor(10);
        }

        public void contactUsSection() throws InterruptedException {
            sleepFor(2);
            mouseHoverByXpath(CONTACTUS);
            sleepFor(10);
        }

        public void whyVerizonSection() throws InterruptedException {
            sleepFor(2);
            mouseHoverByXpath(WHYVERIZON);
            sleepFor(10);
        }

        public void clickOnHealthCareSection(){
            clickByXpath(HEALTHCARE);

        }

        public void tabletsSection() throws InterruptedException {

            Thread.sleep(3000);
            tabletsSection();
            tablets.getText();

        }

        public void storesSection() throws InterruptedException {

            Thread.sleep(3000);
            tabletsSection();
            stores.click();
        }
    }









