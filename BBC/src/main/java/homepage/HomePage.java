package homepage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

    @FindBy(how= How.XPATH, using=videoiFrameXp) public WebElement videoiFrame;



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
    //scroll by using element; play video, pause video, navigate back to the last page
    public void newsNavBar() throws InterruptedException {
        clickByXpath(newsOptionXp);
        clickByXpath(scienceOptionXp);
        sleepFor(5);
        scrollByID(ourPlantNowId);
        clickByXpath(videoiFrameXp);
        sleepFor(10);
        navigateBack();
    }
    public void bbcInOtherLanguagesFooter(){
        scrollbyCSS(inOtherLanguagesCss);
        clickByXpath(soundsNav);
        scrollByXPATH(chillXp);
        clickByXpath(chillXp);
    }





}
