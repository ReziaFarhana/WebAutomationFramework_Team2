package WalmartHomePage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static WalmartHomePage.webElement.*;


public class walmartBurgerMenu extends WebAPI {
    // @FindBy(how = How.XPATH,using = bestSellerDD) public WebElement bestseller;

    public void menuBarDropDown(){

        WebElement mainMenu = driver.findElement(By.xpath("//button[@id='header-Header-sparkButton']//img[@alt='null']"));
        mainMenu.click();
        //to click on Drop down menu for burger menu
        clickByXpath("//*[@id=\"vh-department-menu\"]/button[7]");
    }


    public void toysAndGames() throws InterruptedException {


        WebElement mainMenu = driver.findElement(By.xpath("//button[@id='header-Header-sparkButton']//img[@alt='null']"));
        mainMenu.click();
        //to click on Drop down menu for burger menu
        clickByXpath("//*[@id=\"vh-department-menu\"]/button[7]");

        //click on New Toys
        clickByXpath("//div[text()='New Toys']");
    }




    public void shopByAge() throws InterruptedException {

        toysAndGames();

        clickByXpath("//h2[text()='Shop by age']");


        //click on the Price button
        clickByXpath("//button[contains(text(),'Price')]");

        //click on text tab to enter 5$
        typeByXpath("//div[@class='flowtip-flyout-modal flowtip-flyout-modal-bottom']//input[@placeholder='Min']", "5");


        //type on text tab $50 and press enter
        typeOnInputBox("maxPrice", "50");


    }

    public void bestSellerDropDown() throws InterruptedException {

        //shopByAge();
        toysAndGames();


        WebElement bestSellerDropDown = driver.findElement(By.xpath(bestSellerDD));

        Select bestSeller = new Select(bestSellerDropDown);

        bestSeller.selectByVisibleText("Price: low to high");
        sleepFor(5);
        bestSeller.selectByVisibleText("Highest Rating");
        sleepFor(3);
        bestSeller.selectByVisibleText("New");
        sleepFor(3);
    }

    public void searchFilterBarNewToys() throws InterruptedException {
        toysAndGames();


        clickOnElement("//h2[text()='Shop by age']");
        //scrollDown();


        typeByXpath("//*[@id=\"facet-brand-search\"]", "leapfrog");
        sleepFor(2);

        checkBox("LeapFrog-0-brand");


        sleepFor(3);

    }

    public void leapFrogIceCreamLink() throws InterruptedException {


        searchFilterBarNewToys();
        sleepFor(1);
        driver.findElement((By.linkText("LeapFrog Scoop and Learn Ice Cream Cart, Play Kitchen Toy for Kids"))).click();

        //sleepFor(2);
//        mouseHoverByXpath(icecreamcartHover);
//        sleepFor(2);
//        mouseHoverByXpath(icecreamcartHover2);

//        WebElement hovereElement = driver.findElement(By.xpath(icecreamcartHover));
//        Actions action = new Actions(driver);
//        Actions hover = action.moveToElement(hovereElement);
//        hover.perform();
//        sleepFor(3);
    }


    public  void leapFrogAddTocart() throws InterruptedException {


       leapFrogIceCreamLink();
       //(16)How to select DropDown menu
        WebElement iceCcreamCartDropDown = driver.findElement(By.xpath("//select[@aria-label='Quantity']"));
       iceCcreamCartDropDown.click();
        Select iceCreamCart = new Select(iceCcreamCartDropDown);

        iceCreamCart.selectByVisibleText("2");
        sleepFor(2);

        clickByXpath("//*[@id=\"add-on-atc-container\"]/div[1]/section/div[1]/div[3]/button/span/span");
    }

    public void stemPage() throws InterruptedException {
        WebElement mainMenu = driver.findElement(By.xpath(mainMenuDropDown));
        mainMenu.click();
        //to click on Drop down menu for burger menu
        clickByXpath(toysGamesNVideoGames);
        clickByXpath(stemLink);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        sleepFor(2);



    }

    public void roboticsPageLink() throws InterruptedException {

        WebElement mainMenu = driver.findElement(By.xpath(mainMenuDropDown));
        mainMenu.click();
        //to click on Drop down menu for burger menu
        clickByXpath(toysGamesNVideoGames);
        clickByXpath(stemLink);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,4500)");
        clickByXpath("//*[@id=\"c45dbd8e-8f93-4f7c-a019-97a0f153aaca-tileLink-6\"]");

    }

    public void decorLink() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        //scrollDown(200);
        driver.findElement(By.linkText("Decor")).click();
    }

    public void searchBar() {

        nElementNEnter("//*[@id=\"global-search-input\"]", "Decor");
    }


    public void locationUpdate(){

        menuBarDropDown();
        clickByXpath("//*[@id=\"vh-location-button\"]");
        typeByXpath1("//*[@id=\"zipcode-location-form-input\"]","60564");
        clickByXpath("//*[@id=\"zipcode-location-form-input\"]");

    }
//--------------------------------------------------------------------------------------------------------------------)(
//        clickByXpath("//iframe[@id='iframe-contentZone16']");
//        sleepFor(2);
//        clickByXpath("//iframe[@id='iframe-contentZone16']");
//        sleepFor(2);



    public static void scrollDown(int height) {

        //scrolling method
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,height)");
    }

    public static void checkBox(String locator) {

        WebElement checkbox = driver.findElement(By.id(locator));
        checkbox.click();

    }
    public void scrollTo(WebElement element){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true)",element);
        // scrollIntoView(true)
    }





//        public void prac() {
//            selectOptionByVisibleText(bestseller, "book");
//        }




}



