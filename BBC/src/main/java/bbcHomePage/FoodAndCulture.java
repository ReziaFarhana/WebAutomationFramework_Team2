package bbcHomePage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class FoodAndCulture extends WebAPI {

    public void foodPage() throws InterruptedException {
        //click on Travel
        driver.findElement(By.linkText("bbcHomePage")).click();

        sleepFor(1);
        //click on food
        driver.findElement(By.cssSelector(WebElementHomePage.foodButton)).click();



    }
    public void milkBar() throws InterruptedException {

        foodPage();
        clickByXpath("//h3[text()='Where people go to bars to drink milk']");

    }

    public void poorMansBurger() throws InterruptedException {

        foodPage();

        clickByXpath("//h3[text()=\"A 'poor man’s burger' McDonald's stole\"]");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
        sleepFor(2);
    }



    public void japaneseFruitFood() throws InterruptedException {
        foodPage();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");
        clickByXpath("//h3[text()='The Jamaican fruit that could kill you']");

    }

    public void riceShapedAmerica() throws InterruptedException {

        foodPage();
       // JavascriptExecutor js = (JavascriptExecutor) driver;
       // js.executeScript("window.scrollBy(0,1500)");
        clickByCss(WebElementHomePage.riceShaped);
        sleepFor(2);
    }




//----------------------------------------------------------------------------------------------

    //CULTURE

    public void cutlurePage() throws InterruptedException {

        //click on Travel
        driver.findElement(By.linkText("bbcHomePage")).click();

        sleepFor(1);
        // click on culture tab
        clickByXpath("//a[@href='/travel/columns/culture-identity']//div[@class='line1']");
    }

    public void harmoniousNation() throws InterruptedException {

        cutlurePage();
        clickByXpath("//h3[@class='promo-unit-title'  and text()= 'Is this Asia’s most harmonious nation?']");
    }
        public void scroll() {


            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,3000)");
        }


}
