package homepage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

    public void weatherOptionnNavBar(){
        clickOnElement(moreOptionClass);
        clickByXpath(weatherxP);

    }
    //uncommitted
    public void musicOptionNavBar() throws InterruptedException {
        clickOnElement(moreOptionClass);
        clickByCss(musicOptionCss);
        sleepFor(4);
        clickByXpath(musicBurgerMenuXp);
        sleepFor(3);
        clickByXpath(filmOptionXp);
    }
    //getting image using selenium
    public void identitiesOptionCultureNav() throws InterruptedException {
        musicOptionNavBar();
        clickByXpath(identitiesOptionXp);
        getImage(gettyImgCss,gettyPgTitle);
    }
    public void newsNavBar(){
        clickByXpath(newsOptionXp);
        clickByXpath(scienceOptionXp);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000);");
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");


    }




}
