package bbcHomePage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class Destinations extends WebAPI {



    public void  destinationsPage() throws InterruptedException {
        //click on Travel
        driver.findElement(By.linkText("Travel")).click();

        sleepFor(1);
        //click on destinations
        driver.findElement(By.xpath("//*[@id=\"nav-top\"]/div/ul/li[5]/a/div")).click();
        //scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
    }

    public void africa() throws InterruptedException {

        destinationsPage();
        clickByXpath("//h3[normalize-space()='Africa']");
    }


    public void africaDestinations() throws InterruptedException {
        africa();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
        clickByXpath(WebElementHomePage.janeGoodman);
    }


    public void europe() throws InterruptedException {
        destinationsPage();
        clickByXpath("//h3[@class='section-title' and text()='Europe']");
    }

    public void ageOldAlpine() throws InterruptedException {

        europe();
        clickByXpath("//h3[normalize-space()='An age-old Alpine detox tradition']");
    }

    public void australiaAndPacific() throws InterruptedException {

        destinationsPage();
        clickByXpath("//h3[normalize-space()='Australia and Pacific']");

        //click on 50 reasons to love the world
       // clickByXpath("reasonsToLoveTheWorld2");

//        clickByXpath("startGallery");

//        clickByXpath("disappearReading");
//
//        clickByXpath("nextArrow");


    }
    public void australiaFood() throws InterruptedException {

        destinationsPage();
        clickByXpath("//*[text()='The baking traditions making a comeback'] ");


    }

    public void futureOfTravel() throws InterruptedException {

        destinationsPage();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,3000)");
    clickByXpath("//h3[normalize-space()='Future of Travel']");
    JavascriptExecutor je = (JavascriptExecutor) driver;
    je.executeScript("window.scrollBy(0,1500)");
}




//-------------------------------------------------------------------------------------------------

public static void scrollDown(int height) {

        //scrolling method
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,)");
    }
}